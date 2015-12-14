import java.util.*;
class Exercice6 {
    
    public static void main(String [] args) {  

        int a[] = {-2,-1,0,1,2,3,4,5,6,7,8};
        int length = a.length;
        
        for (i=0; i<(a.length/2); i++) {
            int x = a[i];
            a[i] = a[a.length-(i+1)];
            a[a.length- (i+1)] = x;
        }
        System.out.println(Arrays.toString(a));
    }
}