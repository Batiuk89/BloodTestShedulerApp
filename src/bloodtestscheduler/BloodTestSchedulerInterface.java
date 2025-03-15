/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 * BloodTestSchedulerInterface.java 
 * 13th March 2025
 * @author Murilo Batiuk
 */
public interface BloodTestSchedulerInterface {

    public void enqueue(int priority, String name, String age, String ward, String gpDetails);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQueue();
    public Object peekLastFive();

}
