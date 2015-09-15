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
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person dude;

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
        wall = new Square();
        wall.changeColor("green");
        wall.moveHorizontal(-310);
        wall.moveVertical(100);
        wall.changeSize(500);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(-320);
        window.moveVertical(-420);
        window.changeSize(520);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("yellow");
        roof.changeSize(20, 40);
        roof.moveHorizontal(60);
        roof.moveVertical(80);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(0);
        sun.changeSize(80);
        sun.makeVisible();
        
        dude = new Person();
        dude.changeColor("magenta");
        dude.moveHorizontal(0);
        dude.moveVertical(0);
        dude.changeSize(60, 30);
        dude.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("green");
            window.changeColor("blue");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
