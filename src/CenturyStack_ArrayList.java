import java.util.ArrayList;

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
    public int pop(int num)
    {
        stackArr.remove(0);
        System.out.println("\nArrayList Without First Element:");
        printList();
        push(num);
        System.out.println("\nArrayList With New Element Added:");
        printList();
        return 0;
    }

    public void printList()
    {
        System.out.println("\nFirst Element: " + stackArr.get(0));
        System.out.println("Last Element: " + stackArr.get(stackArr.size() - 1));
        System.out.println(stackArr + ", ");
    }
}
