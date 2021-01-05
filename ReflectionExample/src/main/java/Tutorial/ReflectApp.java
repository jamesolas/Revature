package Tutorial;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectApp {
	public static void main(String[] args) throws Exception {
		Method method = Class1.class.getDeclaredMethod("someMethod");
		method.setAccessible(true);
		method.invoke(null);
		
		String s = "Hello world";
		
		Field field = String.class.getDeclaredField("value");
		field.setAccessible(true);
		field.set(s, new char[] {});
		
		System.out.println("Begin");
		System.out.println(s);
		System.out.println("End");
		
		String t = "Hello world";
		
		Field field2 = String.class.getDeclaredField("value");
		field2.setAccessible(true);
		field2.set(t, "Bye world".toCharArray());
		
		System.out.println("Begin");
		System.out.println(t);
		System.out.println("End");
	}

}
