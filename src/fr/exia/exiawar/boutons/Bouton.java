package fr.exia.exiawar.boutons;

import java.awt.Rectangle;
import java.util.ArrayList;

import fr.exia.exiawar.ecran.Affichage;
import fr.exia.exiawar.interfaces.IBoutonAction;
import fr.exia.exiawar.interfaces.IDessiner;

public abstract class Bouton implements IDessiner, IBoutonAction {

	protected int x, y, width, height;
	protected String text;
	protected boolean isFocus, isLocked;

	protected Affichage affichage;

	public static ArrayList<Bouton> boutons = new ArrayList<Bouton>();

	public Bouton(int x, int y, int width, int height, String text, Affichage affichage) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.text = text;
		this.isFocus = false;
		this.affichage = affichage;
		this.isLocked = false;
		boutons.add(this);
	}

	public Bouton(int x, int y, int width, int height, String text, boolean isLocked, Affichage affichage) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.text = text;
		this.isFocus = false;
		this.affichage = affichage;
		this.isLocked = isLocked;
		boutons.add(this);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Rectangle getRect() {
		return new Rectangle(x, y, width, height);
	}

	public boolean isFocus() {
		return isFocus;
	}

	public void setFocus(boolean isFocus) {
		this.isFocus = isFocus;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

}
