public class CenturyStack_PatriciaAntlitz
{
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