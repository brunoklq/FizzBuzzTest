package griffith;



import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	
	@Test
	
	public void test() {

	}

	
	@Test
	public void execute() {
		

	}
	
	public String processNumber(int number) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		assertThat(fizzBuzz.processNumber(1), is("1"));
		
		return "1";
	}
	
	@Test
	public void shouldProcessInput() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String output = fizzBuzz.processNumber(1);
		
		assertThat(output, is("1"));
		
		
	}
	

}	

