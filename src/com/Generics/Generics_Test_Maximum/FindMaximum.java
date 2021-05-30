
public class FindMaximum {
	 public static void main(String[] args) {
	        System.out.println("  Welcome to Generics ");
	    }

	 public Integer maxnumber(Integer firstNumber,Integer secondNumber,Integer thardNumber){
	        Integer maxNumber = firstNumber;
	        if(secondNumber.compareTo(maxNumber)>0){
	            maxNumber = secondNumber;
	        }
	        if(thardNumber.compareTo(maxNumber)>0){
	            maxNumber = thardNumber;
	        }
	        return maxNumber;
	    }

	    public Float maxFloatNumber(Float firstNumber,Float secondNumber,Float thardNumber){
	        Float maxNumber = firstNumber;
	        if(secondNumber.compareTo(maxNumber)>0){
	            maxNumber = secondNumber;
	        }
	        if(thardNumber.compareTo(maxNumber)>0){
	            maxNumber = thardNumber;
	        }
	        return maxNumber;
	    }
}
