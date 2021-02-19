package fr.enissay.animals;

import fr.enissay.i.Animal;
import fr.enissay.i.AnimalInfo;

@AnimalInfo(ID = 2, isFavourite = true)
public class Cat implements Animal {

	@Override
	public String name() {
		return "Cat";
	}

	@Override
	public void sendCall() {
		System.out.println("The animal " + name() + " has been added to the List");
	}
}
