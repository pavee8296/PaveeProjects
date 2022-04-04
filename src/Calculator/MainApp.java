package Calculator;

import java.awt.font.OpenType;
import java.util.*;


public class MainApp {
	
	public static void main(String[] args) {
		final String inputExp = ReadInput.read();
		
		Queue <String> operations;
		Queue <String> numbers;
		
		String numberarr[] = inputExp.split("[-+*/]");
		String operarr[] = inputExp.split("[0-9]+");
		
		numbers = new LinkedList<String>(Arrays.asList(numberarr));	
		operations = new LinkedList<String>(Arrays.asList(operarr));
		
		Double res = Double.parseDouble(numbers.poll());
		
		while (!numbers.isEmpty()) {
			
			String opr = operations.poll();
			
			Operate operate;
			
			switch (opr){
				case "+":
					operate = new add(); // dynamic binding in interface (operate)
					break;
				case "-":
					operate = new sub();
					break;
				case "*":
					operate = new mul();
					break;
				case "/":
					operate = new div();
					break;
				default : 
					continue;
			}
			
			Double num = Double.parseDouble(numbers.poll());
			
			res = operate.getResult(res,num);
		}
		
		System.out.println(res);
	}

}
