import objectdraw.*;
import java.awt.*;

public class AngLineClient extends WindowController{
  public static void main(String[] args){
    new AngLineClient().startController( 800,800 );
  }

  public void begin(){

    Location start = new Location(canvas.getWidth()/2,canvas.getHeight()/2);

    double length = 300;

    double dir = 0;
                  // = Math.PI/2.0;
                  // = Math.PI;
                  // = 3*Math.PI/2.0;

    AngLine aLine = new AngLine(start, length, dir, canvas);

  }


}

