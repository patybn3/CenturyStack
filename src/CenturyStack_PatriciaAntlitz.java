/* Problem Set 2 - 24, 34, 49 Chapter 2 Object-Oriented Data Structures Using Java, 4th Edition
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 09/30/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This file is the main class that runs this program
 * 3 object are created from classes that implements an interface.
 * This program does NOT take an user input.
 * all values are generated randomly by the program
 * It will generate the values through a loop, add them to an array or list, using the array[] property, the ArrayList and the LinkList
 * Each one of those are preformed in its designated files.
 * The first value entered on the list (index 0) is then removed, and a new item is inserted to the end of the list.
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