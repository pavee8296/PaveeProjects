package Calculator;

public class add implements Operate {
	
	public Double getResult (Double... numbers) {
		Double sum = 0.0;
		
		for (Double num: numbers) {
			sum += num;
			
		}
		
		return sum;
	}

}
