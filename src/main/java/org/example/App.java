package org.example;


public class App 
{
    public static void main(String[] args)
    {
        String[] pals = {"madam", "civic", "aibohphobia"};
        String[] containPals = {"character", "BBABCBCAB", "widow", "never", "restock paper"};
        String[] noPals = {"Save", "Load"};
        System.out.println("For known palindromes:");
        for (String in: pals) {
            printLPS(in);
        }
        System.out.println();
        System.out.println("For strings containing palindromes:");
        for (String in: containPals) {
            printLPS(in);
        }
        System.out.println();
        System.out.println("For strings without palindromes:");
        for (String in: noPals) {
            printLPS(in);
        }
    }

    public static void printLPS(String input) {
        System.out.print("The longest palindrome subsequence in " + input + " is: ");
        System.out.println(Palindromes.generateLPS(input));
        System.out.println("Length: " + Palindromes.lengthLPS(input));
    }
}
