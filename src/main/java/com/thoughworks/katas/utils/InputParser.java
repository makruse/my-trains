package com.thoughworks.katas.utils;

import java.io.InputStream;
import java.util.Scanner;

public class InputParser {

    public String[] readFile(String fileName) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(fileName);

        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        String input = scanner.hasNext() ? scanner.next() : "";
        scanner.close();

        return input.split("\\r?\\n");
    }
}
