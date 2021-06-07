package ahahaha;

import java.util.Scanner;
import java.util.Formatter;

public class example10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int item1, item2, item3, q1, q2, q3;
        double total1, total2, total3, subtotal, tax, alltotal;
        System.out.print("Enter the price of item 1: ");
        item1 = input.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        q1 = input.nextInt();
        System.out.print("Enter the price of item 2: ");
        item2 = input.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        q2 = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        item3 = input.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        q3 = input.nextInt();
        total1 = (item1 * q1);
        total2 = (item2 * q2);
        total3 = (item3 * q3);
        subtotal = total1 + total2 + total3;
        tax = subtotal * 0.055;
        alltotal = subtotal + tax;
        Formatter fmt = new Formatter();
        fmt.format("%.2f", subtotal);
        System.out.print("Subtotal: $"+fmt+"\nTax: $"+tax+"\nTotal: $"+alltotal);
    }
}
