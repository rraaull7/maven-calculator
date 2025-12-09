package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMin {
	public static String run(String input) {

		int[] nums = ParserUtils.parseInts(input);
		if (nums == null)
			return "Error: formato inválido";
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
				
			}
		}

		return String.valueOf(min);

	}
}
