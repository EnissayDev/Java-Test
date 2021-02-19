package fr.enissay.abstractmodules;

public abstract class ModuleException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public ModuleException(String message) {
		super(message);
	}
	
	public ModuleException(String message, Throwable cause) {
	    super(message, cause);
	}
}
