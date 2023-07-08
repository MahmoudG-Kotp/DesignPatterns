package Creational.B.Factory;

public class Sandwich {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println(hashCode() + " " + name + " Preparing...");
    }

}
