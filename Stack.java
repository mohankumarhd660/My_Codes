public class Stack
{
    int top = -1;
    final int SIZE = 4;
    int s[] = new int[SIZE];
    boolean isFull()
    {
        if(top==SIZE-1)
        {
            return true;
        }else{
            return false;
        }
    }
    boolean isEmpty()
    {
        if(top ==-1)
        {
            return true;
        }else{
            return false;
        }
    }
    void push(int ele)
    {
        if(!isFull())
        {
            s[++top]=ele;
        }else{
            System.out.println("Stack is Full");
        }
    }
    int pop()
    {
        if(!isEmpty())
        {
            int ele=s[top];
            top--;
            return ele;
        }else{
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    int peek()
    {
        if(!isEmpty())
        {
            return s[top];
        }else{
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    void display()
    {
        if(!isEmpty())
        {
            System.out.println("The Elements in an Array : ");
            for(int i =0;i<=top;i++)
            {
                System.out.println(s[i]+" ");
            }
        }else{
            System.out.println("The Stack is Empty");
        }
    }
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.isFull());
        stack.push(5);
        stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}