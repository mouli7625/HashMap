import java.util.*;
public class program1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, String> map=new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Orange");
        map.put(3,"Apple");
        map.put(4,"Grapes");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }

}