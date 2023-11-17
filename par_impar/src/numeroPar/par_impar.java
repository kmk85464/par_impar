/**
 * 
 */
/**
 * 
 */
package numeroPar;
import java.util.Scanner;


public class par_impar {
	public static void main (string [] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce el numero:");
        num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.print("el numero"  +num+ "es par");
            }else{
                System.out.print("el numero" +num+ "es impar");
            }
}
}