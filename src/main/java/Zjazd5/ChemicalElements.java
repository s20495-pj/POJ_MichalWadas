package Zjazd5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * summary: Implement UML chart, exercise 05_06: Chemical elements as repository
 * author: Michal Wadas
 **/
public class ChemicalElements {

    private final List<ChemicalElement> chemicalElementsList = new ArrayList<>();

    public void addElements() throws IOException {
        BufferedReader csvReader;
        try {
            csvReader = new BufferedReader(new FileReader("src/main/resources/textFiles/periodensystem.csv"));
            String line;
            while ((line = csvReader.readLine()) != null) {
                String[] data = line.split(",");
                chemicalElementsList.add(new ChemicalElement(Integer.parseInt(data[0]), data[1], data[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can not find the file.");
            e.printStackTrace();
        }
    }

    public ChemicalElement findByName(String name) {
        return chemicalElementsList.stream()
                .filter(el -> el.getName().equals(name))
                .findAny().orElse(null);
    }

    public ChemicalElement findBySymbol(String symbol) {
        return chemicalElementsList.stream()
                .filter(el -> el.getSymbol().equals(symbol))
                .findAny().orElse(null);
    }

    public ChemicalElement findByAtomicNumber(int atomicNumber) {
        return chemicalElementsList.stream()
                .filter(el -> el.getAtomicNumber() == atomicNumber)
                .findAny().orElse(null);
    }

    public boolean isAlkali(int atomicNumber) {
        switch (atomicNumber) {
            case 3:
            case 11:
            case 19:
            case 37:
            case 55:
            case 87:
                return true;
        }
        return false;
    }

    public boolean isMetal(int atomicNumber) {
        switch (atomicNumber) {
            case 13:
            case 49:
            case 50:
            case 81:
            case 82:
            case 83:
            case 113:
            case 114:
            case 115:
                return true;
        }
        return false;
    }

    public boolean isTransitionMetal(int atomicNumber) {
        return 21 <= atomicNumber && atomicNumber <= 31
                || 39 <= atomicNumber && atomicNumber <= 48
                || 72 <= atomicNumber && atomicNumber <= 80
                || 104 <= atomicNumber && atomicNumber <= 112;
    }

    public String isType(int atomicNumber) {
        if (isAlkali(atomicNumber)) {
            return " It is an alkali metal.";
        } else if (isTransitionMetal(atomicNumber)) {
            return " It is a transition metal.";
        } else if (isMetal(atomicNumber)) {
            return " It is a metal.";
        }
        return "";
    }
}