
package com.nestlings.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author ú
 */
@Configuration
@EnableWebMvc
@PropertySources(
        {
                @PropertySource(value="classpath:nestlings.member.query.properties"),
                @PropertySource(value="classpath:nestlings.lookup.query.properties"),
                @PropertySource(value="classpath:nestlings.auth.query.properties"),
                @PropertySource(value="classpath:nestlings.university.query.properties"),
                @PropertySource(value="classpath:nestlings.friend.query.properties"),
                @PropertySource(value="classpath:nestlings.config.properties"),
                @PropertySource(value="classpath:nestlings.appbuider.query.properties"),
                @PropertySource(value="classpath:nestlings.messaging.query.properties"),
                @PropertySource(value="classpath:nestlings.status.query.properties"),
                @PropertySource(value="classpath:nestlings.notifications.query.properties"),
                @PropertySource(value="classpath:nestlings.college.application.query.properties")
        }
)
public class NestlingsPropertyInitConfig extends WebMvcConfigurerAdapter {
    
}
