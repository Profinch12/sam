import java.util.*;
public class arraylistdemol {
    public static void main(String[]args) {
        ArrayList l = new ArrayList();
        l.add("a");
        l.add(10);
        l.add(null);
        System.out.println(l);
        l.add("apple");
        System.out.println(l);
        l.add("laddu");
        System.out.println(l);
        l.remove("laddu");
        System.out.println(l);
        ArrayList s = new ArrayList();
        s.add("AJ");
        s.add("SAM");
        s.add("ASIM");
        s.add("EASHAN");
        s.add("RAVI DON");
        s.add("Bhai");
        l.addAll(s);
        System.out.println(s);
        System.out.println(l);
        s.remove("RAVI DON");
        System.out.println(s);
        s.removeAll(s);
        System.out.println(s);
        s.retainAll(l);
        System.out.println(l);
        s.clear();
        System.out.println(s);
        l.contains("wdf");
        System.out.println(l.contains("wdf"));
        l.isEmpty();
        System.out.println(l.isEmpty());
        System.out.println(l.size());



    }

}
