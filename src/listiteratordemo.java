import java.util.*;
public class listiteratordemo {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        for(int i=10; i<=15; i++){
            a.add(i);
        }
        System.out.println(a);
        ListIterator itr = a.listIterator();
        while(itr.hasNext()){
            Integer i = (Integer) itr.next();
            if(i%2==0){
                System.out.println(i);
            }else{
                System.out.println(i+"will be removed");
                itr.remove();
                System.out.println(a);
                itr.add("egtfarea");
                System.out.println("will be added");
                System.out.println(a);
                itr.set("truffuf");
                System.out.println(a);
            }

        }
    }
}
