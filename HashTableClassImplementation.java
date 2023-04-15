import java.util.*;
public class HashTableExample
{
public static void main (String args[])
{
Hashtable ht = new Hashtable();
ht.put("Item 1","Apple");
ht.put("Item 2","Orange");
ht.put("Item 3","Grapes");
ht.put("Item 4","Pine");
ht.put("Item 5","Kiwi");
Enumeration e = ht.keys();
while(e.hasMoreElements())
{
String str = (String) e.nextElement();
System.out.println(ht.get(str));
}
}
}