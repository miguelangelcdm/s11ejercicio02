/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11ejercicio02;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class S11ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese 2 letras");
        String str=input.nextLine();
        char carrera=Character.toUpperCase(str.charAt(0));
        char nivel=str.charAt(1);
        switch(carrera){
            case 'M':System.out.println("matematicas");break;
            case 'C':System.out.println("ciencias compu");break;
            case 'I':System.out.println("tec. info.");break;
            default:System.out.println("Entrada invalida");System.exit(1);
        }
        switch(nivel){
            case '1':System.out.println("freshman");break;
            case '2':System.out.println("sophomore");break;
            case '3':System.out.println("junior");break;
            case '4':System.out.println("senior");break;
            default: System.out.println("invalid");System.exit(1);
        }
    }
    
}
