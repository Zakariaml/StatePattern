package Photoshop;

public class Canvas {
    public ToolType currentTool;

    public Canvas(ToolType currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
