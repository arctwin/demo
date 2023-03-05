package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utils.JarLoader;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootApplication
public class DemoForAddJarApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		SpringApplication.run(DemoForAddJarApplication.class, args);
		File file = new File("G:\\work\\java\\moreJar\\autoprint-1.0-SNAPSHOT.jar");
//		System.out.println(file.toURI().toURL());
//		ca.addToClassPath(file);
		JarLoader.addToClassPath(file);
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		Class<?> classz = classLoader.loadClass("autoprint.Model.PrintLine");
		Method method = classz.getDeclaredMethod("printSuccess");
		method.invoke(classz);
	}

}
