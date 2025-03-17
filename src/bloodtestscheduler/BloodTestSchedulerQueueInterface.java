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

    public int size();
    public boolean isEmpty();
    public void enqueue(int priority, String name, String age, String ward, String gpDetails);
    public Object dequeue();
    public Object frontElement();
    public String displayQueue();
}

