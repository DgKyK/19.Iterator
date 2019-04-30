public class TestClass {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 2, 4};
        MyArrays coll = new SimpleArray(arr);
        MyIterator it = coll.getIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
