package com.contest.yh.config;


import com.contest.yh.security.CustomReactiveAuthorizationManager;
import com.contest.yh.security.CustomServerAccessDeniedHandler;
import com.contest.yh.security.CustomServerAuthenticationEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.security.web.server.SecurityWebFilterChain;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * <h1>安全认证配置</h1>
 * Created by hanqf on 2020/11/19 10:26.
 */


@Configuration
@EnableWebFluxSecurity //非必要
@EnableReactiveMethodSecurity //启用@PreAuthorize注解配置
public class ReactiveSecurityConfig {


    @Autowired
    private CustomServerAccessDeniedHandler customServerAccessDeniedHandler;

    @Autowired
    private CustomServerAuthenticationEntryPoint customServerAuthenticationEntryPoint;

    @Autowired
    private CustomReactiveAuthorizationManager customReactiveAuthorizationManager;

    /**
     * 注册安全验证规则
     * 配置方式与HttpSecurity基本一致
     */
    /*@Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) { //定义SecurityWebFilterChain对安全进行控制，使用ServerHttpSecurity构造过滤器链；
        return http.authorizeExchange()
                //.anyExchange().authenticated() //所有请求都需要通过认证
                .pathMatchers("/res/**", "/userInfo/**").authenticated()
                //需要具备相应的角色才能访问
                .pathMatchers("/user/**").hasAnyRole("admin", "user")
                //不需要登录就可以访问
                .pathMatchers("/swagger-ui/**", "/v3/api-docs**").permitAll()

                //其它路径需要根据指定的方法判断是否有权限访问，基于权限管理模型认证
                .anyExchange().access(customReactiveAuthorizationManager)
                .and()
                .csrf().disable() //关闭CSRF（Cross-site request forgery）跨站请求伪造
                .httpBasic().disable() //不支持HTTP Basic方式登录
                .formLogin().disable()//不支持login页面登录
                .cors() //开启跨域支持
                .and()
                
                //鉴权时只支持Bearer Token的形式，不支持url后加参数access_token
                .oauth2ResourceServer()//开启oauth2资源认证
                .jwt() //token为jwt
                //默认情况下，权限是scope，而我们希望使用的是用户的角色，所以这里需要通过转换器进行处理
                .jwtAuthenticationConverter(jwt -> { //通过自定义Converter来指定权限，Converter是函数接口，当前上下问参数为JWT对象
                    Collection<SimpleGrantedAuthority> authorities =
                            ((Collection<String>) jwt.getClaims()
                                    .get("authorities")).stream() //获取JWT中的authorities
                                    .map(SimpleGrantedAuthority::new)
                                    .collect(Collectors.toSet());

                    //如果希望保留scope的权限，可以取出scope数据然后合并到一起，这样因为不是以ROLE_开头，所以需要使用hasAuthority('SCOPE_any')的形式
                    Collection<SimpleGrantedAuthority> scopes = ((Collection<String>) jwt.getClaims()
                            .get("scope")).stream().map(scope -> new SimpleGrantedAuthority("SCOPE_" + scope))
                            .collect(Collectors.toSet());
                    //合并权限
                    authorities.addAll(scopes);
                    return Mono.just(new JwtAuthenticationToken(jwt, authorities));
                })
                .and()
                .accessDeniedHandler(customServerAccessDeniedHandler)
                .authenticationEntryPoint(customServerAuthenticationEntryPoint)
                .and().build();
    }*/

    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) { //定义SecurityWebFilterChain对安全进行控制，使用ServerHttpSecurity构造过滤器链；
        return http
                // 其他安全配置...
                .authorizeExchange((exchanges) ->
                        exchanges
                //.anyExchange().authenticated() //所有请求都需要通过认证
                .pathMatchers("/res/**", "/userInfo/**").authenticated()
                //需要具备相应的角色才能访问
                .pathMatchers("/user/**").hasAnyRole("admin", "user")
                //不需要登录就可以访问
                .pathMatchers("/swagger-ui/**", "/v3/api-docs**").permitAll()
                //其它路径需要根据指定的方法判断是否有权限访问，基于权限管理模型认证
                .anyExchange().access(customReactiveAuthorizationManager)
                )
                .csrf(ServerHttpSecurity.CsrfSpec::disable) //关闭CSRF（Cross-site request forgery）跨站请求伪造
                .httpBasic(ServerHttpSecurity.HttpBasicSpec::disable) //不支持HTTP Basic方式登录
                .formLogin(ServerHttpSecurity.FormLoginSpec::disable)//不支持login页面登录
                .cors(Customizer.withDefaults()) //开启跨域支持
                //鉴权时只支持Bearer Token的形式，不支持url后加参数access_token
                .oauth2ResourceServer(oAuth2ResourceServerSpec -> oAuth2ResourceServerSpec.jwt(jwtSpec -> jwtSpec.jwtAuthenticationConverter(jwt -> { //通过自定义Converter来指定权限，Converter是函数接口，当前上下问参数为JWT对象
                            Collection<SimpleGrantedAuthority> authorities = new HashSet<>();
                            Object authoritiesClaim = jwt.getClaims().get("authorities");
                            if (authoritiesClaim instanceof Collection<?>) {
                                authorities = ((Collection<?>) authoritiesClaim).stream()
                                        .filter(String.class::isInstance) // 确保元素是 String 类型
                                        .map(String.class::cast) // 转换为 String
                                        .map(SimpleGrantedAuthority::new) // 转换为 SimpleGrantedAuthority
                                        .collect(Collectors.toSet());
                            }
                            //如果希望保留scope的权限，可以取出scope数据然后合并到一起，这样因为不是以ROLE_开头，所以需要使用hasAuthority('SCOPE_any')的形式
                            Collection<SimpleGrantedAuthority> scopes = new HashSet<>();
                            Object scopesClaim = jwt.getClaims().get("scope");
                            if (scopesClaim instanceof Collection<?>) {//获取JWT中的authorities
                                scopes = ((Collection<?>) scopesClaim).stream()
                                        .filter(String.class::isInstance) // 确保元素是 String 类型
                                        .map(String.class::cast) // 转换为 String
                                        .map(scope -> new SimpleGrantedAuthority("SCOPE_" + scope)) // 转换为 SimpleGrantedAuthority
                                        .collect(Collectors.toSet());//token为jwt
                            }//默认情况下，权限是scope，而我们希望使用的是用户的角色，所以这里需要通过转换器进行处理
                            // 合并权限
                            authorities.addAll(scopes);
                            return Mono.just(new JwtAuthenticationToken(jwt, authorities));
                })).accessDeniedHandler(customServerAccessDeniedHandler)
                        .authenticationEntryPoint(customServerAuthenticationEntryPoint)).build();//开启oauth2资源认证
    }

    /**
     * 注册安全验证规则
     * 配置方式与HttpSecurity基本一致
     */
    /*@Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) { //定义SecurityWebFilterChain对安全进行控制，使用ServerHttpSecurity构造过滤器链；
         return http
                // 其他安全配置...
                .authorizeExchange((exchanges) ->
                        exchanges
                                // 任何以 /admin/ 开头的URL都需要用户具有 "ROLE_ADMIN" 角色
                                .pathMatchers("/admin/**").hasRole("ADMIN")

                                // 对 /users 的 POST 请求需要用户具有 "USER_POST" 权限
                                .pathMatchers(HttpMethod.POST, "/users").hasAuthority("USER_POST")

                                // 对 /users/{username} 的请求，需要当前认证用户的用户名与 {username} 相同
                                .pathMatchers("/users/{username}").access((authentication, context) ->
                                        authentication
                                                .map(Authentication::getName)  // 获取当前认证用户的用户名
                                                .map((username) -> username.equals(context.getVariables().get("username"))) // 比较用户名
                                                .map(AuthorizationDecision::new)  // 返回认证决策
                                )

                                // 使用自定义匹配策略，需要用户具有 "ROLE_CUSTOM" 角色
                                .matchers(exchange -> {
                                    // 自定义匹配逻辑
                                    // 例如：检查请求路径是否包含某个特定的路径片段
                                    String path = exchange.getRequest().getURI().getPath();
                                    if (path.contains("/custom-path")) {
                                        return ServerWebExchangeMatcher.MatchResult.match();
                                    }
                                    return ServerWebExchangeMatcher.MatchResult.notMatch();
                                }).hasRole("CUSTOM")

                                // 其他任何请求都需要用户认证
                                .anyExchange().authenticated()
                ).build();
    }*/


    /**
     * 缓存用户权限信息，测试时可以使用
     */
//    @Bean
//    ReactiveUserDetailsService reactiveUserDetailsService() {
//        User.UserBuilder builder = User.builder().passwordEncoder(passwordEncoder()::encode);
//        UserDetails userDetails1 = builder.username("admin").password("123456").roles("admin").build();
//        UserDetails userDetails2 = builder.username("user").password("123456").roles("user").build();
//
//        MapReactiveUserDetailsService mapReactiveUserDetailsService = new MapReactiveUserDetailsService(userDetails1, userDetails2);
//        return mapReactiveUserDetailsService;
//    }

    /**
     * 注册PasswordEncoder
     */
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

}


