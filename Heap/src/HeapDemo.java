public class HeapDemo {
    public static void main(String[] args) {
        Heap heap = new Heap(15);
        heap.insert(20);
        heap.insert(19);
        heap.insert(15);
        heap.insert(18);
        heap.insert(14);
        heap.insert(4);

        heap.printHeap();
//        heap.insert(22);
        heap.sort();
        heap.printHeap();
    }
}
