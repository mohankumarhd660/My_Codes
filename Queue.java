
public class Queue {
    public final int SIZE = 4;
    int f = -1, r = -1;  // f = Front, r = Rear
    int q[] = new int[SIZE];

    boolean isEmpty() {
        return f == -1;
    }

    boolean isFull() {
        return r == SIZE - 1;
    }

    void add(int ele) {
        if (isFull()) {
            System.out.println("The Queue is Full");
            return;
        }

        if (isEmpty()) {
            f = 0;
        }

        q[++r] = ele;
    }

    void remove() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return;
        }

        System.out.println("Removed element: " + q[f]);

        if (f == r) {
            // Last element removed
            f = -1;
            r = -1;
        } else {
            f++;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return;
        }

        System.out.println("The Elements in a Queue:");
        for (int i = f; i <= r; i++) {
            System.out.println(q[i]);
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        }

        return q[f];
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

        queue.remove(); // Tests removing from an empty queue
    }
}
