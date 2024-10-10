import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funciones fun = new Funciones();

        System.out.println("Ingresa el numero correspondiente al ejercicio a verificar: ");
        int ejercicio = sc.nextInt();
        if (ejercicio == 1) {

            String[][] paises = new String[4][4];

            System.out.println(" A continuacion deberas ingresar 4 paises y 4 ciudades de cada uno de esos paises ");

            for (int i = 0; i < 4; i++) {
                System.out.println("Ingresa un pais");
                paises[i][0] = sc.next();
                for (int j = 1; j < 4; j++) {
                    System.out.println("ingresa la ciudad numero");
                    paises[i][j] = sc.next();
                }
            }
            fun.mostrarMatriz(paises);

        }
        else if (ejercicio == 2) {

            System.out.println("Ingrese 2 numeros enteros para determinar la longitud de una matriz");
            int x = sc.nextInt();
            int y = sc.nextInt();

            int[][] matriz1 = fun.crearYrellenarrMatrizPorConsola(x, y);
            int[][] matriz2 = fun.crearYrellenarrMatrizPorConsola(y, x);
            int[][] matriz3 = new int[x][y];

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    matriz3[i][j] = matriz1[i][j] * matriz2[j][i];
                }
            }

            fun.mostrarMatriz(matriz3);


        }
        else if (ejercicio == 3) {
            boolean valido = false;
            int x = 0;
            do {
                System.out.println("Ingresa 1 valor mayor o igual a 3 y menor o igual a 10 para determinar la longitud de una matriz");
                x = sc.nextInt();
                if (x >= 3 && x <= 10) {
                    valido = true;
                }
            } while (!valido);

            int[][] matriz = fun.crearYrellenarrMatrizPorConsola(x, x);

            int[] array = new int[x];

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    array[i] = array[i] + matriz[j][i];

                }
            }
            System.out.println("matriz: ");
            fun.mostrarMatriz(matriz);
            System.out.println("");
            System.out.println("array: ");
            for (int i = 0; i < x; i++) {
                System.out.print(array[i]);
            }
        }
        else if (ejercicio == 4) {
            System.out.println("Ingrese un numero para determinar la longitud de una matriz");
            int x = sc.nextInt();
            boolean valido = false;
            int[][] matriz = fun.crearYrellenarrMatrizPorConsola(x, x);
            int fila = 0;
            int columna = 0;

            while (!valido) {
                System.out.println("Sumaremos todos los valores de una fila, indique que fila del arreglo quiere sumar");
                fila = sc.nextInt();
                if (fila >= 0 && fila < x) {
                    valido = true;
                } else {
                    System.out.println("La fila ingresada no corresponde a una fila de la matriz");
                }
            }
            int sumaFilas = 0;
            for (int i = 0; i < x; i++) {
                sumaFilas = sumaFilas + matriz[fila][i];
            }

            valido = false;

            while (!valido) {
                System.out.println("Sumaremos todos los valores de una columna, indique que columna del arreglo quiere sumar");
                columna = sc.nextInt();
                if (columna >= 0 && columna < x) {
                    valido = true;
                } else {
                    System.out.println("La columna ingresada no corresponde a una columna de la matriz");
                }
            }
            int sumaColumnas = 0;
            for (int i = 0; i < x; i++) {
                sumaColumnas = sumaColumnas + matriz[i][columna];
            }
            int sumaDiagonal = 0;
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if (i == j) {
                        sumaDiagonal = sumaDiagonal + matriz[j][i];
                    }
                }
            }

            int sumaDiagonalInversa = 0;
            for (int i = x - 1; i > 0; i--) {
                for (int j = x - 1; j > 0; j--) {
                    if (i == j) {
                        sumaDiagonalInversa = sumaDiagonalInversa + matriz[j][i];
                    }
                }
            }

            fun.mostrarMatriz(matriz);
            System.out.println("");
            System.out.println("La sumatoria de la fila n°" + fila + " es: " + sumaFilas);
            System.out.println("La sumatoria de la columna°" + columna + " es: " + sumaColumnas);
            System.out.println("La sumatoria de la diagonal: " + sumaDiagonal);
            System.out.println("La sumatoria de la diagonal Inversa es: " + sumaDiagonalInversa);
            int suma = 0;
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    suma = +matriz[i][j];
                }
            }
            System.out.println("El promedio de la matriz es: " + suma / (x * x));


        }
        else if (ejercicio == 5) {

            int totalVentas = 0;
            boolean salir =false;

            MaquinaExpendedora maq = new MaquinaExpendedora();

            String[][] golosinas = {
                    {"KitKat", "32", "10"},
                    {"Chicles", "2", "50"},
                    {"Caramelos de Menta", "2", "50"},
                    {"Huevo Kinder", "25", "10"},
                    {"Chetoos", "30", "10"},
                    {"Twix", "26", "10"},
                    {"M&M'S", "35", "10"},
                    {"Papas Lays", "40", "20"},
                    {"Milkybar", "30", "10"},
                    {"Alfajor Tofi", "20", "15"},
                    {"Lata Coca", "50", "20"},
                    {"Chitos", "45", "0"}
            };

            System.out.println(" Bienvenido a la mas mejor masquian expendedora");


            do {
                System.out.println(" ");
                System.out.println("elige una opcion");
                System.out.println("1-Pedir Golosina\n2-Mostrar Golosinas\n3-Rellenar golosinas\n4-Apagar Maquina\n5-Salir");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el numero correspondiente a la golosina");
                        int numGolosina = sc.nextInt();
                        maq.pedirGolosina(numGolosina, golosinas);
                        totalVentas = totalVentas + Integer.parseInt(golosinas[numGolosina][1]);
                        break;
                    case 2:
                        maq.mostrarGolosina(golosinas);
                        break;
                    case 3:
                        maq.rellenarGolosina(golosinas);
                        break;
                    case 4:
                        System.out.println("El total de ventas del dia es de " + totalVentas + "\nApagando sistema, chau!");

                    case 5:
                        salir = true;
                    default:
                        System.out.println("Opcion no valida");
                        break;

                }

            }while (!salir);
        }
    }
}
