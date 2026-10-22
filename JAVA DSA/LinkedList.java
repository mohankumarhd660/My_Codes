class Node 
{
    int val;
    Node next;
    Node(int val)
    {
        this.val = val;
        this.next = null;
    }
}

class LinkedList
{
    Node head=null,temp=null;
    void insert(int val)
    {
        Node newnode = new Node(val);
        if(head==null)
        {
            head= newnode;
            temp =head;
        }else{
            temp.next = newnode;
            temp = newnode;
        }
    }

    void display(Node head)
    {
        Node demo= head;
        while(demo!=null)
        {
            System.out.println(demo.val);
            demo=demo.next;
        }
    }

    void insertAtBeginning(int val)
    {
        if(head==null)
        {
            head = new Node(val);
            temp = head;
            return;
        }
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
    }
    void insertAtEnd(int val)
    {
        insert(val);

    }
    void deleateAtFront()
    {
        head= head.next;
    }
    void deleateAtEnd()
    {
        if(head==null)
        {
            return ;
        }if(head.next ==null)
        {
            head= null;
            temp = null;
            return;
        }
        Node dummy = head,prev=null;
        while(dummy.next!=null)
        {
            prev = dummy;
            dummy = dummy.next;
        }
        prev.next= null;
    }
    Node reverse(Node head)
    {
        Node curr= head;
        Node next = null;
        Node prev = null;;
        while(curr!=null)

            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
    }

    void insertAtPosition(int val, int pos)
    {
        Node newnode = new Node(val);
        if(pos==1)
        {
            newnode.next = head;
            head = newnode;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1 && temp!=null;i++)
        {
            temp = temp.next;
        }
        if(temp==null)
        {
            System.out.println("Position out of range");
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    void deleateAtPosition(int pos)
    {
        if(pos==1)
        {
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1 && temp!=null;i++)
        {
            temp = temp.next;
        }
        if(temp==null || temp.next==null)
        {
            System.out.println("Position out of range");
            return;
        }
        temp.next = temp.next.next;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.display(ll.head);
        ll.insertAtBeginning(5);
        ll.insertAtEnd(40);
        ll.display(ll.head);
        System.out.println("After deleting at front:");
        ll.deleateAtFront();
        ll.display(ll.head);
        System.out.println("After deleting at end:");
        ll.deleateAtEnd();
        ll.display(ll.head);
        System.out.println("After inserting at position 3:");
        ll.insertAtPosition(25, 3);
        ll.display(ll.head);
        System.out.println("After deleting at position 2:");
        ll.deleateAtPosition(2);
        ll.display(ll.reverse(ll.head));

    }
}