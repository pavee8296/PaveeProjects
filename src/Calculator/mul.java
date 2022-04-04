package Calculator;

public class mul implements Operate {
	public Double getResult (Double... numbers) {
		Double Result =1.0;
		
		for (Double num: numbers) {
			Result *= num;
			
		}
		
		return Result;
	}

}
