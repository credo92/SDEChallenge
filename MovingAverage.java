import java.util.ArrayList;

/**
 * Class Moving Average implements IMovingAverage
 * We use a ArrayList because it allows us to grow the array dynamically
 * 
 */
public class MovingAverage implements IMovingAverage{
    double avg;
    ArrayList<Double> elements ;
    int windowSize;

    double currWindowSize;
    double currWindowSum;

    MovingAverage(int windowSize){
        this.windowSize=windowSize;
        this.elements = new ArrayList<Double>();
        
        this.currWindowSize = 0;
        this.currWindowSum = 0;
    }   

    /**
     * Adds a number to the elements list
     * 
     * @param num
     */
    public void addElement(double num){ // O(1)
        elements.add(num);

        if(currWindowSize == windowSize){
            currWindowSum = currWindowSum - getLeftElement() + num;
        } else {
            currWindowSum = currWindowSum + num;
            currWindowSize = currWindowSize + 1;
        }

        avg = currWindowSum/currWindowSize;
    }

    /**
     * Gets the average of Last N Numbers
     * 
     * @return avg
     */
    public double getMovingAvg(){ 
        return avg;
    }

    /**
     * Gets the element at index i 
     */
    public double getElement(int index){ 
        return elements.get(index);
    }

    /**
     * get left element in the current window size
     */
    private double getLeftElement(){ 
        int leftPosition =  (int) ( elements.size() - windowSize - 1 ) ;
        return elements.get( leftPosition);
    }
}