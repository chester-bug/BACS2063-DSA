/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algorithm;

/**
 *
 * @author Administrator
 */
public class TimingAlgorithmMillis {

    /**
     * @param symbol
     * @param length
     * @return 
     */
    public static String getDivider(char symbol, int length){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < length; i++){
            stringBuilder.append(symbol);
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] nValues = {10,100,1000};
        long [] totalTimes = {0,0,0};
        
        String outputStr = String.format("\n\n     Average Running Times(ms) for %d iterations\n",10);
        outputStr += getDivider('=',56);
        outputStr += String.format("%8s %15s %15s %15s\n","n","Algorithm A", "Algorithm B", "Algorithm C");
        outputStr += getDivider('=',56);
        


        
        for (int n:nValues){
            
            System.out.printf("\nalgorithmA(%d) = %d",n,algorithms.algorithmA(n));
            System.out.printf("\nalgorithmA(%d) = %d",n,algorithms.algorithmB(n));
            System.out.printf("\nalgorithmA(%d) = %d",n,algorithms.algorithmC(n));

            for (int i = 0; i < 10; i++){
                //start time
                long startTime1 = System.currentTimeMillis();
                //call the algorithm A

                //end time
                long endTime1 = System.currentTimeMillis();
                //find the difference
                long elapsedTime1 = endTime1 - startTime1;
                totalTimes[0] += elapsedTime1;


                
                //start time
                long startTime2 = System.currentTimeMillis();
                //call the algorithm A
                //end time
                long endTime2 = System.currentTimeMillis();
                //find the difference
                long elapsedTime2 = endTime2 - startTime2;
                totalTimes[1] += elapsedTime2;

                
                //start time
                long startTime3 = System.currentTimeMillis();
                //call the algorithm A
                //end time
                long endTime3 = System.currentTimeMillis();
                //find the difference
                long elapsedTime3 = endTime3 - startTime3;
                totalTimes[2] += elapsedTime3;
            }
            
            outputStr += String.format("%8d %15d %15d %15d\n",n,totalTimes[0]/10, totalTimes[1]/10, totalTimes[2]/10);

            
//            System.out.println("Execution time for Algorithm A: " + totalTimes[0]/10 + " ms\n\n");
//            System.out.println("Execution time for Algorithm B: " + totalTimes[1]/10 + " ms\n\n");
//            System.out.println("Execution time for Algorithm C: " + totalTimes[2]/10 + " ms\n\n");

        }
        
        
        outputStr += getDivider('=',56);
        System.out.println(outputStr);
        
    }
    
}
