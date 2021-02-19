package fr.enissay.abstractmodules;

import lombok.Getter;
import lombok.Setter;

public abstract class Module implements IModule {

	@Getter @Setter
	public ObjectCall objectCall;
	
	/**
	 * 
	 * Used to make a callback
	 * for all the Modules extending this
	 * abstract class
	 * 
	 */
	public void Call() {
		if (objectCall == null) return;
		objectCall.onCall(this);
		
	}
	
	@Override
	public String toString() {
		return "Module{" +
		        "moduleName=" + moduleName() +
		        ", ID=" + ID() +
		        '}';
	}
	
}
