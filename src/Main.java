public class Main
{
    public static void main(String[] args)
    {
        LittleSLL mySLL = new LittleSLL();
        mySLL.addNodeToStart(24);
        mySLL.addNodeToStart(23);
        mySLL.addNodeToStart(53);

        mySLL.showList();
        System.out.println("Next");
        mySLL.deleteNodeFromStart();
        mySLL.showList();
    }
}