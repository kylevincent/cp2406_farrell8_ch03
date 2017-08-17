import javax.swing.*;

/**
 * Created by jc431075 on 18/08/17.
 */
public class NumbersDemo
{
    public static void main(String[] args)
    {
        int num1 = getNumber(), num2 = getNumber();

        displayTwiceTheNumber(num1, num2);
        displayNumberPlusFive(num1, num2);
        displayNumberSquared(num1, num2);
    }
    public static void displayTwiceTheNumber(int a, int b)
    {
        JOptionPane.showMessageDialog(null, "Your numbers * 2 = "+ ((a+b)*2));
    }
    public static void displayNumberPlusFive(int a, int b)
    {
        JOptionPane.showMessageDialog(null, "Your number + 5 = " + (a + b + 5));
    }
    public static void displayNumberSquared(int a, int b)
    {
        JOptionPane.showMessageDialog(null, "Your number squared = " + ((a+b)* (a+b)));
    }
    public static int getNumber()
    {
        String getInitial = JOptionPane.showInputDialog(null, "Input your number");
        Integer gotTheNumber = Integer.parseInt(getInitial);
        return gotTheNumber;
    }

}

