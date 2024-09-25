package eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class EVA1_17_CONTROL_ACCESO {

    public static void main(String[] args) {
        String usu, cont;
        
        Scanner cap;
        
        cap=new Scanner(System.in);
        
        System.out.println("Usuario");
        usu=cap.nextLine();
        System.out.println("Contraseña");
        cont=cap.nextLine();
        
        if(usu.equals("Admin") && cont.equals("1234")){
            System.out.println("Acceso concedido :)");
            
        }else{
            System.out.println("Acceso denegado :( ");
        }

    }
    
}
