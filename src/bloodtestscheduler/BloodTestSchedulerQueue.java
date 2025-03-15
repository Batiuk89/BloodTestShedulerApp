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

public class BloodTestSchedulerQueue implements BloodTestSchedulerQueueInterface {

    private final ArrayList<String> theQueueA;

    public BloodTestSchedulerQueue() {
        theQueueA = new ArrayList<>();
    }

    @Override
    public int size() {
        return theQueueA.size();
    }

    @Override
    public boolean isEmpty() {
        return theQueueA.isEmpty();
    }

    @Override
    public void enqueue(int priority, String name, String age, String ward, String gpDetails) {
        String element = "Priority: " + priority + ". Name: " + name + ". Age " + age + 
          ". Does the patient come from another hospital ward?  " + ward + ". GP details: " + gpDetails + "." + "\n";
        theQueueA.add(element);  
    }

    @Override
    public Object dequeue() {
        if (!theQueueA.isEmpty()) {
            return theQueueA.remove(0);
        }
        return null;
    }

    @Override
    public Object frontElement() {
        if (!theQueueA.isEmpty()) {
            return theQueueA.get(0);
        } else {
            return null;
        }
    }

    
    public void clearAll() {
        if (!theQueueA.isEmpty()) {
            theQueueA.clear();
            System.out.println("Queue is now empty");
        } else {
            System.out.println("Queue is already empty");
        }
    }

    @Override
    public String displayQueue() {
        if (theQueueA.isEmpty()) {
            return "Nothing in Queue";
        }

        StringBuilder str = new StringBuilder();
        for (String element : theQueueA) {
            str.append(element).append("");
        }
        return str.toString();
    }
    
}
