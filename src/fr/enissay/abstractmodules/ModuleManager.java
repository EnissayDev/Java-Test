package fr.enissay.abstractmodules;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.enissay.abstractmodules.exceptions.ModuleNotFoundException;

public class ModuleManager {

	private List<Module> modules = new ArrayList<>();

	/**
	 * 
	 * Function to add a module
	 * 
	 * @param module
	 * @return this
	 * @throws ModuleNotFoundException
	 */
	public ModuleManager addModule(final Module module) throws ModuleNotFoundException {

		if (module != null && (!this.modules.contains(module))) {
			this.modules.add(module);
		} else if (module == null)
			throw new ModuleNotFoundException("The module is null is not found !");

		return this;
	}

	/**
	 * 
	 * To get all the Modules but the ID have to be > than 0
	 * 
	 * @return modules
	 */
	public List<Module> getModules() {
		return this.modules.stream().filter(Module.class::isInstance).map(Module.class::cast)
				.filter(module -> module.ID() > 0).collect(Collectors.toList());
	}
}
