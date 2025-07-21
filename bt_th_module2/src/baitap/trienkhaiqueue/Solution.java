package baitap.trienkhaiqueue;

public class Solution {
    Queue queue;

    Solution() {
        queue = new Queue();
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);

        if (queue.front == null) {
            queue.front = queue.rear = newNode;
        } else {
            queue.rear.next = newNode;
            queue.rear = newNode;
        }
        queue.rear.next = queue.front;
    }

    public void deQueue() {
        if (queue.front == null) {
            System.out.println("Hàng đợi rỗng!");
            return;
        }

        if (queue.front == queue.rear) {
            System.out.println("Xóa phần tử: " + queue.front.data);
            queue.front = queue.rear = null;
        } else {
            System.out.println("Xóa phần tử: " + queue.front.data);
            queue.front = queue.front.next;
            queue.rear.next = queue.front;
        }
    }

    public void displayQueue() {
        if (queue.front == null) {
            System.out.println("Hàng đợi rỗng!");
            return;
        }

        System.out.print("Các phần tử trong hàng đợi: ");
        Node temp = queue.front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != queue.front);
        System.out.println();
    }
}
