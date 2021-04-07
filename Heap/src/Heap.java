public class Heap {
    private int size;
    private int[] heap;

    public Heap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int num){
        if(isFull()){
            throw new IndexOutOfBoundsException(" Heap is full");
        }

        heap[size] = num;
        fixHeapAbove(size);
        size++;

    }


    public int delete(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty.");
        }
        int parent = getParent(index);
        int deletedValue = heap[index];

        if(index ==0 || heap[index]<heap[parent]){
            fixHeapDown(index, size -1 );
        }
        else{
            fixHeapAbove(index);
        }

        size--;
        return deletedValue;
    }

    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException(" Heap is empty") ;
        }
        return heap[0];
    }

    public void sort(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        int lastIndex = size-1 ;
        while(lastIndex>0){
            swap(0, --lastIndex);
            fixHeapDown(0,lastIndex-1);
        }
    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        while(heap[getParent(index)] < newValue){
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

    public void fixHeapDown(int index, int lastHeapIndex){
        int childToSwap;

        while(index <= lastHeapIndex){
            int leftChild = getChild(index , true);
            int rightChild = getChild(index, false);
            if(leftChild <= lastHeapIndex){
                if(rightChild > lastHeapIndex){
                    childToSwap = leftChild;
                }
                else{
                    childToSwap = (heap[leftChild]> heap[rightChild] ? leftChild : rightChild);
                }

                if(heap[index] < heap[childToSwap]){
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
                }else {
                    break;
                }


            }else{
                break;
            }
        }

    }

    public int getParent(int index){
        return (index - 1) / 2;
    }

    public int getChild(int index, boolean left){
        if(left){
            return 2*index+1;
        }else{
            return 2*index+2;
        }
    }

    public boolean isEmpty(){
        return size < 1;
    }

    public boolean isFull() {
        return size >= heap.length;
    }

    public void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]+", ");
        }
        System.out.println();
    }
}
