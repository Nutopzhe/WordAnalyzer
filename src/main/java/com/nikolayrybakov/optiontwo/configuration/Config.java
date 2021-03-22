package com.nikolayrybakov.optiontwo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.nikolayrybakov.optiontwo")
@EnableWebMvc
public class Config {
}
