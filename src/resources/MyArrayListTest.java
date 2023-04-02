package resources;
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList<>();
        list.add(123);
        list.add("String");
        list.add('c');
        list.add(true);

        list.set(3, false);

        list.remove(2);
        list.add(2, 'a');

        System.out.println("MyArrayList Size = " + list.size());

        System.out.print("ArrayList遍历: ");

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println(list.get(2));
    }
}

