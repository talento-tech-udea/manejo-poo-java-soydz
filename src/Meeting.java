import java.util.Date;

/*
    Clase Meeting
    1. Definir el constructor con un parametro adicional
    - location
    2. Definir metodos heredados
 */
class Meeting extends Task implements Postponable {

    private String location;

    public Meeting(String taskName, int priority, Date deadLine, String location) {
        super(taskName, priority, deadLine);
        this.location = location;
    }

    @Override
    public void postpone(int days) {
        System.out.println("Se pospone " + days + " dias");
    }

    @Override
    void pefformTask() {
        System.out.println("Tarea en ejecución : " + this.taskName + " en " + this.location);
    }
}