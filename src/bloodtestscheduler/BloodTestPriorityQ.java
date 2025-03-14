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
public class BloodTestPriorityQ implements BloodTestSchedulerInterface {

    private final ArrayList<BloodTestSchedulerElement> thePQueue;

    public BloodTestPriorityQ() {
        thePQueue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    @Override
    public int size() {
        return thePQueue.size();
    }

    private int findInsertPosition(int newkey) {
        BloodTestSchedulerElement elem;
        int position = 0;

        System.out.println("inside findInsertKey loop. newkey = " + newkey);
        for (position = 0; position < thePQueue.size(); position++) {
            System.out.println("inside findInsertKey loop. position = " + position);
            elem = thePQueue.get(position);
            if (elem.getPriority() < newkey) {  //compare the priority's
                break; //if less then quit as you have it, gets returned below
            }
        }

        return position;

    }

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

    @Override
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    @Override
    public String printPQueue() {
        BloodTestSchedulerElement temp;
        String txt = new String();
        for (int i = 0; i < thePQueue.size(); i++) {
            temp = thePQueue.get(i);

            txt = txt.concat("Priority: " + temp.getPriority() + ". Name: "
                + temp.getName() + ". Age: " + temp.getAge()
                + ". Does the patient come from another hospital ward? "
                + temp.getWard() + ". GP Details: " + temp.getGpDetails() + "\n");

        }
        return txt;
    }

}
