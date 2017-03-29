package dm507projekt2;

import java.util.Scanner;

/**
 * Created by karim møller on 29-03-2017.
 */
public class TreeSort {
    public static void main(String[] args) {

        DictBinTree tree = new DictBinTree();

        int n = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            i = sc.nextInt();
            n++;
            tree.insert(i);
        }
        int[] nodes = tree.orderedTraversal();

        for(int k =0; k < n; k++){
            System.out.println(nodes[k]);

        }
    }
}
