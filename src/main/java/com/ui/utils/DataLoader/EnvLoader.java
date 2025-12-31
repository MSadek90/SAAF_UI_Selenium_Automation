package com.ui.utils.DataLoader;

import java.io.InputStream;
import java.util.Properties;

public class EnvLoader {
    

    private static Properties properties = new Properties();

    static {
        try {
            InputStream input =
                    EnvLoader.class.getClassLoader().getResourceAsStream("env.properties");

            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load env.properties file");
        }
    }

    public static String getBaseUrl() {
        String env = properties.getProperty("env");
        return properties.getProperty("base.url." + env);
    }

}
