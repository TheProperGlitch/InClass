
public class Main {

    static int ref = 2;

    static int[] change(int[][] dual){
        int[] ar = new int[dual.length * ref];
        int amount = ref;
        for (int i = 0; i < dual.length ; i++){
            for (int j = 0; j < amount ; j++) {
                ar[j + i*amount] = dual[i][j];
            }
        }
        return ar;
    }

    int[][] changeBack(int[] single){
        for int i 
    }
    public static void main(String[] args) {
    int[] one = {0,1};
    int[] two = {2,3};
    int[] three = {4,5};
    int[][] all = {one, two, three};
    int[] next = change(all);
    System.out.println();
    for(int i = 0 ; i < next.length ; i++){
        System.out.print(next[i]);
    }

    }
}
    