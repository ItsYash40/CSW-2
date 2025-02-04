import java.util.ArrayList;
import java.util.List;

class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "#000000"; 
    }

    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return "Image Details: \n" +
                "Width: " + imageWidth + " px\n" +
                "Height: " + imageHeight + " px\n" +
                "Color Code: " + colorCode;
    }
}

class ImageLibrary {
    private List<Image> images;

    public ImageLibrary() {
        this.images = new ArrayList<>();
    }

    public void insertImage(Image image) {
        images.add(image);
    }

    public Image searchImage(String colorCode) {
        for (Image image : images) {
            if (image.getColorCode().equalsIgnoreCase(colorCode)) {
                return image;
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

    public void displayAllImages() {
        for (Image image : images) {
            System.out.println(image.toString());
        }
    }
}

class ImageController {
    public static void main(String[] args) {
        ImageLibrary imageLibrary = new ImageLibrary();

        Image image1 = new Image(1920, 1080, "#FF5733");
        Image image2 = new Image(1280, 720, "#33FF57");
        Image image3 = new Image(800, 600, "#3357FF");

        imageLibrary.insertImage(image1);
        imageLibrary.insertImage(image2);
        imageLibrary.insertImage(image3);

        System.out.println("Displaying all images:");
        imageLibrary.displayAllImages();

        String searchColorCode = "#33FF57";
        Image searchResult = imageLibrary.searchImage(searchColorCode);
        if (searchResult != null) {
            System.out.println("\nImage found with color code " + searchColorCode + ":");
            System.out.println(searchResult.toString());
        } else {
            System.out.println("\nNo image found with color code " + searchColorCode);
        }

        int index = 1;
        Image getImageResult = imageLibrary.getImage(index);
        if (getImageResult != null) {
            System.out.println("\nImage at index " + index + ":");
            System.out.println(getImageResult.toString());
        } else {
            System.out.println("\nNo image found at index " + index);
        }
    }
}
