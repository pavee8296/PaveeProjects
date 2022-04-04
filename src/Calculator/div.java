package Calculator;

public class div implements Operate {
	public Double getResult (Double... numbers) {
Double Result = numbers [0];
		
		for (int i = 1; i <=numbers.length; i++) {
			Result /= numbers[i];
			
		}
		
		return Result;
	}

}
