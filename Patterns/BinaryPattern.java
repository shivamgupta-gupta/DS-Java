/*
    1111
    000
    11
    0
*/
package Patterns;

public class BinaryPattern {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=4;j>i;j--){
                if(i % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
