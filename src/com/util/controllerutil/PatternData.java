package com.util.controllerutil;

public interface PatternData {
	 String email = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	 String phone = "^[7-9][0-9]{9}$";
	 String password = "^[0-9a-zA-Z]{8,16}$";
	 String pinCod = "^\\d{3}\\s?\\d{3}$";
}
