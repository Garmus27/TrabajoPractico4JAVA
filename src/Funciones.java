import java.util.Scanner;

public class Funciones {

    Scanner sc = new Scanner(System.in);

    public void mostrarMatriz(String[][] array){

        for (String[] strings : array) {
            System.out.println("");
            for (String string : strings) {
                System.out.print(string + " ");
            }
        }
    }

    public void mostrarMatriz(int[][] array){

        for(int i = 0; i < array.length; i++){
            System.out.println("");
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public void mostrarMatriz(double[][] array){

        for(int i = 0; i < array.length; i++){
            System.out.print(" ");
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public void rellenarColumna(String[][] array, int columna){

        int numeroFilas=array.length;

        for(int i = 0; i < array.length; i++){

            System.out.print("ingrese un valor");
            array[i][columna] = sc.nextLine();

        }

    }

    public void rellenarFila(String[][] array, int fila){

        int numColumnas=array[0].length;

        for(int i = 0; i < numColumnas; i++){
            System.out.print("ingrese un valor");
            array[fila][i]= sc.nextLine();
        }
    }

    public int[][] crearYrellenarrMatrizPorConsola(int x, int y){

        System.out.println("Ahora procederemos a rellenarla, ingresa los valores q deseas guardar en la matriz");
        int [][] matriz = new int[x][y];

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;
    }




}
