package com.app.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {

	public ToDoService doService;
	
	public ToDoBusiness(ToDoService doService) {
		this.doService = doService;
	}
	
	public List<String>getTodosforSpring(String user){
		List<String>retrievedtodos = new ArrayList<String>();
		List<String>todos = doService.getTodos(user);
		
		for(String todo :todos) {
			if(todo.contains("Spring")) {
				retrievedtodos.add(todo);
			}
		}
		return retrievedtodos;
	}
	
	public List<String>getTodosforHibernate(String user){
		List<String>hibernatelist = new ArrayList<String>();
		List<String>Combinedlist = doService.getTodos(user);
		
		for(String todo: Combinedlist) {
			if(todo.contains("Hibernate")) {
				hibernatelist.add(todo);
			}
		}
		return hibernatelist;
	}
	
	public void deleteTodosNotRelatedToHibernate(String user) {
		List<String>Combinedlist = doService.getTodos(user);
		
		for(String todos:Combinedlist) {
			if(!todos.contains("Hibernate")) {
				doService.deleteTodos(todos);
			}
		}
	}

}
