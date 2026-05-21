
import java.util.Scanner;

class Lectura {
  private static Scanner inp = new Scanner(System.in);
  public static int nextInt(String mss) {
    System.out.print(mss);
    return inp.nextInt();
  }
}

class FilaIndia {


    int[] fila = new int[100];
    int tamaño = 0;

    // Agregar soldados a la fila
    public void add(int soldado) {
        fila[tamaño] = soldado;
        tamaño++;
    }

    // Buscar posición de un soldado
    public int posicion(int soldado) {
        for (int i = 0; i < tamaño; i++) {
            if (fila[i] == soldado) {
                return i;
            }
        }
        return -1;
    }

}


public class SupervisionSoldados {
	public static void main(String[] args) {
		FilaIndia filaI = new FilaIndia();
		int comandantes[], subordinados[];

		int n = Lectura.nextInt("Cuántos soldados en la fila: ");
		for (int i = 0; i < n; i++)
		  filaI.add(Lectura.nextInt("Siguiente soldado: "));

		int s = Lectura.nextInt("Cuántos supervisados: ");
		comandantes = new int[s];
		subordinados = new int[s];
		for (int i = 0; i < s; i++) {
		  comandantes[i] = Lectura.nextInt("Siguiente soldado supervisor: ");
		  subordinados[i] = Lectura.nextInt("Siguiente soldado sobordinado: ");
		}
		filaI.revisar(comandantes, subordinados);
	}
}