package Photoshop;

public class main {

    public static void main(String[] args) {
        Canvas icon = new Canvas();
        icon.currentTool = ToolType.SELECTION;
        icon.mouseDown();
        icon.mouseUp();
    }


}
