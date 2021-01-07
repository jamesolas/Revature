package com.app.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ToDoBusinessMock {
	
	@Test
	public void testusing_Mock() {
		ToDoService doService = mock(ToDoService.class);
		
		List<String>combinedlist=Arrays.asList(" Use Core Java","Use Spring Core","Use w3eHibernate","Use Spring MVC");
		when(doService.getTodos("dummy")).thenReturn(combinedlist);
		
		ToDoBusiness business = new ToDoBusiness(doService);
		
		List<String> alltd = business.getTodosforHibernate("dummy");
		
		System.out.println(alltd);
		assertEquals(1, alltd.size());
	}
	
	@Test
	public void deleteTodosuing_BDD() {
		//Given
		ToDoService todoService = mock(ToDoService.class);
		List<String>combinedlist = Arrays.asList("Use Hibernate Java","Use Hibernate Core","Use Hibernate","Use Spring MVC");
			given(todoService.getTodos("dummy")).willReturn(combinedlist);
		ToDoBusiness2 business = new ToDoBusiness2(todoService);
		//When
		business.deleteTodosNotRelatedToHibernate("dummy");
		//Then
		verify(todoService).deleteTodos("Use Spring MVC");
		
	}

}
