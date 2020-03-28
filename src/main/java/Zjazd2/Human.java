package Zjazd2;

/**
 * summary: Human class
 * author: Michal Wadas
 **/
public class Human {

    //Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć,
    //numer indeksu, rozmiar stopy.
    //Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale, getFeetSize,
    // getIndexNumber. Stwórz także odpowiednie metody set.
    //Stwórz przykładowy obiekt zwierający Twoje dane.

    private int age;
    private int weight;
    private int height;
    private String name;
    private String gender;
    private String indexNumber;
    private int feetSize;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getFeetSize() {
        return feetSize;
    }

    public void setFeetSize(int feetSize) {
        this.feetSize = feetSize;
    }

    public Human(int age, int weight, int height, String name, String gender, String indexNumber, int feetSize) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.gender = gender;
        this.indexNumber = indexNumber;
        this.feetSize = feetSize;
    }

    Human myData = new Human(28, 85, 180, "Michal", "male", "s20495", 44);
}
