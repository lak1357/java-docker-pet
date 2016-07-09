package com.pet.docker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Junit Test class for Application.java
 * @author lakshitha
 *
 */
public class  ApplicationTest
{
	Application application;
	
	@Before
	public void init()
	{
		application = new Application();
	}
	
	@Test
    public void sayHelloTest()
    {
		String result = application.sayHello();
		Assert.assertEquals("Hello World", result);
    }
	
	@Test
    public void sayHelloTestNot()
    {
		String result = application.sayHello();
		Assert.assertNotEquals("Hello", result);
    }

}
