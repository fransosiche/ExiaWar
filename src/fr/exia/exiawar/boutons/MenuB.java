package fr.exia.exiawar.boutons;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.enums.EnumAffichage;

public class MenuB extends Bouton {

	public MenuB(int x, int y, int width, int height, Affichage affichage) {
		super(x, y, width, height, "Menu", affichage);
	}

	public void action() {
		if (affichage.getAffichage() == EnumAffichage.Options) {
			affichage.setAffichage(EnumAffichage.Menu);
		}
	}

	public void action(Graphics2D g2d) {

	}
	
	public void dessiner(Graphics2D g2d) {
		if (isLocked == false) {
			if (isFocus == false) {
				g2d.setColor(Color.BLACK);
				g2d.draw(getRect());
			} else {
				int thickness = 3;
				g2d.setColor(Color.BLUE);
				g2d.fill(new Rectangle(x - thickness, y - thickness, width + thickness * 2, height + thickness * 2));
				g2d.clearRect(x, y, width, height);
			}
		} else {
			g2d.setColor(Color.BLACK);
			g2d.draw(getRect());

			int widthCadenas = 19;
			int heightCadenas = 25;

			g2d.drawImage(new ImageIcon("cadenas.png").getImage(), x - widthCadenas - 5,
					y + height / 2 - heightCadenas / 2, widthCadenas, heightCadenas, null);
		}

		g2d.setFont(new Font(Affichage.POLICE, Font.BOLD, 20));
		String UPtext = text.toUpperCase();

		int widthTxt = (int) g2d.getFontMetrics().getStringBounds(UPtext, g2d).getWidth();
		int heightTxt = (int) g2d.getFontMetrics().getStringBounds(UPtext, g2d).getHeight();

		g2d.drawString(UPtext, x + width / 2 - widthTxt / 2, y + height / 2 + heightTxt / 3);
	}

}
