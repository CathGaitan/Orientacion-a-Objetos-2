package ar.edu.unlp.info.oo2.P3_ejercicio1;

public class Finished implements TareaState {
	public void start(ToDoItem toDoItem){}

	public void togglePause(ToDoItem toDoItem) {}
	
	public void finish(ToDoItem toDoItem){}
	
	public long workedTime(Duration duration){
		if(duration.getFechaInicio() == null) throw new RuntimeException("No se inicio la tarea");
		return duration.calcularDuracion();
	}
	
	public void addComment(ToDoItem toDoItem, String comment,Duration duration){
		if(duration.getFechaFin() == null) throw new RuntimeException("No se inicio la tarea");
		toDoItem.addComment(comment);
	}
}
