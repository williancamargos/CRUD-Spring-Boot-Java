package com.example.progamacaoweb.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Não foi localizado o usuário com a id" + id);
		
	}
	

}
