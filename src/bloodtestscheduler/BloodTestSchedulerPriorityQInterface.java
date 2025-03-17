/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 * BloodTestSchedulerPriorityQInterface.java 
 13th March 2025
 * @author Murilo Batiuk
 */
public interface BloodTestSchedulerPriorityQInterface {

    //methods to manage the queue (insert, check number of patients,
    //if it's empty, remove the first one, display all the patients, and check the last five
    public void enqueue(int priority, String name, String age, String ward, String gpDetails);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQueue();
    public Object peekLastFive();

}

    