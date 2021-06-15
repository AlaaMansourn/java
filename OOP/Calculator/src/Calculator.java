
public class Calculator {

	
	private double OperandOne;
	private char Operation;
	private double OperandTwo;
	private double result;
	
	
	public void setOperandOne(double d) {
		OperandOne = d;
	}
	public void setOperation(char operation) {
		Operation = operation;
	}
	public void setOperandTwo(double d) {
		OperandTwo = d;
	}
	
	
	
	
	
	public double getOperandOne() {
		return OperandOne;
	}
	public char getOperation() {
		return Operation;
	}
	public double getOperandTwo() {
		return OperandTwo;
	}
	public void performOperation()
	{
		
		if (getOperation()=='+')
			
		{
			
			 
		result=getOperandOne()+getOperandTwo();
			
		}
		
		 if(getOperation()=='-')
			
			result= getOperandOne()-getOperandTwo();
		
		
	}
	
	public void getResult (){
		
		System.out.println(result);
		
		
		
	}
	}

