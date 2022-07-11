import java.util.*;
public class Main {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println("Values");
        for(Map.Entry m: map.entrySet())
        {
            System.out.println(m);
        }
        System.out.println("After clear() function");
        map.clear();
        System.out.print("New map = "+map);

    }
    
}
