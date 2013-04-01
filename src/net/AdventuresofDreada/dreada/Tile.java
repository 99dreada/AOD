package net.AdventuresofDreada.dreada;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Tile {

	public static int size = 32;
	public static BufferedImage terrain, background, items, characters;
	
	public Tile(){
		
		try{
			Tile.background = ImageIO.read(new File("res/bg.png"));
			Tile.terrain = ImageIO.read(new File("res/terrain.png"));
			Tile.characters = ImageIO.read(new File("res/chars.png"));
			Tile.items = ImageIO.read(new File("res/items.png"));
			
			
		}catch(Exception e){
			System.out.println("Error Loading Imagees");
		}
		
	}
	
}
