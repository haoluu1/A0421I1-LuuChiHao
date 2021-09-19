package bai6.bai_tap.lop_point_va_moveablepoint;

import java.util.ArrayList;
import java.util.List;

public class Point
{
    private float x = 1.0f;
    private float y = 2.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public List getXY()
    {
        List list = new ArrayList();
        list.add(getX());
        list.add(getY());
        return list;
    }

    public void setXY(float x, float y)
    {
        this.setX(x);
        this.setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
