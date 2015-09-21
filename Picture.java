/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square sky;
    private Square ground;
    private Square trunk;
    private Square trunk2;
    private Circle leaves;
    private Circle leaves2;
    private Circle bush1;
    private Circle bush2;
    private Person link;
    private Triangle hat;
    private Triangle tf1;
    private Triangle tf2;
    private Triangle tf3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeColor("blue");
        sky.moveHorizontal(-310);
        sky.moveVertical(-470);
        sky.changeSize(550);
        sky.makeVisible();
        
        ground = new Square();
        ground.changeColor("green");
        ground.moveHorizontal(-310);
        ground.moveVertical(80);
        ground.changeSize(550);
        ground.makeVisible();
        
        trunk = new Square();
        trunk.changeColor("black");
        trunk.moveHorizontal(-480);
        trunk.moveVertical(-120);
        trunk.changeSize(200);
        trunk.makeVisible();
        
        trunk2 = new Square();
        trunk2.changeColor("black");
        trunk2.moveHorizontal(120);
        trunk2.moveVertical(-120);
        trunk2.changeSize(200);
        trunk2.makeVisible();

        leaves = new Circle();
        leaves.changeColor("green");
        leaves.moveHorizontal(-320);
        leaves.moveVertical(-200);
        leaves.changeSize(200);
        leaves.makeVisible();
        
        leaves2 = new Circle();
        leaves2.changeColor("green");
        leaves2.moveHorizontal(150);
        leaves2.moveVertical(-200);
        leaves2.changeSize(200);
        leaves2.makeVisible();
        
        bush1 = new Circle();
        bush1.changeColor("green");
        bush1.moveHorizontal(-80);
        bush1.moveVertical(40);
        bush1.changeSize(150);
        bush1.makeVisible();
        
        bush2 = new Circle();
        bush2.changeColor("green");
        bush2.moveHorizontal(20);
        bush2.moveVertical(60);
        bush2.changeSize(68);
        bush2.makeVisible();
        
        link = new Person();
        link.changeColor("black");
        link.moveHorizontal(120);
        link.moveVertical(-10);
        link.changeSize(40, 20);
        link.makeVisible();
        
        hat = new Triangle();
        hat.changeColor("green");
        hat.changeSize(15, 10);
        hat.moveHorizontal(190);
        hat.moveVertical(15);
        hat.makeVisible();
        
        tf1 = new Triangle();
        tf1.changeColor("yellow");
        tf1.changeSize(20, 20);
        tf1.moveHorizontal(250);
        tf1.moveVertical(0);
        tf1.makeVisible();
        
        tf2 = new Triangle();
        tf2.changeColor("yellow");
        tf2.changeSize(20, 20);
        tf2.moveHorizontal(240);
        tf2.moveVertical(20);
        tf2.makeVisible();
        
        tf3 = new Triangle();
        tf3.changeColor("yellow");
        tf3.changeSize(20, 20);
        tf3.moveHorizontal(260);
        tf3.moveVertical(20);
        tf3.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (sky != null)   // only if it's painted already...
        {
            sky.changeColor("white");
            ground.changeColor("black");
            trunk.changeColor("black");
            trunk2.changeColor("black");
            leaves.changeColor("black");
            leaves2.changeColor("black");
            bush1.changeColor("black");
            bush2.changeColor("black");
            link.changeColor("black");
            hat.changeColor("black");
            //the golden power glows in the dark, OBVIOUSLY
            tf1.changeColor("white");
            tf2.changeColor("white");
            tf3.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (sky != null)   // only if it's painted already...
        {
            sky.changeColor("blue");
            ground.changeColor("green");
            trunk.changeColor("black");
            trunk2.changeColor("black");
            leaves.changeColor("green");
            leaves2.changeColor("green");
            bush1.changeColor("green");
            bush2.changeColor("green");
            link.changeColor("black");
            hat.changeColor("green");
            tf1.changeColor("yellow");
            tf2.changeColor("yellow");
            tf3.changeColor("yellow");
        }
    }
}
