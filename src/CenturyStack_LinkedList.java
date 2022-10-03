import java.util.LinkedList;
//this code is virtually the same as the code in CenturyStack_ArrayList.java with the exception to the type of list used.
//check CenturyStack_ArrayList.java comments
public class CenturyStack_LinkedList implements CenturyStackInterface
{
    protected LinkedList<Integer> stackArr;

    public CenturyStack_LinkedList()
    {
        //linked lists cant take a max size
        stackArr = new LinkedList<>();
    }

    @Override
    public int push(int stackElements)
    {
        //adding to the list
        stackArr.add(stackElements);
        return stackElements;
    }

    public void pushToArray()
    {
        for (int i = 0; i < ARRAYMAX; i++)
        {
            push((int) (Math.random() * 100)); //random numbers (100)
        }
        printList();
    }

    @Override
    public void pop()
    {
        stackArr.remove(0);
        System.out.println("\nArrayList Without First Element:");
        printList();
    }

    public void pushLast(int num)
    {
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
