package fr.enissay.abstractmodules;

public abstract class Module implements IModule{

	private ObjectCall objCall;
	
	/**
	 * 
	 * Set the object call
	 * so it can be called
	 * 
	 * @param objCall
	 */
	public void setObjectCall(ObjectCall objCall) {
		this.objCall = objCall;
	}

	/**
	 * 
	 * To get the object call
	 * 
	 * @return objCall
	 */
	public ObjectCall getObjectCall() {
		return objCall;
	}
	
	public void call() {
		if (objCall == null) return;
		objCall.onCall(this);
	}
	
	@Override
	public String toString() {
		return moduleName();
	}
	
}
