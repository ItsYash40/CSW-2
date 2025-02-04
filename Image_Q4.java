class Image_Q4 {
    // Attributes
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    public Image_Q4() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "Unknown";
    }

    public Image_Q4(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
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

    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public String getColorCode() {
        return colorCode;
    }

    @Override
    public String toString() {
        return "Image [Width: " + imageWidth + ", Height: " + imageHeight + ", Color Code: " + colorCode + "]";
    }
    public static void main(String[] args) {
    	Image_Q4 image1 = new Image_Q4();
        System.out.println("Details of Image1 (using default constructor): " + image1);

        Image_Q4 image2 = new Image_Q4(1920, 1080, "#FFFFFF");
        System.out.println("Details of Image2 (using parameterized constructor): " + image2);

        image1.setImageWidth(800);
        image1.setImageHeight(600);
        image1.setColorCode("#FF5733");
        System.out.println("Updated details of Image1: " + image1);
    }
}
