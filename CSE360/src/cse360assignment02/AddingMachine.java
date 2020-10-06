package cse360assignment02;
/*Assignment-1
* */


public class AddingMachine {
    private int total;
    private String histy;

    /*This is the constructor*/
    public AddingMachine ()
    {
        histy = "0";
        total = 0;
    }


     /* Returns total*/
    public int getTotal ()
    {
        return total;
    }
    /* Adds user input to the total*/
    public void add (int value)
    {
        total = total + value;
        histy = histy + "+" + value;
    }
    /* Subtracts user input to the total*/

    public void subtract (int value)
    {
        histy = histy + "-" + value;
        total = total - value;
    }
    /* History of transactions*/

    public String toString () {
        return histy;
    }
    /*Resets the values*/
    public void clear() {
        total = 0;
        histy = "0";
    }
}
