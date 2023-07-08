package Behaviour.A.Observer;

/* In this design we aim to notify all objects whose related to specific class with the updates they need once it occurs instead of
 * making them check every while into the class and consume more resources */

public class Main {
    public static void main(String[] args) {
        Student Ahmed = new Student("Ahmed");
        Student Ramy = new Student("Ramy");
        Student Jana = new Student("Jana");
        Student Yasmeen = new Student("Yasmeen");
        Student Gamal = new Student("Gamal");

        Course Java = new Course("Java Programming Language");

        Java.subscribe(Ahmed);
        Java.subscribe(Ramy);
        Java.subscribe(Jana);
        Java.subscribe(Yasmeen);
        Java.subscribe(Gamal);

        Java.setAvailability(true);

    }
}
