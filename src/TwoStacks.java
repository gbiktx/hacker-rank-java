import java.util.Scanner;

/**
 * A queue is an abstract data type that maintains the order in which elements were added to it,
 * allowing the oldest elements to be removed from the front and new elements to be added to the rear.
 * This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue
 * (i.e., the one that has been waiting the longest) is always the first one to be removed.

 A basic queue has the following operations:

 Enqueue: add a new element to the end of the queue.
 Dequeue: remove the element from the front of the queue and return it.

 In this challenge, you must first implement a queue using two stacks. Then process queries,
 where each query is one of the following types:

 1 x: Enqueue element into the end of the queue.
 2: Dequeue the element at the front of the queue.
 3: Print the element at the front of the queue.

 */
public class TwoStacks {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

    private static class Data<T> {
        public Data<T> next;
        public T value;
    }

    public static class MyQueue<T> {

        private Data<T> first = null;
        private Data<T> last = null;

        public void enqueue(T value) {
             Data<T> entry = new Data<>();
             entry.value = value;

             if (first == null) {
                 first = entry;
             } else if (last == null) {
                 last = entry;
                 first.next = last;
             } else {
                 last.next = entry;
                 last = entry;
             }
        }

        public void dequeue(){
            if (first != null) {
                if (first.next == null) {
                    first = null;
                } else {
                    first = first.next;
                }
            }
        }

        public T peek() {
            return first.value;
        }
    }
}
