/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 * BloodTestSchedulerElement.java 
 * 13th March 2025
 * @author Murilo Batiuk
 */
public class BloodTestSchedulerElement {

    //variables
    private int priority; //create the var to order the queue based on priority
    private String name, age, ward, gpDetails; //patients info

    //constructor to initialise
    public BloodTestSchedulerElement(int priority, String name, String age, String ward, String gpDetails) {
        this.priority = priority;
        this.name = name;
        this.age = age;
        this.ward = ward;
        this.gpDetails = gpDetails;
    }

    //Get and set methods to take the information and display back to the user
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public void setGpDetails(String gpDetails) {
        this.gpDetails = gpDetails;
    }

    //message that is going to be displayed to the user on the GUI
    @Override
    public String toString() {
        return "Priority:" + priority + ". Name: " + name
                + ". Age:" + age + ". Ward:" + ward + " .GP Details:" + gpDetails + "." + "\n";
    }

}
