package fr.enissay.abstractmodules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import fr.enissay.abstractmodules.exceptions.ModuleNotFoundException;

public class ModuleManager {

	/**
	 * List of the modules
	 */
	private List<Module> modules = new ArrayList<>();

	/**
	 * 
	 * Function to add a module
	 * 
	 * @param module
	 * @return this
	 * @throws ModuleNotFoundException
	 */
	@SuppressWarnings("unused")
	public ModuleManager addModule(final Collection<? extends Module> module) throws ModuleNotFoundException {

		final Module theModule = module.stream().findAny().get();
		
		if (module != null && (!this.modules.contains(theModule))) {
			this.modules.addAll(module);
		} else if (module == null)
			throw new ModuleNotFoundException("The module has not been found !");

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
