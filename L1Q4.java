package l1q4;

import java.util.HashMap;

public class L1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, Integer> data = new HashMap<String, Integer>(6);
        
        data.put("January 2016", 2500);
        data.put("February 2016", 1600);
        data.put("March 2016", 2000);
        data.put("April 2016", 2700);
        data.put("May 2016", 3200);
        data.put("June 2016", 800);
        
        for (HashMap.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0, n = entry.getValue() / 100; i < n; i++) {
                System.out.print("*");
                }
            System.out.println();
        }
        
        System.out.println("* = 100 amount");
    }
        
    
}
