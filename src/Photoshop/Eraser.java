package Photoshop;

public class Eraser implements ToolType{
    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase Something");
    }
}
