package Laba2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class logo extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	
	public logo() {
		
			try {
				image = ImageIO.read(getClass().getClassLoader().getResource("logo.png"));
			}
			catch(IOException e) {
				e.printStackTrace();
			}
	}

	public void paintComponent(Graphics g){
		if(image == null) return;
		
		g.drawImage(image, 0, 0, 100, 150, null);
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
