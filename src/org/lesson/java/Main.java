package org.lesson.java;

import org.lesson.java.obj.Animale;
import org.lesson.java.obj.Aquila;
import org.lesson.java.obj.Cane;
import org.lesson.java.obj.Delfino;
import org.lesson.java.obj.Passerotto;

public class Main {
	public static void main(String[] args) {
		Cane c = new Cane();
		Passerotto p = new Passerotto();
		Aquila a = new Aquila();
		Delfino d = new Delfino();
		
		Animale[] animals = {c, p, a, d};
		
		for(int i = 0; i < animals.length; i++) {
			Animale animale = animals[i];
			System.out.print(animale + " -> ");
			System.out.println(animale.verso());
		}
	}
}
