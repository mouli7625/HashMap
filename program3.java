import java.util.*;
public class program3
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, String> map=new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Orange");
        map.put(3,"Apple");
        map.put(4,"Grapes");
        HashMap<Integer, String> map2=new HashMap<Integer,String>();
        map2.put(5, "a");
        map2.put(6, "b");
        map2.put(7, "c");
        map2.putAll(map);
        System.out.println(map2);


    }

}