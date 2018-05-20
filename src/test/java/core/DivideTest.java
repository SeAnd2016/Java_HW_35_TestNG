package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DivideTest {
	
	@Test //@Test(enabled = false)
    public void divide_test_2_param() {
		assertThat(Calculator.divide(5.1, 2), allOf(instanceOf(Double.class), closeTo(2.5, 0.09), notNullValue(), greaterThan(1.0), not(10.0)));}
  
	@Test //@Test(enabled = false)
    public void divide_test_3_param() {
		assertThat(Calculator.divide(10, 3, 2), allOf(instanceOf(Double.class), closeTo(1.6, 0.09), notNullValue(), greaterThan(1.0), not(10.0)));}
	
	@Test //@Test(enabled = false)
    public void divide_test_4_param() {
		assertThat(Calculator.divide(100, 2, 2, 5), allOf(instanceOf(Double.class), equalTo(5.0), is(5.0), notNullValue(), lessThan(700.0), not(10.0)));}
  }
