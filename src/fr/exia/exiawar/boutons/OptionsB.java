package fr.exia.exiawar.boutons;

import java.awt.Graphics2D;

import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.enums.EnumAffichage;

public class OptionsB extends Bouton{

	public OptionsB(int x, int y, int width, int height, Affichage affichage) {
		super(x, y, width, height, "optionS", affichage);
		// TODO Auto-generated constructor stub
	}

	public void action() {
		if(affichage.getAffichage() == EnumAffichage.Menu)
		{
			affichage.setAffichage(EnumAffichage.Options);
		}
		
	}

	public void action(Graphics2D g2d) {
		// TODO Auto-generated method stub
		
	}

}
