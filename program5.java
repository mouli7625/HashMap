import java.util.*;
public class program5 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println("Values");
       boolean x= map.isEmpty();
        System.out.println(x);
        map.clear();
        System.out.print(map.isEmpty());

    }
    
}
