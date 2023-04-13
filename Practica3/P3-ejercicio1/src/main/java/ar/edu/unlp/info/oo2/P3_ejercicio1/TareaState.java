package ar.edu.unlp.info.oo2.P3_ejercicio1;

public interface TareaState {
	public void start(ToDoItem toDoItem);
	public void togglePause(ToDoItem toDoItem);
	public void finish(ToDoItem toDoItem);
	public long workedTime(Duration duration);
	public void addComment(ToDoItem toDoItem,String comment, Duration duration);
	
}
