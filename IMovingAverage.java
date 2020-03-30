/**
 * defining interface methods 
 * getMovingAvg        - gets the average of last n numbers
 * addElement    - adds the number to the list
 * getElement    - gets a element at index
 */
interface IMovingAverage {
    public double getMovingAvg();
    public void   addElement(double number);
    public double getElement(int index);
}