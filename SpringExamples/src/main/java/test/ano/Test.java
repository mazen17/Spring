package test.ano;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	private static Object invoke;

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		Object foo = Class.forName("test.ano.Book").newInstance();

		Book foo1 = Book.class.newInstance();
		foo1.getFirstName();
		// Alternatively: Object foo = Foo.class.newInstance();

		Method m = foo.getClass().getDeclaredMethod("getFirstName", new Class<?>[0]);
		invoke = m.invoke(foo);

		String fn = (String) invoke;

		System.out.println(fn);

		Author annotation = Book.class.getAnnotation(Author.class);

	}

}
