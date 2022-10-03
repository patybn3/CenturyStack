public class CenturyStack_PatriciaAntlitz
{
    public static void main(String[] args)
    {
        int random;
        CenturyStack_Implemented runProgram = new CenturyStack_Implemented();

        random = (int)(Math.random() * 100 + 1);
        //ARRAY EXAMPLE
        runProgram.pushToArray();
        runProgram.pop(random);
    }
}