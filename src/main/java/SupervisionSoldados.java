import java.util.Scanner;

class Lectura {
    private static Scanner inp = new Scanner(System.in);

    public static int nextInt(String mss) {
        System.out.print(mss);
        return inp.nextInt();
    }
}

class FilaIndia {

  
    private int[] fila = new int[100];
    private int cantidad = 0;

    public void add(int soldado) {
        fila[cantidad] = soldado;
        cantidad++;
    }

    
    public void revisar(int[] comandantes, int[] subordinados) {

        for (int i = 0; i < comandantes.length; i++) {

            int posComandante = -1;
            int posSubordinado = -1;

            // Buscar posiciones en la fila
            for (int j = 0; j < cantidad; j++) {

                if (fila[j] == comandantes[i]) {
                    posComandante = j;
                }

                if (fila[j] == subordinados[i]) {
                    posSubordinado = j;
                }
            }

            
            if (posSubordinado < posComandante) {
                System.out.println("NO. " + comandantes[i] + "-" + subordinados[i]);
                return;
            }
        }

        System.out.println("SI");
    }
}

public class SupervisionSoldados {

    public static void main(String[] args) {

        FilaIndia filaI = new FilaIndia();
        int comandantes[], subordinados[];

        int n = Lectura.nextInt("Cuántos soldados en la fila: ");

        for (int i = 0; i < n; i++) {
            filaI.add(Lectura.nextInt("Siguiente soldado: "));
        }

        int s = Lectura.nextInt("Cuántos supervisados: ");

        comandantes = new int[s];
        subordinados = new int[s];

        for (int i = 0; i < s; i++) {
            comandantes[i] = Lectura.nextInt("Siguiente soldado supervisor: ");
            subordinados[i] = Lectura.nextInt("Siguiente soldado subordinado: ");
        }

        filaI.revisar(comandantes, subordinados);
    }
}