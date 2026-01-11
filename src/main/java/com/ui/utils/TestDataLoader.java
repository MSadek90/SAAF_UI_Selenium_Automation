package com.ui.utils;

import com.google.gson.Gson;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;



public class TestDataLoader {


    private static final Gson gson = new Gson();

    public static <T> T loadDataFromJsonFiles(String filePath, Class<T> classType) {



    try (FileInputStream file = new FileInputStream(filePath);
         Reader reader = new InputStreamReader(file, StandardCharsets.UTF_8)) {

        return gson.fromJson(reader, classType);




    } catch (IOException e) {
        throw new RuntimeException("Failed to load Test Data: " + e.getMessage(), e);
    }

}
    

}
