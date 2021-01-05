package com.app.main;

public class ConcreteClass extends BaseClass implements BaseInterface{
	
	public int publicInt;
	private String privateString="private string";
	protected boolean protectedBoolean;
	Object defaultObject;
	
	public ConcreteClass(int i) {
		this.publicInt=i;
	}
	
	@Override
	public void method1() {
		System.out.println("Method1 impl.");
	}
	
	@Override
	public int method2(String str)   {
		System.out.println("Method2 impl.");
		return 0;
	}
	
	@Override
	public int method4() {
		System.out.println("Method4 overriden.");
		return 0;
	}
	
	public int method5(int i) {
		System.out.println("Method4 overriden");
		return 0;
	}
	
	//inner classes
	public class ConcreteClassPublicClass{}
	private class ConcreteClassPrivateClass{}
	protected class ConcreteClassProtectedClass{}
	class ConcreteClassDefaultClass{}
	
	//member enum
	enum ConcreteClassDefaultEnum{}
	public enum ConcreteClassPublicEnum{}
	
	//member interface
	public interface ConcreteClassPublicInterface{}
	
	Class<?>concreteClass = ConcreteClass.class;{
	concreteClass = new ConcreteClass(5).getClass();
	try {concreteClass = 
			Class.forName("com.journaldev.reflection.ConcreteClass");
	}catch(ClassNotFoundException e) {e.printStackTrace();}
	
	System.out.println(concreteClass.getCanonicalName());
	Class<?>booleanClass = boolean.class;
	System.out.println(booleanClass.getCanonicalName());
	Class<?>cDouble = Double.TYPE;
	System.out.println(cDouble.getCanonicalName());
	Class<?>cDoubleArray=Class.forName("[D");
	System.out.println(cDoubleArray.getCanonicalName());
	Class<?>twoDStringArray=String[][].class;
	System.out.println(twoDStringArray.getCanonicalName());
	
	
	}
}