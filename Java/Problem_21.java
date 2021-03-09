import java.lang.reflect.Array;
import java.lang.reflect.Method;

class Printer {
    public static <E> void printArray(E[] Array) {      //Generic method
        for(E item : Array) {
            System.out.println( item);
        }
    }
}

public class Problem_21 {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {     // Loop is used to ensure that there is no method overloading
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }
        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}