import java.util.Date;

/*
    Clase PersonalChore
    1. Definir el constructor
    2. Definir metodos heredados
 */
class PersonalChore extends Task implements Postponable {

    public PersonalChore(String taskName, int priority, Date deadLine) {
        super(taskName, priority, deadLine);
    }

    @Override
    public void postpone(int days) {
        System.out.println("Se pospone " + days + " dias");
    }

    @Override
    void pefformTask() {
        System.out.println("Tarea en ejecución : " + this.taskName);
    }
}