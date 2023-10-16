package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        LinkedHashMap<Integer, Integer> elementCount = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
