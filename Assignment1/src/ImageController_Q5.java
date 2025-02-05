import java.util.ArrayList;
import java.util.List;
class ImageLibrary {
    private List<Image> images;
    public ImageLibrary() {
        images = new ArrayList<>();
    } 
    public void insertImage(Image image) {    images.add(image);   }
    public Image searchImage(String colorCode) {
        for (Image img : images) {
            if (img.getColorCode().equalsIgnoreCase(colorCode)) {   
            	return img; 
            	}   
            } 
        return null; 
    }
    public Image getImage(int index) {
        if (index >= 0 && index < images.size()) {
            return images.get(index);
        }
        return null; 
    }
    public void displayImages() {
        for (Image img : images) {   System.out.println(img);  }
    }
}
public class ImageController_Q5 {
    public static void main(String[] args) {
        ImageLibrary library = new ImageLibrary();
        Image img1 = new Image(1920, 1080, "#FF5733");
        Image img2 = new Image(1280, 720, "#33FF57");
        Image img3 = new Image(800, 600, "#5733FF");
        library.insertImage(img1);
        library.insertImage(img2);
        library.insertImage(img3);
        System.out.println("All Images in Library:");
        library.displayImages();
        String searchColor = "#33FF57";
        Image foundImage = library.searchImage(searchColor);
        if (foundImage != null) {
            System.out.println("\nImage with color " + searchColor + " found: " + foundImage);
        } else {
            System.out.println("\nImage with color " + searchColor + " not found.");
        }
    }
}

