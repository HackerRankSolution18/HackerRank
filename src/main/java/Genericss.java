import java.lang.reflect.Method;

class Printer{
    public static <E> void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.println(element);
        }
    }
}
public class Genericss {
    public static void main(String[] args) {
        Printer print=new Printer();
        Integer[] intArray = {1, 2 ,3};
        String[] stringArray = {"Hello", "World"};
        print.printArray(intArray);
        print.printArray(stringArray);
        int count = 0;
        for(Method method: Printer.class.getDeclaredMethods()){
            String name = method.getName();
            if(name.equals("printArray"))
                count++;
        }
        if(count>1)
            System.out.println("Method overloading is not allowed!");
        assert count==1;
    }
}
