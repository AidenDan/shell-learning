package com.example.shelllearing.config.ShellConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2021-4-3 11:52:35
 */

@Configuration
@PropertySource(value = {"classpath:shell-${spring.profiles.active}.properties"})
public class ShellConfig {
}
