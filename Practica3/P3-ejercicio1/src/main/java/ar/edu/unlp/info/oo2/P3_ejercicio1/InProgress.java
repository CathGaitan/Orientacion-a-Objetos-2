package ar.edu.unlp.info.oo2.P3_ejercicio1;

public class InProgress implements TareaState {
	
	public void start(ToDoItem toDoItem){}

	public void togglePause(ToDoItem toDoItem) {
		toDoItem.setState(new Paused());
	}
	
	public void finish(ToDoItem toDoItem){
		toDoItem.setState(new Finished());
	}
	
	public long workedTime(Duration duration){
		if(duration.getFechaInicio() == null) throw new RuntimeException("No se inicio la tarea");
		return duration.calcularDuracion();
	}
	
	public void addComment(ToDoItem toDoItem, String comment,Duration duration){
		if(duration.getFechaFin() == null) throw new RuntimeException("No se inicio la tarea");
		toDoItem.addComment(comment);
	}
}
