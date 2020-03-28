package Zjazd2;

/**
 * summary: Triangle class
 * author: Michal Wadas
 **/
public class Triangle {
    /*
        Stwórz klasę reprezentującą trójkąt, który musi posiadać atrybuty określające długości boków.
        Klasa powinna posiadać metody: obliczające pole, obwód,  isEquilateral, isIsosceles, or isScalene.
     */

    private double sideA;
    private double sideB;
    private double baseOfTheTriangle;

    /**
     * @param sideA
     * @param sideB
     * @param baseOfTheTriangle
     * @return triangle circuit
     */
    private double circuit(double sideA, double sideB, double baseOfTheTriangle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.baseOfTheTriangle = baseOfTheTriangle;
        double circuit;

        circuit = (sideA + sideB + baseOfTheTriangle);
        return circuit;
    }

    /**
     * @param baseOfTheTriangle
     * @param sideA
     * @param sideB
     * @return triangle field area
     */
    private double field(double baseOfTheTriangle, double sideA, double sideB) {
        this.baseOfTheTriangle = baseOfTheTriangle;
        this.sideA = sideA;
        this.sideB = sideB;
        double halfCircuit = circuit(sideA, sideB, baseOfTheTriangle) / 2;


        return Math.sqrt(halfCircuit * (halfCircuit - baseOfTheTriangle) * (halfCircuit - sideA) * (halfCircuit - sideB));
    }

    /**
     * @param sideA
     * @param sideB
     * @param baseOfTheTriangle
     * @return true if all sides and base are equal
     */

    private boolean isEquilateral(double sideA, double sideB, double baseOfTheTriangle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.baseOfTheTriangle = baseOfTheTriangle;

        //default return of boolean method gives true
        return sideA == sideB && sideA == baseOfTheTriangle;
    }

    /**
     * @param sideA
     * @param sideB
     * @param baseOfTheTriangle
     * @return true if both sides and base has different length
     */
    private boolean isScalene(double sideA, double sideB, double baseOfTheTriangle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.baseOfTheTriangle = baseOfTheTriangle;

        return sideA != sideB && sideA != baseOfTheTriangle && sideB != baseOfTheTriangle;
    }

    /**
     * @param sideA
     * @param sideB
     * @param baseOfTheTriangle
     * @return true if both sides are equal but base has different length
     */
    private boolean isIsosceles(double sideA, double sideB, double baseOfTheTriangle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.baseOfTheTriangle = baseOfTheTriangle;

        return sideA == sideB && sideA != baseOfTheTriangle;
    }


}
