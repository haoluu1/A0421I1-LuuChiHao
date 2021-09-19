package bai6.bai_tap.lop_point_va_moveablepoint;

public class MainMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setX(1);
        movablePoint.setY(2);
        System.out.println(movablePoint.move());
    }
}
