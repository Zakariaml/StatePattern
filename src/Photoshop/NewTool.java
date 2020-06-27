package Photoshop;

public class NewTool implements ToolType{
    @Override
    public void mouseDown() {
        System.out.println("The new Tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("Something with the new Tool");
    }
}
