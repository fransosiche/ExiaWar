package fr.exia.exiawar.ecran;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import fr.exia.exiawar.enums.EnumAffichage;

public class Affichage extends JPanel {

	private static final long serialVersionUID = -994965329985547793L;

	private EnumAffichage affichage;

	public Affichage() {
		this.affichage = EnumAffichage.Menu;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (affichage == EnumAffichage.Menu) {
			
		} else if (affichage == EnumAffichage.Jeux) {
			
		} else if (affichage == EnumAffichage.Options) {
			
		}
	}

}
