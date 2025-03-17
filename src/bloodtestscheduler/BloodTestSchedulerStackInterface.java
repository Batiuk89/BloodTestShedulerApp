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

public interface BloodTestSchedulerStackInterface {
    
    //inserts a new patient in the end of the queue, removes the last one from the queue
    //display the last one from the queue, check if it's empty, checks the number of patients, display the queue
    public void push(int priority, String name, String age, String ward, String gpDetails);
    public Object pop();    
    public Object peek();
    public boolean isEmpty();
    public int size();
    public String displayStack();
    
}
