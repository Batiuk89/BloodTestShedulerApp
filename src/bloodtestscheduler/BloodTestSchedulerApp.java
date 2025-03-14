/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

/**
 * BloodTestSchedulerApp.java 13th March 2025
 *
 * @author Murilo Batiuk
 */
public class BloodTestSchedulerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        BloodTestPriorityQ pq = new BloodTestPriorityQ();

        

        BloodTestSchedulerGUI appGUI = new BloodTestSchedulerGUI();
        appGUI.setVisible(true);


    }

}
