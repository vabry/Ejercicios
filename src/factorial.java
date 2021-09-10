
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhon.vallejo
 */
public class factorial {
    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     int a;
     long fact=1;
     a = scan.nextInt();
        if (a==0) {
            System.out.println (fact);   
        }
        else {
            for (int i = a; i > 0; i--) {
             fact=fact*i;
             }
            System.out.println (fact);
        }
     
    }
    
}
