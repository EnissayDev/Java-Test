package fr.enissay.abstractmodules.modules;

import fr.enissay.abstractmodules.Module;

public class ModuleTest extends Module {

	@Override
	public String moduleName() {
		return "ModuleTest";
	}

	@Override
	public Integer ID() {
		return 1;
	}
}
