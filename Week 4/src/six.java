public class six {
    public static void main(String[] args){
        int a[] = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int b[] = {11, 11, 7, 9, 16, 4, 1};
        boolean setSim = setComp(a, b);
        if(setSim){
            System.out.print("Set have similar element");
        }else{
            System.out.print("Set do not have similar element");
        }
    }

    public static boolean setComp(int[] a, int[] b) {
        for(int i = 0; i < a. length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
