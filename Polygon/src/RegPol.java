public abstract class RegPol {

    float numSides, sidesSize;

    RegPol (float numSides, float sidesSize) {
        this.numSides = numSides;
        this.sidesSize = sidesSize;
    }

    public float perimeter () {
        float perimeter = numSides * sidesSize;

        return perimeter;
    }

    public abstract double area();

}
