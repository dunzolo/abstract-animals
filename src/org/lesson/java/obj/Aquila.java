package org.lesson.java.obj;

import org.lesson.java.interf.iVolante;

public class Aquila extends Animale implements iVolante{

	@Override
	public String verso() { return "Strido"; }

	@Override
	public String mangia() { return "Piccoli animali"; }
	
	@Override
	public String toString() { return "(Aquila)"; }

	@Override
	public void vola() { System.out.println("Sto volando!"); }

}
