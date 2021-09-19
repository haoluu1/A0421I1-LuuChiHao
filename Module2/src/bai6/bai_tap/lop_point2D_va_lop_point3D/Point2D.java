package bai6.bai_tap.lop_point2D_va_lop_point3D;

import java.util.ArrayList;
import java.util.List;

public class Point2D
{
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
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
}
