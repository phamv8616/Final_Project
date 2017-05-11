package graph;

import java.awt.*;
public class SimpleDrawingTool extends Frame{

    public SimpleDrawingTool() {
        //set frame's title
        super("Simple Drawing Tool");
        //set frame size
        this.setSize(400, 400);
        //make this frame visible
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleDrawingTool simpleDrawingTool = new SimpleDrawingTool();
    }

}