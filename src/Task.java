import java.util.Date;

/*
    Clase abstracta Task
    1. Definir el constructor y los parametros para la clase
    - taskName
    - prority
    - deadline

    2. Definir el metodo abstracto
    - performTask

    3. Crear un metodo que retorne un String para obtener los detalles de un Task
    - getDetails
 */
abstract class Task {
    protected String taskName;
    private int priority;
    private Date deadLine;

    public Task(String taskName, int priority, Date deadLine) {
        this.taskName = taskName;
        this.priority = priority;
        this.deadLine = deadLine;
    }

    abstract void pefformTask();

    public String getDetails() {
        return "Tarea: " + this.taskName + " con prioridad " + this.priority + " y fecha limite " + this.deadLine;
    }
}