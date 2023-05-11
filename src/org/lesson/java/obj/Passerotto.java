package org.lesson.java.obj;

import org.lesson.java.interf.iVolante;

public class Passerotto extends Animale implements iVolante{

	@Override
	public String verso() { return "Cinguetta"; }

	@Override
	public String mangia() { return "Foglie"; }
	
	@Override
	public void vola() { System.out.println("Sto volando!"); }
	
	@Override
	public String toString() { return "(Passerotto)"; }
}
