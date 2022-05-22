package dsa.heap;

public class BinaryHeap {
    int[] arr;
    int sizeOfHeap;

    public BinaryHeap(int size){
        arr = new int[size+1];
        this.sizeOfHeap= 0;
        System.out.println("Heap is created successfully!");
    }
    boolean isEmpty(){
        return sizeOfHeap==0;
    }
    boolean isFull(){
        return sizeOfHeap== arr.length-1;
    }

    int findParent(int node){
        int parent=0, flag=0;
        for (int i = 0; i < sizeOfHeap; i++) {
            if (arr[i] == node) {
                parent = (i - 1) / 2;
                flag =1;
                System.out.println("Parent of " + node + " at index "+i+" is: " + parent);
            }
        }
        if (flag==0)
            System.out.println(node + " is not a node of this heap.");
        return parent;
    }

    Integer peek(){
        if (isEmpty()) {
            System.out.println("Heap is empty!");
            return null;    // to return null return type must be Integer
        }
        else
            return arr[1];
    }

    int getSizeOfHeap(){
        return sizeOfHeap;
    }

    void insert(int val, String typeOfHeap){
        arr[sizeOfHeap+1]= val;
        sizeOfHeap++;
        // using sizeOfHeap as index cuz new element is inserted at sizeOfHeap
        heapify(sizeOfHeap, typeOfHeap);    // TimeComplexity: O(log n)
        System.out.println(val+" inserted!");
    }
    // hepify bottom to top
    void heapify(int idx, String typeOfHeap){
        int parent= idx/2;
        if (idx <= 1)
            return;
        if (typeOfHeap == "min"){
            if (arr[idx]<arr[parent]) {
                int tmp = arr[idx];
                arr[idx]= arr[parent];
                arr[parent]= tmp;
            }
        }
        else if (typeOfHeap == "max"){
            if (arr[idx] > arr[parent]) {
                int tmp = arr[idx];
                arr[idx]= arr[parent];
                arr[parent]= tmp;
            }
        }
        heapify(parent, typeOfHeap);
    }
    
    // levelOrderTraversal
    void printHeap(){
        int n= arr.length;
        for (int i = 1; i <= sizeOfHeap; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap(7);
        System.out.println("Is heap empty?: "+bh.isEmpty());
        System.out.println("Size of heap: "+bh.getSizeOfHeap());
        System.out.println("Peek: "+bh.peek());
        bh.insert(9, "min");
        bh.insert(1, "min");
        bh.insert(5, "min");
        bh.insert(5, "min");
        bh.insert(7, "min");
        bh.insert(2, "min");
        bh.insert(6, "min");
        bh.printHeap();
        System.out.println("Is heap empty?: "+bh.isEmpty());
        System.out.println("Size of heap: "+bh.getSizeOfHeap());
        System.out.println("Is heap full?: "+bh.isFull());
        System.out.println("Peek: "+bh.peek());
        bh.findParent(11);
        bh.findParent(1);

    }
}
