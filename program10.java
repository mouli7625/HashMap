import java.util.*;
public class program10 {
    public static void main(String[]args)
    {
        HashMap<Integer, String> map=new HashMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
       System.out.println(map.get(1));
       String val=(String)map.get(2);
       System.out.println(val);
       System.out.println(map.get(3));
    }
    
}
