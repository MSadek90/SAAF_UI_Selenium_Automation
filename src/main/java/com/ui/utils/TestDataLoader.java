package com.ui.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Utility class for loading test data from JSON files
 */
public class TestDataLoader {
    
    private static final String TEST_DATA_PATH = System.getProperty("user.dir") + "/src/test/resources/testdata/";
    private static final Gson gson = new Gson();
    private static final LoggerUtil logger = LoggerUtil.getLogger(TestDataLoader.class);
    
    /**
     * Load test data from JSON file
     * @param fileName Name of the JSON file
     * @param classType Class type to deserialize to
     * @return List of objects
     */
    public <T> List<T> loadTestData(String fileName, Class<T> classType) {
        String filePath = TEST_DATA_PATH + fileName;
        
        try (Reader reader = new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8)) {
            Type listType = TypeToken.getParameterized(List.class, classType).getType();
            List<T> testData = gson.fromJson(reader, listType);
            if (testData != null) {
                logger.info("Loaded " + testData.size() + " test cases from: " + fileName);
            } else {
                logger.warn("Loaded null test data from: " + fileName);
            }
            return testData;
        } catch (IOException e) {
            logger.error("Failed to load test data from: " + filePath, e);
            throw new RuntimeException("Failed to load test data", e);
        }
    }
    
    /**
     * Load single test data object from JSON file
     * @param fileName Name of the JSON file
     * @param classType Class type to deserialize to
     * @return Object
     */
    public static <T> T loadSingleTestData(String fileName, Class<T> classType) {
        String filePath = TEST_DATA_PATH + fileName;
        
        try (Reader reader = new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8)) {
            T testData = gson.fromJson(reader, classType);
            if (testData != null) {
                logger.info("Loaded test data from: " + fileName);
            } else {
                logger.warn("Loaded null test object from: " + fileName);
            }
            return testData;
        } catch (IOException e) {
            logger.error("Failed to load test data from: " + filePath, e);
            throw new RuntimeException("Failed to load test data", e);
        }
    }
    
    /**
     * Convert JSON string to object
     */
    public static <T> T fromJson(String json, Class<T> classType) {
        return gson.fromJson(json, classType);
    }
    
    /**
     * Convert object to JSON string
     */
    public static String toJson(Object object) {
        return gson.toJson(object);
    }
}
