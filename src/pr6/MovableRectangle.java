package pr6;

import pr6.Movable;

public class MovableRectangle  implements Movable
{
    MovableRectangle()
    {

    }
    protected int x,y,speed;
    MovableRectangle(int x,int y,int speed)
    {
        this.x=x;
        this.y=y;
        this.speed=speed;
    }
    @Override
    public  void distance() {
        x += speed;
        y += speed;
    }
}
