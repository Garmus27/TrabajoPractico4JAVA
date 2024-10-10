import java.util.Scanner;

public class MaquinaExpendedora {


    Scanner sc = new Scanner(System.in);

    public void pedirGolosina(int fila,String[][] matriz){

        int stock = Integer.parseInt(matriz[fila][2]);

        if(Integer.parseInt(matriz[fila][2])==0){
            System.out.println("No quedan mas!, elige otra wea");
            
        } else {
            System.out.println("Aqui tienes tu: "+matriz[fila][0]);
            matriz[fila][2]= String.valueOf(stock - 1);
        }

    }

    public void mostrarGolosina(String[][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matriz[i].length; j++) {
                if(j!=1){
                    System.out.print(matriz[i][j]+" ");
                }
            }
        }


    }

    public void rellenarGolosina(String[][] matriz){

        String valida = "AdminXYZ";

        System.out.println(" Ingrese contraseña de administrador");

        String pass = sc.nextLine();

        if(pass.equals(valida)){

            System.out.println("Ingrese la golosina que desea recargar");
            String golosona = sc.next();
            System.out.println("Ingrese la cantidad que desea recargar");
            int cantidad = sc.nextInt();

            for (int i = 0; i < golosona.length(); i++) {
                if(matriz[i][0].equals(golosona)){
                    int stock = Integer.parseInt(matriz[i][2])+cantidad;
                    matriz[i][2]= String.valueOf(stock);
                    break;
                }else{
                    System.out.println("La golosina no se encontro");
                }
            }
        }else{
            System.out.println("La contraseña no es correcta");
        }


    }



}
