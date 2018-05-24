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

	private Menu menu;
	private Jeux jeux;
	private Options options;

	private int width;
	private int height;

	public static final String POLICE = "Century Gothic";

	public Affichage(int width, int height) {
		this.affichage = EnumAffichage.Menu;
		this.width = width;
		this.height = height;

		menu = new Menu(width, height);
		jeux = new Jeux(width, height);
		options = new Options(width, height);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		clear(g2d);
		if (this.affichage == EnumAffichage.Menu) {
			menu.dessiner(g2d);
		} else if (this.affichage == EnumAffichage.Jeux) {
			jeux.dessiner(g2d);
		} else if (this.affichage == EnumAffichage.Options) {
			options.dessiner(g2d);
		}
	}

	public void clear(Graphics2D g2d) {
		g2d.clearRect(0, 0, width, height);
	}

	public void update(Observable arg0, Object arg1) {
		this.repaint();
	}

}
