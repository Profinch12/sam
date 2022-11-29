import java.sql.SQLOutput;
import java.util.LinkedList;
public class linkedlistdemo {
        public static void main(String[] args) {
            LinkedList l = new LinkedList();
            l.add("badvel");
            l.add(56);
            l.add("Bang");
            System.out.println(l);
            l.addFirst("samfirst");
            System.out.println(l);
            l.addLast("samLast");
            System.out.println(l);
            l.removeFirst();
            System.out.println(l);
            l.removeLast();
            System.out.println(l);
            System.out.println(l.getFirst());
            System.out.println(l.getLast());
            l.push("AJ");
            l.push(67);
            System.out.println(l);
            l.pop();
            System.out.println(l);
            l.pop();
            System.out.println(l);
            l.peek();
            System.out.println(l.peek());
            }
    }

