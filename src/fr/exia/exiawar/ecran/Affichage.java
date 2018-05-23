package fr.exia.exiawar.ecran;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import fr.exia.exiawar.ecran.affichages.Jeux;
import fr.exia.exiawar.ecran.affichages.Menu;
import fr.exia.exiawar.ecran.affichages.Options;
import fr.exia.exiawar.enums.EnumAffichage;

public class Affichage extends JPanel implements Observer {

	private static final long serialVersionUID = -994965329985547793L;

	private EnumAffichage affichage;

	public static final String POLICE = "Century Gothic";

	public Affichage() {
		this.affichage = EnumAffichage.Menu;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (this.affichage == EnumAffichage.Menu) {
			Menu menu = new Menu();
			menu.dessiner(g2d);

		} else if (this.affichage == EnumAffichage.Jeux) {
			new Jeux();

		} else if (this.affichage == EnumAffichage.Options) {
			new Options();

		}
	}

	public void update(Observable arg0, Object arg1) {
		this.repaint();
	}

}
