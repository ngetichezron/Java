import java.util.*;
public class StackExample
{
public static void main (String args[])
{
Stack st = new Stack ();
st.push("Java");
st.push("Classes");
st.push("Objects");
st.push("Multithreading");
st.push("Programming");
System.out.println("The elements in the Stack : " + st);
System.out.println("The elements at the top of Stack : " + st.peek());
System.out.println("The elements popped out of the Stack : " + st.pop());
System.out.println("The elements in the Stack after pop of the element : " + st);
System.out.println("The result of search : " + st.search ("r e"));
}
}