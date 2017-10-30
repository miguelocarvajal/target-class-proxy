package com.sample.targetclassproxy;

import org.springframework.security.access.method.MethodSecurityMetadataSource;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends GlobalMethodSecurityConfiguration {
    @Override
    public MethodSecurityMetadataSource customMethodSecurityMetadataSource() {
        return new CustomSecurityMetadataSource();
    }
}
