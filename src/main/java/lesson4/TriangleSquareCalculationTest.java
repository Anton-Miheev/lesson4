package lesson4;

public class TriangleSquareCalculationTest {
    static double countTriangleArea(double sideA, double sideB, double sideC) throws BadTriangleException {
        if (sideA < 0 || sideB < 0 || sideC < 0) throw new BadTriangleException();
        double halfP = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
        return square;
    }
}
