public class EqTriangleDeriv extends RegPol {

    EqTriangleDeriv(float sidesSize) {
        super(3, sidesSize);
    }

    public double area() {
        double area = (Math.pow(sidesSize, 2) * Math.sqrt(3)) / 4;

        return area;
    }

}
