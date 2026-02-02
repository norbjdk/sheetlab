package com.norbdev.desktop.util;

import com.norbdev.desktop.config.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class PropertiesFileUtil {
    public Properties loadProperties(String fileName) {
        try (InputStream input = new FileInputStream(Objects.requireNonNull(getClass().getResource(Constants.appPath)).toExternalForm())){
            Properties properties = new Properties();

            properties.load(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
