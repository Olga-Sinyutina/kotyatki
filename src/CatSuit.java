public class CatSuit {
    private String ColorSuit = "Pink";

    public void setColorSuit(String colorSuit) {
        this.ColorSuit = colorSuit;
    }

    public String getColorSuit() {
        return ColorSuit;
    }

    public void printColorSuit() {
        System.out.println("The cat is wearing a " + ColorSuit + " suit , mi-mi-mi");
    }
}
