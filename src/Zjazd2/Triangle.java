package Zjazd2;


/**
 * summary: Triangle class
 * author: Michal Wadas
 **/
public class Triangle {

    //Stwórz klasę reprezentującą trójkąt, który musi posiadać atrybuty określające długości boków.
    //Klasa powinna posiadać metody: obliczające pole, obwód,  isEquilateral, isIsosceles, or isScalene.

    private double sideA;
    private double sideB;
    private double baseOfTheTriangle;

    private double circuit(double sideA, double sideB, double baseOfTheTriangle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.baseOfTheTriangle = baseOfTheTriangle;
        double circuit;

        circuit = (sideA + sideB + baseOfTheTriangle);
        return circuit;
    }

    private double field(double baseOfTheTriangle, double sideA, double sideB) {
        this.baseOfTheTriangle = baseOfTheTriangle;
        this.sideA = sideA;
        this.sideB = sideB;
        double halfCircuit = circuit(sideA, sideB, baseOfTheTriangle) / 2;


        return Math.sqrt(halfCircuit * (halfCircuit - baseOfTheTriangle) * (halfCircuit - sideA) * (halfCircuit - sideB));
    }

    private boolean isEquilateral(double sideA, double sideB, double baseOfTheTriangle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.baseOfTheTriangle = baseOfTheTriangle;

        //default return of boolean method gives true
        return sideA == sideB && sideA == baseOfTheTriangle;
    }


    private boolean isIsosceles(double sideA, double sideB, double baseOfTheTriangle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.baseOfTheTriangle = baseOfTheTriangle;

        return sideA != sideB && sideA != baseOfTheTriangle && sideB != baseOfTheTriangle;
    }

}
