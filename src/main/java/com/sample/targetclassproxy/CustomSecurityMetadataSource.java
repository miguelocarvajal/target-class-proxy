package com.sample.targetclassproxy;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;

import org.springframework.data.repository.Repository;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.method.AbstractMethodSecurityMetadataSource;

public class CustomSecurityMetadataSource extends AbstractMethodSecurityMetadataSource {
    public Collection<ConfigAttribute> getAttributes(Method method, Class<?> targetClass) {
        //Expect MyRepository in targetClass here

        if (Repository.class.isAssignableFrom(method.getDeclaringClass())) {
            System.out.println("targetClass proxy: " + targetClass);
            System.out.println("method: " + method);
            System.out.println();
        }

        return Collections.emptyList();
    }

    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }
}