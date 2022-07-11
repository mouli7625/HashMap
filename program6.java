import java.util.*;
public class program6 {
    public static void main(String[]args)
    {
        HashMap<Integer, String> map=new HashMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
        System.out.println("The Original map: " + map);
        HashMap<Integer, String> map1=new HashMap<Integer,String>();
        map1=(HashMap)map.clone();
        System.out.println("Cloned map: " + map1); 

    }
    
}
