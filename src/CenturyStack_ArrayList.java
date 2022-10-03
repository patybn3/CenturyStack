import java.util.ArrayList;
//this code is virtually the same as the code in CenturyStack_LinkedList.java with the exception to the type of list used.
//uses ArrayList
public class CenturyStack_ArrayList implements CenturyStackInterface
{
    protected ArrayList<Integer> stackArr;

    public CenturyStack_ArrayList()
    {
        stackArr = new ArrayList<>(ARRAYMAX);
    }

    @Override
    public int push(int stackElements)
    {
        //push method will add to the list
        stackArr.add(stackElements);
        return stackElements;
    }

    public void pushToArray()
    {
        //random numbers will be inserted through push(). The reason why I created a new method
        //for this was so I can call push by itself when I want to append a new element to the list
        for (int i = 0; i < ARRAYMAX; i++)
        {
            push((int) (Math.random() * 100)); //random numbers will be inserted
        }
        //this method (below) will print the lists, created to avoid repetitive code
        printList();
    }

    @Override
    public void pop()
    {
        //removes the first element at index 0
        stackArr.remove(0);
        System.out.println("\nArrayList Without First Element:");
        printList();
    }

    public void pushLast(int num)
    {
        //this will call push() and passes the parameter num
        //in the main method, this parameter is passes as a random number
        //this random number is inserted into the current list
        push(num);
        System.out.println("\nArrayList With New Element Added:");
        printList();
    }

    public void printList()
    {
        System.out.println("\nFirst Element: " + stackArr.get(0));
        System.out.println("Last Element: " + stackArr.get(stackArr.size() - 1));
        System.out.println(stackArr + ", ");
    }
}
