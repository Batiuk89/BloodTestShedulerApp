/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 * BloodTestPriorityQ.java 
 * 13th March 2025
 * @author Murilo Batiuk
 */
public class BloodTestPriorityQ implements BloodTestSchedulerPriorityQInterface {

    //Array to hold the queue lelemnts
    private final ArrayList<BloodTestSchedulerElement> thePQueue;
    
    //Constructor to initialise the PQ
    public BloodTestPriorityQ() {
        thePQueue = new ArrayList<>();
    }

    //checks if the queue is empty
    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    //checks the size
    @Override
    public int size() {
        return thePQueue.size();
    }

    //finds the appropriate position to insert a new element based on its priority
    private int findInsertPosition(int newkey) {
        BloodTestSchedulerElement elem;
        int position = 0;

        System.out.println("inside findInsertKey loop. newkey = " + newkey);
        for (position = 0; position < thePQueue.size(); position++) {
            System.out.println("inside findInsertKey loop. position = " + position);
            elem = thePQueue.get(position);
            if (elem.getPriority() > newkey) { 
                break;
            }
        }

        return position;
    }

    //inserts a new elemnt in the correct position
    @Override
    public void enqueue(int priority, String name, String age, String ward, String gpDetails) {
        int index;

        BloodTestSchedulerElement elem = new BloodTestSchedulerElement(priority, name, age, ward, gpDetails);

        index = findInsertPosition(priority);

        if (index > size()) {
            thePQueue.add(elem);
        } else {
            thePQueue.add(index, elem);
        }
    }

    //removes the first element based on priority
    @Override
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    //display the queue based on the priority (urgency)
    @Override
    public String printPQueue() {
        BloodTestSchedulerElement temp;
        String txt = new String();
        for (int i = 0; i < thePQueue.size(); i++) {
            temp = thePQueue.get(i);

            txt = txt.concat("Priority: " + temp.getPriority() + ". Name: "
                    + temp.getName() + ". Age: " + temp.getAge()
                    + ". Does the patient come from another hospital ward? "
                    + temp.getWard() + ". GP Details: " + temp.getGpDetails() + "." + "\n");

        }
        return txt;
    }

    //displays the last five patients on the queue based on the priority
    @Override
    public Object peekLastFive() {
        if (thePQueue.isEmpty()) {
            System.out.println("List is empty");
            return null;
        } else {
            int startIndex = Math.max(0, thePQueue.size() - 5);
            StringBuilder result = new StringBuilder();

            for (int i = startIndex; i < thePQueue.size(); i++) {
                result.append(thePQueue.get(i)).append("");
            }

            return result.toString();
        }
    }

}
