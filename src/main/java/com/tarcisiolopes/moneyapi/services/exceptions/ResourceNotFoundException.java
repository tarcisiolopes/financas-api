package com.tarcisiolopes.moneyapi.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object codigo) {
		super("Resource not found. Id "+codigo);
	}
}
