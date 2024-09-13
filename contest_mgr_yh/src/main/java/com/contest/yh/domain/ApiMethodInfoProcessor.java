package com.contest.yh.domain;

import jakarta.annotation.PostConstruct;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@Component
public class ApiMethodInfoProcessor {

    private final ApplicationContext context;

    public ApiMethodInfoProcessor(ApplicationContext context) {
        this.context = context;
    }

//    @PostConstruct
    public void processApiMethodInfo() throws NoSuchMethodException {
        String[] beanNames = context.getBeanNamesForAnnotation(RestController.class);

        for (String beanName : beanNames) {
            Class<?> clazz = context.getType(beanName);
            if (clazz != null) {
                for (Method method : clazz.getDeclaredMethods()) {
                    ApiMethodInfo apiMethodInfo = AnnotationUtils.findAnnotation(method, ApiMethodInfo.class);
                    if (apiMethodInfo != null) {
                        // 获取方法名
                        String methodName = method.getName();

                        // 获取 Controller 类上的路径
                        String classPath = "";
                        RequestMapping classRequestMapping = AnnotationUtils.findAnnotation(clazz, RequestMapping.class);
                        if (classRequestMapping != null && classRequestMapping.value().length > 0) {
                            classPath = String.join("", classRequestMapping.value());
                        }

                        // 获取方法上的路径
                        String methodPath = "";
                        RequestMapping requestMapping = AnnotationUtils.findAnnotation(method, RequestMapping.class);
                        if (requestMapping != null && requestMapping.value().length > 0) {
                            methodPath = String.join("", requestMapping.value());
                        } else {
                            GetMapping getMapping = AnnotationUtils.findAnnotation(method, GetMapping.class);
                            if (getMapping != null && getMapping.value().length > 0) {
                                methodPath = String.join("", getMapping.value());
                            } else {
                                PostMapping postMapping = AnnotationUtils.findAnnotation(method, PostMapping.class);
                                if (postMapping != null && postMapping.value().length > 0) {
                                    methodPath = String.join("", postMapping.value());
                                }
                            }
                        }

                        // 拼接 Controller 类路径和方法路径
                        String fullPath = classPath + methodPath;

                        // 打印信息
                        System.out.println("Method Name: " + methodName);
                        System.out.println("Path: " + fullPath);
                        System.out.println("Description: " + apiMethodInfo.description());
                        System.out.println("-------------");
                    }
                }
        }
        }
    }
}
