import java.util.*;
public class program8 {
    public static void main(String[]args)
    {
        HashMap<Integer, String> map=new HashMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("c"));


    }
    
}
