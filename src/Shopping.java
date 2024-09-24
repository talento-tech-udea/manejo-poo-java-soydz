import java.util.Date;
/*
    Clase Shopping
    1. Definir el constructor
    2. Definir metodos heredados
 */
class Shopping extends Task {

    public Shopping(String taskName, int priority, Date deadLine) {
        super(taskName, priority, deadLine);
    }

    @Override
    public void pefformTask() {
        System.out.println("Tarea en ejecución : " + this.taskName);
    }
}