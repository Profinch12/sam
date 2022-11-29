import java.util.*;
public class enumerationdemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i <= 10; i++)
        {
            v.addElement(i);
        }
        System.out.println(v);

        Enumeration E =v.elements();
        while(E.hasMoreElements())
        {
            Integer i=(Integer) E.nextElement();
            if(i%2==0)
                System.out.println(i);
            else {
                System.out.println(i+"will be removed");
                v.remove(i);
                System.out.println(v);
            }
        }
    }
}
