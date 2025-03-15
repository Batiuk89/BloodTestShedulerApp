/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 * BloodTestSchedulerElement.java 
 * 13th March 2025
 * @author Murilo Batiuk
 */

public class BloodTestSchedulerQueue implements BloodTestSchedulerQueueInterface {
    
    private ArrayList<String> theQueueA; 
    
    public MyQueue(){
        theQueueA = new ArrayList<>(); 
    
    
    @Override
    public int size(){
       return theQueueA.size(); 
    }
    @Override
    public boolean isEmpty(){
        return theQueueA.isEmpty();
    }
    @Override
    public void enqueue(Object element){
        theQueueA.add((String) element);
    }
    @Override
    public Object dequeue(){
        return theQueueA.remove(0);
    }
    @Override
    public Object frontElement(){
        if(!theQueueA.isEmpty()){ 
            return theQueueA.get(0);
        }else{ 
            return null;
        }
    }
    
    public void clearAll(){
       
        if(theQueueA.size() > 0){
            theQueueA.clear();
            System.out.println("Queue is now empty");
        }else{
            System.out.println("Queue is already empty");
        }
    }
    
    public String displayQueue(){
       
       String str = new String(); 
       
       if(theQueueA.isEmpty()){
           str = str.concat("Nothing in Queue"); 
       }else{
           for (int i=0; i<theQueueA.size();i++){
               str = str.concat(theQueueA.get(i));
               str = str.concat(" ; ");
           }
       }
        
       return str;
   }
    
}
