package bai6.bai_tap.lop_point2D_va_lop_point3D;

import java.util.ArrayList;
import java.util.List;

public class Point3D extends Point2D
{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public List getXYZ()
    {
        List list = new ArrayList();
        list.add(getX());
        list.add(getY());
        list.add(getZ());
        return list;
    }

    public void setXYZ(float x, float y, float z)
    {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
