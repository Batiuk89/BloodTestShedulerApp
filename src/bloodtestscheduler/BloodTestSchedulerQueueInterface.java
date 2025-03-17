/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 * BloodTestSchedulerElement.java 
 * 14th March 2025
 * @author Murilo Batiuk
 */

public interface BloodTestSchedulerQueueInterface {

    //methods to manage the queue (check number of patients, if it's empty, insert, 
    // remove the first one, display the first one, display all the patients
    public int size();
    public boolean isEmpty();
    public void enqueue(int priority, String name, String age, String ward, String gpDetails);
    public Object dequeue();
    public Object frontElement();
    public String displayQueue();
}

