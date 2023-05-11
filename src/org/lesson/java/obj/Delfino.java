package org.lesson.java.obj;

import org.lesson.java.interf.iNuotante;

public class Delfino extends Animale implements iNuotante{

	@Override
	public String verso() { return "Ultrasuono"; }

	@Override
	public String mangia() { return "Pesci"; }
	
	@Override
	public String toString() { return "(Delfino)"; }

	@Override
	public void nuota() { System.out.println("Sto nuotando!");}

}
