package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class AddTest {
	
	@Test(groups = "Functional") //@Test(enabled = false)
    public void add_test_2_param() {
		assertThat(Calculator.add(2, 2), allOf(instanceOf(Double.class), equalTo(4.0), is(4.0), notNullValue(), greaterThan(3.0), not(10.0)));}
  
	@Test(groups = "Regression") //@Test(enabled = false)
    public void add_test_3_param() {
		assertThat(Calculator.add(2, 2, 2), allOf(instanceOf(Double.class), equalTo(6.0), is(6.0), notNullValue(), greaterThan(5.0), not(10.0)));}
	
	@Test(groups = "Regression") //@Test(enabled = false)
    public void add_test_4_param() {
		assertThat(Calculator.add(2, 2, 2, 2), allOf(instanceOf(Double.class), equalTo(8.0), is(8.0), notNullValue(), lessThan(70.0), not(10.0)));}
  }
