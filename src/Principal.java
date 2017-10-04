
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550549
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sC = new Scanner(System.in);
        System.out.println("INDICA EL TAMAÑO DEL ARREGLO");
        int iTamaño = sC.nextInt();
         int ArreUsuario[] = new int [iTamaño];
        for (int i = 0; i < iTamaño; i++) {
            System.out.println("LLENA LOS VALORES DEL ARREGLO [" + i + "]");
            ArreUsuario[i] = sC.nextInt();
        }
        //MAYOR
        for (int i = 0; i < iTamaño; i++) {
            for (int j = 0; j < 10; j++) {
                //NO ESTA TERMINADO
            }
        }
        //MENOR
        for (int i = 0; i < iTamaño; i++) {
            for (int j = 0; j < 10; j++) {
                // NO ESTA TERMINADO
            }
        }
        
    }
    
}
