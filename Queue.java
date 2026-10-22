public class Queue {
    public final int SIZE = 4;
    int f=-1,r=-1;
    int q[] = new int[SIZE];
    boolean isEmpty()
    {
        if(f==-1)
            return true;
        else
            return false;
    }boolean isFull()
    {
        if (f == SIZE-1)
        {
            return true;
        }else{
            return false;
        }
    }
    void add(int ele)
    {
        if(f==-1)
        {
            r++;
            q[++f]=ele;
        }
        else if(!isFull())
        {
            q[++f]=ele;
        }else{
            System.out.println("The Queue is Full");
        }
    }

    void remove()
    {
        if(!isEmpty())
        {
            r++;
        }else{
            System.out.println("The Queue is Empty");
        }
    }

    void display()
    {
        if(!isEmpty())
        {
            System.out.println("The Elements in a Queue : ");
            for(int i = r;i<=f;i++)
                {
                    System.out.println(q[i]);
                }   
        }else{
            System.out.println("The Queue is Empty");
        }
    }
    int peek()
    {
        if(!isEmpty())
        {
            return q[r];
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.display();
        queue.add(2);
        queue.display();
        queue.add(3);
        queue.display();
        queue.add(4);
        queue.display();
        queue.remove();
        queue.display();
        queue.remove();
        queue.display();
        queue.remove();
        queue.display();
        queue.remove();
        queue.display();
    }
}
