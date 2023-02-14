public class Segment_Trees {

   static int []tree;
   public static void init(int n){
       tree = new int[4*n];
   }
   public static int buildSegmentTree(int[]a ,int start, int end, int i){
       if(start == end){
//           tree[i] = a[start];
           return tree[i] = a[start];
       }
       int mid = (start+end)/2;
       int left = buildSegmentTree(a,start,mid,2*i+1);
       int right = buildSegmentTree(a,mid+1,end,2*i+2);
//       tree[i] = left+right;
       tree[i] = tree[(2*i+1)]+tree[(2*i+2)];
       return tree[i];

   }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int n = a.length;
        init(n);
        buildSegmentTree(a,0,n-1,0);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i]+" ");
        }
    }
}
