
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/*
    Clase principal para manejar la gestión de tareas diarias

    Se tiene una clase principal Task y tres subclases Meeting, Shopping y PersonalChore.
    Un Task tiene parametros base que se utilizaran en cada subclase.
    La interface Postponable nos da un metodo adicional para posponer un Task

    El objetivo es crear una lista de Taks (Meeting, Shopping y PersonalChore)

    NOTA:
    Para esta practica los metodos solo deben imprimir un mensaje alucivo a la tarea que se realiza
    EX: "Atentiendo la reunion ......"
 */
public class Main {
    public static void main(String[] args) {
        // Crear una lista de tareas

        List<Task> tasks = new ArrayList<>();

        tasks.add( new Meeting("Reunion con los socios", 5, new Date(), "Medellin"));
        tasks.add( new Shopping("Comprar el mercado", 4, new Date()));
        tasks.add( new PersonalChore("Pasear al perro", 1, new Date()));

        for (Task i:tasks) {
            i.pefformTask();
            System.out.println(i.getDetails());

            // Verificar si una clase es instancia de otra
            if(i instanceof Meeting) {
              ((Postponable) i).postpone(5);
            }
        }
    }
}