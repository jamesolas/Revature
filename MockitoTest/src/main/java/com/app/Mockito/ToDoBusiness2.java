package com.app.Mockito;

import java.util.List;

public class ToDoBusiness2 {

	public ToDoService doService;  
	  
    public ToDoBusiness2(ToDoService doService) { 
        this.doService = doService;  
    }  
          
public void deleteTodosNotRelatedToHibernate(String user) {  
          
        List<String> Combinedlist = doService.getTodos(user);  
          
        for(String todos:Combinedlist) {  
            if(!todos.contains("Hibernate")) {  
                doService.deleteTodos(todos);  
            }  
        }  
    }  

}
