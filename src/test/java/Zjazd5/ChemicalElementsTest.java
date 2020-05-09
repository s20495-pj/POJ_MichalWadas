package Zjazd5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * summary:Exercise 05_06: Chemical elements Tests
 * author: Michal Wadas
 **/
public class ChemicalElementsTest {

    private final ChemicalElements chemicalElements = new ChemicalElements();

    @Before
    public void setUp() throws IOException {
        chemicalElements.addElements();
    }

    @Test
    public void testFindChemicalElementByName() throws IOException {
        setUp();

        Assert.assertEquals("Ne:Neon with atomic number 10.", chemicalElements.findByName("Neon").toString());
    }

    @Test
    public void testFindChemicalElementBySymbol() throws IOException {
        setUp();

        Assert.assertEquals("O:Oxygen with atomic number 8.", chemicalElements.findBySymbol("O").toString());
    }

    @Test
    public void testFindChemicalElementByAtomicNumber() throws IOException {
        setUp();

        Assert.assertEquals("C:Carbon with atomic number 6.", chemicalElements.findByAtomicNumber(6).toString());
    }

    @Test
    public void testTypeOfChemicalElements() throws IOException {
        setUp();

        //isAlkali
        String isAlkali = "It is an alkali metal";
        Assert.assertTrue(chemicalElements.findByAtomicNumber(3).toString().contains(isAlkali));

        //isTransition
        String isTransition = "It is a transition metal";
        Assert.assertTrue(chemicalElements.findByAtomicNumber(39).toString().contains(isTransition));

        //isMetal
        String isMetal = "It is a metal";
        Assert.assertTrue(chemicalElements.findByAtomicNumber(50).toString().contains(isMetal));
    }
}