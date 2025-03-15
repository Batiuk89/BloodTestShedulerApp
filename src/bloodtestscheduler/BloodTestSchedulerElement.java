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

    private int priority;
    private String name, age, ward, gpDetails;

    public BloodTestSchedulerElement(int priority, String name, String age, String ward, String gpDetails) {
        this.priority = priority;
        this.name = name;
        this.age = age;
        this.ward = ward;
        this.gpDetails = gpDetails;
    }

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

    @Override
    public String toString() {
        return "BloodTestSchedulerElement{priority=" + priority + ", name=" + name
                + ", age=" + age + ", ward=" + ward + ", GP Details=" + gpDetails + "}";
    }

}
