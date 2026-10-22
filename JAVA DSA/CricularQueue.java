public class CricularQueue {
    final int SIZE = 4;
    int f =-1;
    int r = -1;
    int []cq = new int [4];

    boolean isEmpty()
    {
        if(f==-1)
        {
            return true;
        }return false;
    }
    boolean isFull()
    {
        if(f==(r+1)%SIZE)
        {
            return true;
        }else{
            return false;
        }
    }

    void insert(int ele)
    {
        if(isFull())
        {
            System.out.println("The Queue is Full");
            return;
        }else if(isEmpty())
        {
            f=0;
            r=(r+1)%SIZE;
            cq[r]=ele;
        }else{
            r=(r+1)%SIZE;
            cq[r]=ele;
        }
    }
    void remove()
    {
        if(isEmpty())
        {
            System.out.println("The Queue is Empty");
            return;
        }else if(f==r)
        {
            f=-1;
            r=-1;
        }
        else{
            f=(f+1)%SIZE;
        }
    }
    void display()
    {
        if(isEmpty())
        {
            System.out.println("The Queue is Empty");
            return ;
        }
        System.out.println("The Elements in a Queue : ");
        int i =f;
        do
        {
            System.out.println(cq[i]);
            i=(i+1)%SIZE;
        }while(i!=(r+1)%SIZE);
    }
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("The Queue is Empty");
            return -1;
        }
        return cq[f];
    }

    public static void main(String args[])
    {
        CricularQueue cq = new CricularQueue();
        cq.display();
        cq.remove();
        cq.insert(10);
        cq.display();
        cq.insert(20); 
        cq.display();
        cq.insert(30);  
        cq.display();
        cq.insert(40);
        cq.display();   
        cq.insert(50);
        cq.display();
        cq.remove();
        cq.display();
        cq.remove();
        cq.display();
        cq.insert(60);
        cq.display();
    }
}