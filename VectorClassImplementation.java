import java.util.*;
class VectorExample
{
public static void main(String args[])
{
Vector fruits = new Vector ();
fruits.add("Apple");
fruits.add("Orange");
fruits.add("Grapes");
fruits.add("Pineapple");
Iterator it = fruits.iterator();
while (it.hasNext())
{
System.out.println(it.next);
}
}
}