class ArrayFrequencyMain
{
  public static void main(String[] agrgs)
  {
	  System.out.println("Main Running...");
	  int[] array={2,2,3,4,5,2};
	  int value=ArrayFrequency.frequency(array,2);
	 System.out.println("Frequency of 2 is: "+value);
	  
	  int[] array1={2,2,3,4,5,2};
	  int value1=ArrayFrequency.frequency(array1,5);
	 System.out.println("Frequency of 5 is: "+value1);
	  
	  int[] array2={23,13,45,23,23,0,80};
	  int value2=ArrayFrequency.frequency(array2,15);
	 System.out.println("Frequency of 15 is: "+value2);
	 System.out.println("Main Ending...");
	  
	  
  }

}