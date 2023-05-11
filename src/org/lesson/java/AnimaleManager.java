package org.lesson.java;

import org.lesson.java.interf.iNuotante;
import org.lesson.java.interf.iVolante;

public class AnimaleManager {
	public void faiVolare(iVolante animale) {
		animale.vola();
	}
	
	public void faiNuotare(iNuotante animale) {
		animale.nuota();
	}
}
