/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 * BloodTestSchedulerElement.java 
 * 14th March 2025
 * @author Murilo Batiuk
 */
public class BloodTestSchedulerStack implements BloodTestSchedulerStackInterface {

    ArrayList<String> theStack;
    
    public BloodTestSchedulerStack() {
        this.theStack = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    @Override
    public void push(int priority, String name, String age, String ward, String gpDetails) {

        String item = "Priority: " + priority + ". Name: " + name + ". Age: " 
        + age + ". Does the patient come from another hospital ward? " + ward + ". GP details: " + gpDetails + " - IS THE LAST PATIENT.";

        theStack.add(0, item); 
    }

    @Override
    public Object pop() {
        if (!(theStack.isEmpty())) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public Object peek() {
        if (theStack.isEmpty()) {
            System.out.println("List is empty");
            return null;
        } else {
            return theStack.get(0);
        }
    }

    @Override
    public int size() {
        return theStack.size();
    }

    @Override
    public String displayStack() {

        String str = new String();

        if (theStack.isEmpty()) {
            str = str.concat("List is empty!");
        } else {
            for (int i = 0; i < theStack.size(); i++) {
                str = str.concat(theStack.get(i));
                str = str.concat("");
            }
        }
        return str;
    }

}