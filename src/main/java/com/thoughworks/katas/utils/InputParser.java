package com.thoughworks.katas.utils;

import com.thoughworks.katas.railways.Town;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class InputParser {

    public String[] readGraphInputFile(String fileName) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(fileName);

        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        String input = scanner.hasNext() ? scanner.next() : "";
        scanner.close();
        String[] result = input.split("\\r?\\n");

        //This would still allow to put AE7 and AE8
        // -> add filter for duplicates AB
        String[] resultWithoutDuplicates = Arrays.stream(result).distinct().toArray(s -> new String[s]);

        return resultWithoutDuplicates;
    }

    public String[] readRouteInputFile(String fileName) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(fileName);
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        String input = scanner.hasNext() ? scanner.next() : "";
        scanner.close();
        String[] routes = input.split("\\r?\\n");

        return routes;
    }
}
