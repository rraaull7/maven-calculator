package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class opMedia {
	public static String run(String input) {
		int[] nums = ParserUtils.parseInts(input);
		if (nums == null)
			return "Error: formato inválido";
		if (nums.length < 2)
			return "Error: media necesita almenos 2 números";
		int resultado = mediaBuena(nums);
		System.out.println("la media es" + resultado);
		
		 return String.valueOf(resultado);
	}

	public static int mediaBuena(int[] media) {

		int suma = 0;
		for (int i = 0; i < media.length; i++) {
			suma += media[i];
		}
		return suma / media.length;
	}
}
