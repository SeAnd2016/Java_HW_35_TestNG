package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SubtractTest {
	
	@Test(groups = "Functional") //@Test(enabled = false)
    public void subtract_test_2_param() {
		assertThat(Calculator.subtract(4, 2), allOf(instanceOf(Double.class), equalTo(2.0), is(2.0), notNullValue(), greaterThan(1.0), not(10.0)));}
  
	@Test(groups = "Regression") //@Test(enabled = false)
    public void subtract_test_3_param() {
		assertThat(Calculator.subtract(12, 3, 2), allOf(instanceOf(Double.class), equalTo(7.0), is(7.0), notNullValue(), greaterThan(5.0), not(10.0)));}
	
	@Test(groups = "Regression") //@Test(enabled = false)
    public void subtract_test_4_param() {
		assertThat(Calculator.subtract(100, 2, 2, 5), allOf(instanceOf(Double.class), equalTo(91.0), is(91.0), notNullValue(), lessThan(700.0), not(10.0)));}
  }
