
import javafx.scene.shape.Circle;
import processing.core.*;

public class ExampleApplet extends PApplet {

    public static void main(String args[]) {
        PApplet.main("ExampleApplet");
    }
    ////////////////////////////////
    //my variables:
    float xPosition=1;
    float yPosition=1;
    int xSpd=1;
    int ySpd=1;
    ////////////////////////////////
    @Override
    public void settings() {
        // TODO: Customize screen size and so on here
        size(1000, 600);
    }

    @Override
    public void setup() {
        // TODO: Your custom drawing and setup on applet start belongs here
        //this happens once (kinda like arduino!)
        clear();
        frameRate(60);
        float horiz=0;

    }

    @Override
    public void draw() {
        // TODO: Do your drawing for each frame here
        //This is loop!
        //clear();
        if ((int)xPosition >= width ||(int)xPosition <= 0){
            xSpd=xSpd*-1;
        }
        xPosition=xPosition+xSpd;

        if ((int)yPosition >= height ||(int)yPosition <= 0){
            ySpd=ySpd*-1;
        }
        yPosition=yPosition+ySpd;



        ellipse(xPosition, yPosition, 33, 33);

        //yPosition++;


    }
}
