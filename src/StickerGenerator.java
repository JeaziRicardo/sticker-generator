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
    }
}
