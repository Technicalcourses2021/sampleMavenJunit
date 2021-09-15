package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

  private Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Bye"));
  }
  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("to"));
  }
  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("great"));
  }

}
