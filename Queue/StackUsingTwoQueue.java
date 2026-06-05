package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {

    public static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push
        public static void add(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();

                    if (q1.isEmpty()) {
                        break;
                    }

                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();

                    if (q2.isEmpty()) {
                        break;
                    }

                    q1.add(top);
                }
            }

            return top;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();

                    if (q1.isEmpty()) {
                        break;
                    }

                    q2.add(top);
                }

                q2.add(top); // put top back
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();

                    if (q2.isEmpty()) {
                        break;
                    }

                    q1.add(top);
                }

                q1.add(top); // put top back
            }

            return top;
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.add(1);
        s.add(2);
        s.add(3);

        while (!s.isEmpty()) {
            System.out.println("Top = " + s.peek());
            s.remove();
        }
    }
}