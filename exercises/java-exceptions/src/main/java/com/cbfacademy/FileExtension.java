package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    // Custom exception class for filename errors
    public static class FilenameException extends RuntimeException {
        public FilenameException(String message) {
            super(message);
        }
    }

    // Method to check if a filename ends with .java
    public boolean check(String filename) {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename cannot be null or empty");
        }
        return filename.endsWith(".java");
    }

    // Method to map filenames to a result (1 if true, 0 if false, -1 if exception occurs)
    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String filename : filenames) {
            try {
                boolean isJavaFile = check(filename);
                resultMap.put(filename, isJavaFile ? 1 : 0);
            } catch (FilenameException e) {
                resultMap.put(filename, -1);
            }
        }

        return resultMap;
    }
}