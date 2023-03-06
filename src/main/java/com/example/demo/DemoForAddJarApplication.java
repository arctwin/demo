package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utils.JarLoader;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootApplication
public class DemoForAddJarApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
		Class<?> clazz = Class.forName("Model.PrintLine");
		Method method = clazz.getDeclaredMethod("printSuccess");
		Constructor<?> ctor = clazz.getConstructor();
		method.invoke(ctor.newInstance());
	}

}
