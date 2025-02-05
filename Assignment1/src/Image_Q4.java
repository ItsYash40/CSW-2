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
    public int getImageWidth() {    return imageWidth;    }
    public int getImageHeight() {  return imageHeight;   }
    public String getColorCode() {   return colorCode;   }
    public void setImageWidth(int imageWidth) {  this.imageWidth = imageWidth;  }
    public void setImageHeight(int imageHeight) {   this.imageHeight = imageHeight;   }
    public void setColorCode(String colorCode) {   this.colorCode = colorCode;   }    @Override
    public String toString() {
    return "Image [Width: " + imageWidth + ", Height: " + imageHeight + ", Color Code: " + colorCode + "]"; }
}
public class Image_Q4 {
    public static void main(String[] args) {
        Image img1 = new Image();
        System.out.println("Default Constructor Image:");
        System.out.println(img1);
        Image img2 = new Image(1920, 1080, "#FF5733");
        System.out.println("\nParameterized Constructor Image:");
        System.out.println(img2);  }
    }

