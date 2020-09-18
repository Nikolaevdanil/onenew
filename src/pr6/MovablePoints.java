package pr6;

public class MovablePoints extends MovableRectangle implements Movable {
    public MovableRectangle start, end;
    MovablePoints()
    {
       start=new MovableRectangle(0,0,5);
       end=new MovableRectangle(55,55,5);
    }
    public int cheak()
    {
        if(start.speed==end.speed)
        return 1;
        else return 0;
    }

    @Override
    public void distance() {
        start.distance();
        end.distance();
        MovableRectangle end=new MovableRectangle(55,55,5);

    }
}
