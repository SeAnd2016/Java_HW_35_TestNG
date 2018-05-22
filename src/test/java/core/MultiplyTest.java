package core;

import org.testng.annotations.*;

import java.lang.reflect.Method;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MultiplyTest {
	
	@Test(enabled = true, description = "Test 01", groups = "group_01") //@Test(enabled = false)
    public void multiply_test_2_param(Method method) {
		assertThat(Calculator.multiply(2, 2), allOf(instanceOf(Double.class), equalTo(4.0), is(4.0), notNullValue(), greaterThan(3.0), not(10.0)));
		System.out.println(getClass().getName() + ":" + method.getName() + " Thread ID: " + Thread.currentThread().getId());}
  
	@Test(enabled = true, description = "Test 02", groups = "group_02") //@Test(enabled = false)
    public void multiply_test_3_param(Method method) {
		assertThat(Calculator.multiply(2, 2, 2), allOf(instanceOf(Double.class), equalTo(8.0), is(8.0), notNullValue(), greaterThan(5.0), not(10.0)));
		System.out.println(getClass().getName() + ":" + method.getName() + " Thread ID: " + Thread.currentThread().getId());}
	
	@Test(enabled = true, description = "Test 03", groups = "group_03") //@Test(enabled = false)
    public void multiply_test_4_param(Method method) {
		assertThat(Calculator.multiply(2, 2, 2, 2), allOf(instanceOf(Double.class), equalTo(16.0), is(16.0), notNullValue(), lessThan(70.0), not(10.0)));
		System.out.println(getClass().getName() + ":" + method.getName() + " Thread ID: " + Thread.currentThread().getId());}
  }
