package bai6.bai_tap.lop_point_va_moveablepoint;

public class MovablePoint extends Point
{
    private float xSpeed = 1.0f;
    private float ySpeed = 2.0f;

    public MovablePoint(){
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint move()
    {
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + getX() +
                ", ySpeed=" + getY() +
                '}';
    }
}
