package level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import level.tile.Tile;

public class SpawnLevel extends Level  {
	
	private Tile[] tiles;
	private int[] levelPixels;
	
	public SpawnLevel(String path){
		super(path);
	}
	
	protected void LoadLevel(String path){
		try{
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			tiles = new Tile[w * h];
			image.getRGB(0, 0, w, h, levelPixels, 0, w);
		} catch(IOException e){
			e.printStackTrace();
			System.out.println("Exception! Could not load level file");
			
		}
	}
	
	//We can set pixels in a png document such that they are read by this method
	//and form a map
	protected void generateLevel(){
		for(int i = 0; i < levelPixels.length; i++){
			//if(levelPixels[i] == color code ) tiles[i] = Tile.grass;
		}
	}

}
