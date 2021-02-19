package fr.enissay.abstractmodules;

public abstract class ModuleException extends Exception {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * The Constructor of the class
	 * 
	 * @param message 
	 */
	public ModuleException(final String message) {
		super(message);
	}
	
	public ModuleException(final String message, final Throwable cause) {
	    super(message, cause);
	}
}
