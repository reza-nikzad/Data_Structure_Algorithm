public class SortDemo {
    public static void main(String[] args) {
        int[] a = {20, 1, 0, 6, -15, -60, 50, 100};

        /*Sort b = new Bubble(a);
        b.sort();
        System.out.println("Bubble sort: "+b.toString());

        b= new Selection(a);
        b.sort();
        System.out.println("Selection sort: "+b.toString());

        b= new Insertion(a);
        b.sort();
        System.out.println("Insertion sort: "+b.toString());

        b= new Shell(a);
        b.sort();
        System.out.println("Shell sort: "+b.toString());

        Shell s = new Shell(a);
        s.sort(3);
        System.out.println("Shell sort with gap: "+s.toString());

        b = new Merge(a);
        b.sort();
        System.out.println("Merge sort: "+b.toString());

        b = new DescendingMerge(a);
        b.sort();
        System.out.println("Descending Merge sort: "+b.toString());

        b= new Quick(a);
        b.sort();
        System.out.println("Quick sort: "+b.toString());

        int[] arr = {2,2,3,4,5,7,8,8,9,10};
        Sort c = new Counting(arr,1,10 );
        c.sort();
        System.out.println("Counting sort: "+c.toString());
*/
/*        Sort b= new RecursiveInsertion(a);
        b.sort();
        System.out.println("Insertion sort (Challenge recursive): "+b.toString());

        int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
        Sort s = new Radix(radixArray,10,4);
        s.sort();
        System.out.println("Radix: "+s.toString());*/

        String[] radixStrings = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };
        RadixString rs = new RadixString(radixStrings,5);
        rs.sort();
        System.out.println("Radix: "+rs.toString());

    }
}
