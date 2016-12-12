package com.egencia.webapp.users.common.utils;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * The Class CommonConfiguration.
 */
@Configuration
public class CommonConfiguration {
    
    /** The environment. */
    @Inject private Environment environment;
    
    /**
     * Sets the environment.
     *
     * @param environment the new environment
     */
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    
    /**
     * Gets the string property.
     *
     * @param key the key
     * @return the string property
     */
    public String getStringProperty(String key) {
        
        return environment.getProperty(key, String.class);
    }
    
}
