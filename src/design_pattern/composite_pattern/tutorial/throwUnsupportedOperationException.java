package composite_pattern.tutorial;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * API document:
 * asList
     @SafeVarargs
     public static <T> List<T> asList(T... a)
     Returns a fixed-size list backed by the specified array. (Changes to the returned list "write through" to the array.)
     This method acts as bridge between array-based and collection-based APIs, in combination with Collection.toArray().
     The returned list is serializable and implements RandomAccess.
     This method also provides a convenient way to create a fixed-size list initialized to contain several elements:

     List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
 */


/**
 * Tutorial:
 * when using Arrays.asList() and then call add，remove etc. method, it throws Exception :
 *  java.lang.UnsupportedOperationException.
 *
 * The reason is that Arrays.asList() returns **java.util.Arrays$ArrayList**， not **ArrayList**.
 * Arrays$ArrayList and ArrayList are all inheritance of **AbstractList**，remove，add method is defined in AbstractList
 * as default **throw UnsupportedOperationException**, with no action.
 * However, ArrayList override these method to do operation on list，but Arrays$ArrayList
 * did not override remove()，add() etc. So **throw UnsupportedOperationException**
 *
 * Only *remove* and *add* reports exception, others are fine
 */


/**
 * Created by Nianzu on 3/21/2015.
 */
public class throwUnsupportedOperationException {

    public static void main(String[] args) {
        //normalList();
        //list_fromIntArray();
        list_fromIntegerArray();
        //list_fromStringArray();
    }

    public static void list_fromStringArray(){
        String[] array = new String[3];
        List list = Arrays.asList(array);

        array[0] = "test";
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        list.add("test");

        //created as new list in this way, it will act as normal list
        //List newList = new ArrayList(list);
        //newList.add("test2");
    }

    /**
     * Tutorial (about different behavior of list_StringArray and list_IntArray):
     * There is no **automatic autoboxing** done of the underlying ints in Arrays.asList.
     * int[] is actually an object, not a primitive.
     * Here Arrays.asList(example) returns List<int[]>. List<int> is indeed invalid syntax.
     * You could use:
     * List<Integer> exampleList = Arrays.asList(ArrayUtils.toObject(array));
     * using Apache Commons ArrayUtils.
     */
    public static void list_fromIntArray(){
        int[] array = new int[3];
        array[0] = 23;
        array[1] = 23;
        array[2] = 23;
        List arrayList = Arrays.asList(array);
        System.out.println(array[1]);
        System.out.println(arrayList.get(0));
        //System.out.println(arrayList.get(1));  // out of index error

        //cannot add, since the list is fixed
        arrayList.add(23);

        // it is wrong to do
        //arrayList.set(0, 2);

        // it is fine to do **set** operation
        //int[] newArray = new int[3];
        //arrayList.set(0, newArray);
    }

    /**
     * This method does not report Exception
     */
    public static void list_fromIntegerArray(){
        Integer[] array = new Integer[3];
        array[0] = 23;
        array[1] = 23;
        array[2] = 23;
        List arrayList = Arrays.asList(array);
        System.out.println(array[1]);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));  // act normal

        arrayList.add(23);  // unsupportedOperationException, since the list is fixed
        //arrayList.set(0, 2);  // **set** operation is OK, only **remove** and **add** is not OK
        System.out.println(arrayList.get(0));

    }

    public static void normalList(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.set(1, 23);

        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
