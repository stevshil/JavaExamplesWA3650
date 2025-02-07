/*
 * All assertions for Junit can be found at;
 * 		https://www.baeldung.com/junit-assertions
 * 		https://junit.org/junit5/docs/snapshot/user-guide/
 * 		Nice html view of your tests use - mvn surefire-report:report
 */

package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;

public class GreeterTest {
	
	private Greeter greeter = new Greeter();

	@Test
	public void greeterSaysHello() {
		assertThat(greeter.sayHello(), containsString("Hello"));
	}

	@Test
	public void greeterExactMsg() {
		assertEquals(greeter.sayHello(), "Hello world!");
	}

	@Test
	public void greeterNotHello() {
		assertNotEquals(greeter.sayHello(), "Hello world");
	}
}
