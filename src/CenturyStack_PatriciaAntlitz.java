/* Problem Set 2 - 24, 34, 49 Chapter 2 Object-Oriented Data Structures Using Java, 4th Edition
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 09/30/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This file is the main class that runs this program
 * testDriverLimit object is created from the ArrayBoundedStack.java which implements an interface, StackInterface.java class
 * The following files are NOT original to this code (not coded by me):
    * StackInterface.java
    * StackUnderflowException.java
    * StackOverflowException.java
 * The following file was partially coded by me (methods added): ArrayBoundedStack.java
 * This class is extends ArrayBoundedStack.java
 * It will take an user input as the size of the array
 * It will ask the user to enter the numbers to form the stack
 * In this program you can: Push to a stack (insert), pop from the top (remove), display the top element,
    pop a given number of elements, print the stack, swap the top two element's positions, print the menu, print the stack size.
 */

/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */


public class CenturyStack_PatriciaAntlitz
{
    //prints a dashed line to separate the printouts
    public void printSeparationLine()
    {
        String[] myLine = new String[100];

        for(int i = 0; i < myLine.length; i++)
        {
            System.out.print("_");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int random;

        CenturyStack_PatriciaAntlitz mainLine = new CenturyStack_PatriciaAntlitz();

        CenturyStack_Implemented runProgramArray = new CenturyStack_Implemented();
        CenturyStack_LinkedList runLinkedList = new CenturyStack_LinkedList();
        CenturyStack_ArrayList runArrayList = new CenturyStack_ArrayList();
        //used as the new number inserted on the lists
        random = (int)(Math.random() * 100 + 1);

        //ARRAY EXAMPLE
        System.out.println("FIFO with Arrays:");
        runProgramArray.pushToArray();
        runProgramArray.pop();
        runProgramArray.pushLast(random);
        mainLine.printSeparationLine();
        //ARRAYLIST
        System.out.println("\nFIFO with ArrayList:");
        runArrayList.pushToArray();
        runArrayList.pop();
        runArrayList.pushLast(random);
        mainLine.printSeparationLine();
        //LINKED LIST
        System.out.println("\nFIFO with LinkedList:");
        runLinkedList.pushToArray();
        runLinkedList.pop();
        runLinkedList.pushLast(random);
        mainLine.printSeparationLine();
    }
}