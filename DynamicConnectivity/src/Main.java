import edu.princeton.cs.algs4.StdOut;

public class Main {
    public static void main(String[] args){
//        QuickFind  QF = new QuickFind(10);
//        QF.union(3,4);
//        QF.union(4,8);
//        QF.union(3,9);
//        QF.union(0,1);
//        QF.union(0,9);
//        System.out.println(QF.connected(8,0));

        QuickUnion QU = new QuickUnion(10);
        QU.union(3,4);
        QU.union(5,6);
        QU.union(3,5);
        QU.union(8,9);
        QU.union(3,8);
        QU.union(0,1);
        QU.union(0,5);

        StdOut.println(QU.connected(9,2));
        StdOut.println(QU.connected(9,2));
        StdOut.println(QU.connected(5,4));
        StdOut.println(QU.connected(0,6));
    }
}
