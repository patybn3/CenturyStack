
import java.util.Collections;
import java.util.LinkedList;

public class CenturyStack_LinkedList implements CenturyStackInterface
{
    protected LinkedList<Integer> stackArr;

    public CenturyStack_LinkedList()
    {
        stackArr = new LinkedList<>();
    }

    @Override
    public int push(int stackElements)
    {
        stackArr.add(stackElements);
        return stackElements;
    }

    public void pushToArray()
    {
        for (int i = 0; i < ARRAYMAX; i++)
        {
            push((int) (Math.random() * 100));
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
