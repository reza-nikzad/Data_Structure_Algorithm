public class PracticeHeap {

    private int size;
    private int[] heap;

    public PracticeHeap(int capacity) {
        size = 0;
        heap = new int[capacity];
    }

    public void insert(int input){
        if(isFull()){
            throw  new IndexOutOfBoundsException("Heap is full");
        }

        heap[size] = input;
        this.aboveHeapify();
        size++;
    }

    public void aboveHeapify(){
        int child = size;
        int parent = getParent(child);
        while(parent>=0 && heap[child]>heap[parent]) {
            swap(child, parent);
            child = parent;
            parent = getParent(child); 
        }
    }

    public void swap(int a , int b){
        int temp;
        temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public int getParent(int child){
        if(child%2==0){
            return (child-1)/2;
        }else{
            return (child/2)-1;
        }
    }

    public boolean isFull(){
        return size >= heap.length;
    }

    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]+", ");
        }
        System.out.println();
    }
}
