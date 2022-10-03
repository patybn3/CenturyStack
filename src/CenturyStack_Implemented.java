//FIFO with arrays
import java.util.Arrays;

public class CenturyStack_Implemented implements CenturyStackInterface
{
    //ARRAYMAX is pre-set in CenturyStackInterface.java to be used by all implemented classes, cannot be changed
    protected int[] stackArr;
    protected int indexTop = -1;

    public CenturyStack_Implemented()
    {
        stackArr = new int[ARRAYMAX];
    }

    @Override
    public int push(int stackElements)
    {
        indexTop++;
        stackArr[indexTop] = stackElements;
        return stackElements;
    }

    public void pushToArray()
    {
        for (int i = 0; i < stackArr.length; i++) {
            push((int) (Math.random() * 100));
        }
        printList();
    }

    @Override
    public int pop(int num)
    {
        //I believe there is no way this will catch an error, values are set, but I placed a try/catch just in case
        try
        {
            //remove first element in index 0
            for (int i = 0; i < ARRAYMAX - 1; i++)
            {
                stackArr[i] = stackArr[i + 1];
            }
            System.out.println("\nArray Without First Element:");
            printList();
            //replace last element to a number passed in the main method
            for (int i = ARRAYMAX; i > 0; i--)
            {
                stackArr[stackArr.length - 1] = num;
            }
            System.out.println("\nArray With New Element Added:");
            printList();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array is full.");
        }
        return 0;
    }

    public void printList()
    {
        System.out.println("\nFirst Element: " + stackArr[0]);
        System.out.println("Last Element: " + stackArr[stackArr.length - 1]);
        System.out.println(Arrays.toString(stackArr) + ", ");
    }
}
