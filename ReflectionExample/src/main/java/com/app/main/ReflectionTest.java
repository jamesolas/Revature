public Set<Class<? extends Scanner >> getReflectionsSubTypes(){
	Reflections reflections = new Reflections(
			"org.reflections",new SubTypeScanner());
	return reflections.getSubTypesOf(Scanner.class);
}

Class<?>concreteClass = ConcreteClass.class;
concreteClass = new ConcreteClass(5).getClass();
try {
	
}