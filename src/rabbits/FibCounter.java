package rabbits;

import java.util.Scanner;

public class FibCounter {

    public int fibIter (int n) {
        if (n==0 || n==1)
            return n;
        int p=1;
        int pp=0;
        for (int i=2; i<=n; i++) {
            int tmp = pp + p;
            pp = p;
            p = tmp;
        }
        return p;

    }
    public int fibRec (int n) {
//        if (n==0 || n==1)
//            return n;
//        int tmp=fibRec(n-1) + fibRec(n-2);
//        return tmp;
        return n==0 || n==1? n : fibRec(n-1)+fibRec(n-2);
    }
}
