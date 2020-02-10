package api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public interface GetEnv {

    default String getEnv(String property) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/env.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(property);
    }
}
