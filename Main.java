public class Main {
    public static void main(String[] args){
        MovingAverage mvg = new MovingAverage(3);
        for(int i=1;i<11;i++){
            mvg.addElement(i);
            System.out.println("moving average = "+mvg.getMovingAvg() );
        }
        
        /*
        EXPECTED OUTPUT

        moving average = 1.0
        moving average = 1.5
        moving average = 2.0
        moving average = 3.0
        moving average = 4.0
        moving average = 5.0
        moving average = 6.0
        moving average = 7.0
        moving average = 8.0
        moving average = 9.0

        */
    }
} 