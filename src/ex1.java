void main(String[] args) {
        Scanner aitor = new Scanner(System.in);

        System.out.println("Cuantas filas quieres?");
        int filas = aitor.nextInt();

        System.out.println("Cuantas columnas quieres?");
        int columnas = aitor.nextInt();

        int[][] matriz = new int[filas][columnas];
        int[] sumas = new int[columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Pon un numero:");
                matriz[i][j] = aitor.nextInt();
            }
        }

        for (int j = 0; j < columnas; j++) {
            int suma = 0;

            for (int i = 0; i < filas; i++) {
                suma = suma + matriz[i][j];
            }

            sumas[j] = suma;
        }

        for (int j = 0; j < columnas; j++) {
            System.out.println("Suma columna " + (j + 1) + ": " + sumas[j]);
        }

        aitor.close();
    }
