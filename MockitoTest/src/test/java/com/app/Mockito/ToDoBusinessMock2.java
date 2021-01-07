package com.app.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class ToDoBusinessMock2 {
	@Test  
    public void deleteTodosusing_BDD() {  
          
        //Given  
		ToDoService todoService = mock(ToDoService.class);         
        List<String> combinedlist = Arrays.asList("Use Hibernate Java", "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");     
        	given(todoService.getTodos("dummy")).willReturn(combinedlist);            
        ToDoBusiness business = new ToDoBusiness(todoService);  
        //When  
         business.deleteTodosNotRelatedToHibernate("dummy");       
        //Then  
        verify(todoService).deleteTodos("Use Spring MVC");  
     }  

}
