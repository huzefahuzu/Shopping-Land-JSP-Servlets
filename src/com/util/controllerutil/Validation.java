package com.util.controllerutil;

public class Validation {

	public static boolean isEmpty(String validateString) {
		return (validateString == "-1" || validateString == null || validateString
				.trim().length() == 0);
	}

	public static boolean isValidate(String validateString, String PATTERN_REGEX) {
		return !validateString.matches(PATTERN_REGEX);
	}
}
