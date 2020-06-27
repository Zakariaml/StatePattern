package Photoshop;

public class main {

    public static void main(String[] args) {
        Canvas icon = new Canvas(new Selection());
        icon.mouseDown();
        icon.mouseUp();
        icon.setCurrentTool(new NewTool());
        icon.mouseDown();
        icon.mouseUp();
    }


}
