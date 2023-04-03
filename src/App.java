import java.io.InputStream;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {
        StickerGenerator generator = new StickerGenerator();
        InputStream inputImage = 
                        new URL("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@.jpg")
                        .openStream();
        generator.generate(inputImage, "sticker.png");
    }
}
