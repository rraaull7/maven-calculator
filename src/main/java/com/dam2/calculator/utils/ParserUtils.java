package com.dam2.calculator.utils;

public class ParserUtils {
	
	public static int[] parseInts(String input) {
        String s = (input == null) ? "" : input.trim();
        if (s.isEmpty()) return null;
        String[] parts = s.split("\\s+");
        int[] out = new int[parts.length];
        try {
            for (int i = 0; i < parts.length; i++) out[i] = Integer.parseInt(parts[i]);
            return out;
        } catch (Exception e) {
            return null;
        }
    }

}
