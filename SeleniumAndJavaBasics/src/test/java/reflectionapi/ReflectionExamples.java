package reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionExamples {

	public static void main(String[] args) {

		// Creating object of DataClass.

		DataClass dc = new DataClass();

		// Getting class object using getClass() method and storing in class Class with
		// reference variable class1.

		Class class1 = dc.getClass();

		// Printing class name using getName()& getSimpleName() methods.

		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());

		// Getting array containing method objects using getDeclaredMethods() method and
		// storing in method array Method[] of Method class with reference variable
		// arrayofMethods.

		Method[] arrayofMethods = class1.getDeclaredMethods();

		// Printing number of methods available in DataClass.

		System.out.println(arrayofMethods.length);

		// Printing method names using for each loop.
		// Printing return types of the methods using for each loop.
		// Printing parameter count of the methods using for each loop.

		for (Method var : arrayofMethods) {

			System.out.println(var.getName());
			System.out.println(var.getReturnType());
			System.out.println(var.getParameterCount());

		}

		// Getting array containing constructor objects using getConstructors() method
		// and storing in constructor array Constructor[] of Constructor class with
		// reference variable arrayofConstructors.

		Constructor[] arrayofConstructors = class1.getConstructors();

		// Printing number of constructors available in DataClass.

		System.out.println(arrayofConstructors.length);

		// Printing constructor names & parameter count using 1 for each loop.
		// Printing constructor parameters using another for each loop.

		for (Constructor var : arrayofConstructors) {

			System.out.println(var.getName());
			System.out.println(var.getParameterCount());

			Parameter[] param = var.getParameters();

			for (Parameter p : param) {

				System.out.println(p);
			}

		}

	}

}
