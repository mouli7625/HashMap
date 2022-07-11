import java.util.*;
public class program11 {
    public static void main(String[]args)
    {
        HashMap<Integer, String> map=new HashMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
       Set keyset =map.keySet();
       System.out.println(keyset);
    }
    
}
