package Zjazd5;

/**
 * summary: Implement UML chart, exercise 05_06: Chemical element
 * author: Michal Wadas
 **/
public class ChemicalElement {

    private String name;
    private String symbol;
    private int atomicNumber;
     ChemicalElements chemicalElements = new ChemicalElements();

    public ChemicalElement() {
    }

    public ChemicalElement(int atomicNumber, String name, String symbol) {
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    @Override
    public String toString() {
        return symbol + ":" +
                name + " with atomic number " +
                atomicNumber + "." +
                chemicalElements.isType(atomicNumber);
    }
}