package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMax {

	public static String run(String input) {
        
		 int[] nums = ParserUtils.parseInts(input);
	        if (nums == null) return "Error: formato inválido";
	        if (nums.length != 2) return "Error: sub necesita exactamente 2 números";

		
		
        int resultado =opMax(nums);
        return String.valueOf(resultado);

    }

    public static int opMax(int[] m) {
        int max = m[0];               
        for (int i = 1; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
        return max;                   
    }
}
