package Heaps;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Heap <Integer> heap = new Heap<>();

        heap.insert(33);
        heap.insert(90);
        heap.insert(12);


        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
