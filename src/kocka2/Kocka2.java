//Dobszay Dorka
package kocka2;

import java.util.Scanner;

public class Kocka2 {
    static Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {
        int dobas = 0;
        int MAX_CSILLAG=40;
        System.out.print("Kérek egy számot: ");
        dobas = sc.nextInt();
        while (dobas<1){
            System.out.print("Hibás. Kérek egy számot: ");
            dobas = sc.nextInt();
        }
        final int OLDALAKSZAMA=12;
        int [] tomb= new int [OLDALAKSZAMA+1];
        for (int i = 0; i < tomb.length; i++) {
            int random =(int) (Math.random()*12+1);
        System.out.println(dobas +" db --> " + random +" cs");
            
        }
        String csillag = "*";
        while (dobas<MAX_CSILLAG){
//            csillag*;
        }
                
        
        
//        System.out.print(n/csillag*MAX_CSILLAG);
        
        
    }

    
}
