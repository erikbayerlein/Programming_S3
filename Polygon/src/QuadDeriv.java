public class QuadDeriv extends RegPol {

    QuadDeriv (float sidesSize) {
        super(4, sidesSize);
    }

    public double area() {
        double area = Math.pow(sidesSize, 2);

        return area;
    }

}
