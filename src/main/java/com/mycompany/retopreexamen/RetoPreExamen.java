/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

class Lectura {
  private static Scanner inp = new Scanner(System.in);
  public static int nextInt(String mss) {
    System.out.print(mss);
    return inp.nextInt();
  }
}

class FilaIndia 

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