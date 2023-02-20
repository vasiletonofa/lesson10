package shape;

public class Square extends TwoDimensionalShape {

    final int x;

    Square() {
        x = 3;
    }
    @Override
    public int getArea() {
        return 4+4*4;
    }

}
