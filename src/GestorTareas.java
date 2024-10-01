//Importamos la libreria
import java.util.Scanner;
public class GestorTareas {
    public static void main(String[] args) {
        //Creamos las variables y arrays que vamos a usar
        String[] tareas = new String[100];
        int[] prioridades = new int[100];
        int numTareas = 0;
        Scanner scanner = new Scanner(System.in);

        //usamos esta condicion mientras sea verdadera
        while (true) {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Completar tarea de mayor prioridad");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            //validamos las opciones
            switch (opcion) {
                case 1:
                if (opcion == 1 && numTareas < 100) {
                    System.out.print("Ingrese la tarea: ");
                    tareas[numTareas] = scanner.nextLine();
                    System.out.print("Ingrese la prioridad (1-5): ");
                    prioridades[numTareas] = scanner.nextInt();
                    numTareas++;
                } 
                case 2:
                    for (int i = 0; i < numTareas; i++) {
                        System.out.println(tareas[i] + " (Prioridad: " + prioridades[i] + ")");
                    }
                case 3:
                    int indiceMayorPrioridad = 0;
                    for (int i = 1; i < numTareas; i++) {
                        if (prioridades[i] > prioridades[indiceMayorPrioridad]) {
                            indiceMayorPrioridad = i;
                        }
                    }
                    System.out.println("Tarea completada: " + tareas[indiceMayorPrioridad]);
                    for (int i = indiceMayorPrioridad; i < numTareas - 1; i++) {
                        tareas[i] = tareas[i + 1];
                        prioridades[i] = prioridades[i + 1];
                    }
                    numTareas--;
                case 4:
                    break;
                default:
                System.out.println("Opción no válida o lista de tareas llena");
            }
        }
    }
}
