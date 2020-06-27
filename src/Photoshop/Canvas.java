package Photoshop;

public class Canvas {
    public ToolType currentTool;



    public void mouseDown(){
        if (currentTool == ToolType.SELECTION){
        System.out.println("Selection Icon");
        }
        if (currentTool == ToolType.BRUSH){
        System.out.println("Brush icon");
        }
        if (currentTool == ToolType.EREASER){
        System.out.println("Eraser Icon");
        }
    }

    public void mouseUp(){
        if (currentTool == ToolType.SELECTION){
            System.out.println("Draw dashed rectangle");
        }
        if (currentTool == ToolType.BRUSH){
            System.out.println("Draw a line");
        }
        if (currentTool == ToolType.EREASER){
            System.out.println("Erase something");
        }
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
