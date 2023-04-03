import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class StickerGenerator {
    

    public void generate(InputStream inputImage) throws Exception {

        BufferedImage originalImg = ImageIO.read(inputImage);

        int imgWidth = originalImg.getWidth();
        int imgHeight = originalImg.getHeight();
        int newHeight = imgHeight + 200;
        BufferedImage newImg = new BufferedImage(imgWidth, newHeight, BufferedImage.TRANSLUCENT);

        Graphics2D graphics = (Graphics2D) newImg.getGraphics();
        graphics.drawImage(originalImg, 0, 0, null);

        var font = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(font);
    }
}
