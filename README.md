/**
     * 这个方法的作用是将jwt实体类转换为对应的controller的
     * @param jwt
     * @return
     */
    @Override
    public Collection<GrantedAuthority> convert(Jwt jwt) {
        Collection<GrantedAuthority> authorities = defaultConverter.convert(jwt);
        
        // 在这里插入您的自定义验证逻辑，例如检查Token是否在黑名单中
        if (isTokenBlacklisted(jwt)) {
            throw new JwtException("Token is blacklisted");
        }

        return authorities;
    }

    /**
     * 从这里进行判断对应的逻辑实现，包括Redis中每个用户的5个token策略，拉黑（先进先出）等策略的放行实现
     * @param jwt 这个应该是spring中从request头中获取的token，（也可能包含签发时间、过期时间等）
     * @return 当前token是否通过对应的逻辑
     */
    private boolean isTokenBlacklisted(Jwt jwt) {
        // 实现Token黑名单检查逻辑
        // 这里是一个示例，返回false表示Token不在黑名单中
        return false;
    }

    /** 
	* @Author: cy
	* @Date: 2024/8/2 上午10:41
	* @Description: 配置JwtAuthenticationConverter使用自定义的GrantedAuthoritiesConverter
	*/
	@Bean
	public JwtAuthenticationConverter customJwtAuthenticationConverter() {
		JwtAuthenticationConverter converter = new JwtAuthenticationConverter();
		converter.setJwtGrantedAuthoritiesConverter(new CustomGrantedAuthoritiesConverter());
		return converter;
	}

/*
 * Copyright 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.contest.auth;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;

import java.util.concurrent.ConcurrentHashMap;

public class CustomUserDetailsService implements UserDetailsManager {

    private final ConcurrentHashMap<String, UserDetails> users = new ConcurrentHashMap<>();

    @Override
    public void createUser(UserDetails user) {
        //以后这个东西肯定是走redis的
        this.users.put(user.getUsername(), user);
    }

    @Override
    public void updateUser(UserDetails user) {
        this.users.put(user.getUsername(), user);
    }

    @Override
    public void deleteUser(String username) {
        //包括这个删除也是，或者在redis中设置ttl
        this.users.remove(username);
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        throw new UnsupportedOperationException("Change password not supported");
    }

    @Override
    public boolean userExists(String username) {
        //这个就是从正易张俊林那边写一个判断Redis中是否存在的代码
        return this.users.containsKey(username);
    }

    /**
     * 这个方法是用于返回对应的用户的，我这里设置的是无论谁都可以登录，进行放行获得token
     * @param username 用户在页面或者basic中输入的用户名（密码）
     * @return 验证成功的用户（后期要通过数据库中查用户才能返回），本身这个用户是经过spring默认的内存存储的，但是我这里直接返回，不做this.createUser()的操作
     * @throws UsernameNotFoundException 对应的异常，这里不可能出现，因为已经注释了
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //region 这里是直接创建用户的
        System.out.println(username + "这个是用户输入的username吧，所以说，只要根据它加的，直接注册就好了，本质上还是内存啊，那么客户端其实也可以的");
        /*this.createUser(User.withUsername(username)
                .password("{noop}" + username)
                .authorities("ROLE_USER")
                .build());
        //endregion 这里是直接创建用户的
        UserDetails user = this.users.get(username);
        //说白了，这里的其实可以不用保存，直接创就好了，这样子内存都不用存....等等，张俊林好像就是直接返回的user对象，最后还是正解了吗？
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }*/
        this.users.keySet().forEach(System.out::println);
        return User.withUsername(username)
                .password("{noop}" + username)
                .authorities("ROLE_USER")
                .build();
    }
}
