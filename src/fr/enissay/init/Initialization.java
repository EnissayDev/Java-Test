package fr.enissay.init;

import java.util.Arrays;
import java.util.LinkedList;

import fr.enissay.abstractmodules.Module;
import fr.enissay.abstractmodules.ModuleManager;
import fr.enissay.abstractmodules.exceptions.ModuleNotFoundException;
import fr.enissay.abstractmodules.modules.ModuleTest;
import fr.enissay.abstractmodules.modules.ModuleTest2;
import fr.enissay.animals.Bird;
import fr.enissay.animals.Cat;
import fr.enissay.animals.Cow;
import fr.enissay.animals.Dog;
import fr.enissay.animals.Goat;
import fr.enissay.i.Animal;
import fr.enissay.i.Animals;

public class Initialization {
	
	public static void init() {
		// Adding Animals and Modules
		final Animals animals = new Animals().addAnimal(new Dog(), new Cat(), new Bird(), new Goat(), new Cow());

		ModuleManager mm = null;
		try {
			mm = new ModuleManager().addModule(Arrays.asList(new ModuleTest(), new ModuleTest2()));

		} catch (ModuleNotFoundException e) {
			e.printStackTrace();
		}

		final LinkedList<Module> modules = new LinkedList<>(mm.getModules());

		// Setup the Call for the Modules
		modules.forEach(module -> module
				.setObjectCall((theModule) -> System.out.println("call for the module " + theModule.moduleName() + "#"
						+ (modules.indexOf(theModule) + 1) + " with real ID #" + theModule.ID())));

		// Calls for both Modules and Animals (annotation + function)
		modules.forEach(Module::Call);
		animals.getAnimals().forEach(Animal::sendCall);

		animals.getAnimals().forEach(animal -> System.out.println(" Animal: " + (animal != null ? animal.name() : "???")
				+ " | ID: "
				+ (animals.getAnimalAnnotationInfo(animal) != null ? animals.getAnimalAnnotationInfo(animal).id()
						: "???")
				+ " | Favourite ?: "
				+ (animals.getAnimalAnnotationInfo(animal) != null
						? animals.getAnimalAnnotationInfo(animal).isFavourite()
						: "???")));
	}

}
