public class Heap_Sort {
    public static void heap_sort(int []a){
//        Step1-build maxHeap
        int n = a.length;
        for(int i=n/2;i>=0;i--){
            heapify(i, n, a);
        }

//        Step2-push largest at end
        for(int i = n-1; i>0; i--){
//            swap
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(0, i, a);
        }
    }
    public static void heapify(int i, int size, int []a){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left<size && a[left]>maxIdx)
            maxIdx = left;
        if(right<size && a[right]>maxIdx)
            maxIdx = right;
        if(maxIdx!=i){
            int temp = a[i];
            a[i] = a[maxIdx];
            a[maxIdx] = temp;
            heapify(maxIdx, size, a);
        }
    }

    public static void main(String[] args) {
        int []a = {5,4,3,2,1};
        heap_sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
