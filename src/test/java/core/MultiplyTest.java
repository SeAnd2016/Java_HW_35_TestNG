package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MultiplyTest {
	
	@Test //@Test(enabled = false)
    public void multiply_test_2_param() {
		assertThat(Calculator.multiply(2, 2), allOf(instanceOf(Double.class), equalTo(4.0), is(4.0), notNullValue(), greaterThan(3.0), not(10.0)));}
  
	@Test //@Test(enabled = false)
    public void multiply_test_3_param() {
		assertThat(Calculator.multiply(2, 2, 2), allOf(instanceOf(Double.class), equalTo(8.0), is(8.0), notNullValue(), greaterThan(5.0), not(10.0)));}
	
	@Test //@Test(enabled = false)
    public void multiply_test_4_param() {
		assertThat(Calculator.multiply(2, 2, 2, 2), allOf(instanceOf(Double.class), equalTo(16.0), is(16.0), notNullValue(), lessThan(70.0), not(10.0)));}
  }
