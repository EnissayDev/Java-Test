package fr.enissay.abstractmodules.exceptions;

import fr.enissay.abstractmodules.ModuleException;

public class ModuleNotFoundException extends ModuleException {
	
	private static final long serialVersionUID = 1L;

	public ModuleNotFoundException(String message) {
		super(message);
	}

}
