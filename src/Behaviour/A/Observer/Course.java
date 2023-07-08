package Behaviour.A.Observer;

import java.util.ArrayList;
import java.util.List;


public class Course {
    private String name;
    private String availability;
    private List<Observer> studentsList;

    public Course(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
    }

    public void subscribe(Observer student) {
        studentsList.add(student);
    }

    public void unsubscribe(Observer student) {
        studentsList.remove(student);

    }

    private void notifyAllSubscribers() {
        for (Observer student : studentsList) {
            student.update(availability);
        }
    }

    public void setAvailability(boolean isAvailable) {
        availability = this.name + " " + (isAvailable ? "Available" : "Not Available");
        notifyAllSubscribers();
    }

}
