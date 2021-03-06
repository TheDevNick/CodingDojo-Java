package main.java.classes;
import java.util.ArrayList;

public class Calculator  {
	//holding all of the operators in a list
	ArrayList<String> operators = new ArrayList<String>();
	//holding all nums in a list 
    ArrayList<Double> nums = new ArrayList<Double>();
    
    Double results;
    
    public Calculator (){

    }
    
//    getting number then adding to list
  public void performOperation(double dub){
        nums.add(dub);
    }
  
    public void performOperation(int dub){
        nums.add((double) dub); //added (double) because ArrayList is expecting a double not a int
    }
    public void performOperation(String str){
        if (str != "="){
            operators.add(str);//add as long as it's not =
        }
        else {
            Double start = nums.get(nums.size()-1);
            for(int i = operators.size()-1; i >=0; i--){
                switch(operators.get(i)){
                    case "+": start = start + nums.get(i); break;
                    case "-": start = start - nums.get(i); break;
                    case "*": start = start * nums.get(i); break;
                    case "/": start = start / nums.get(i); break;
                    default: System.out.println("Invalid operator."); break;
                }
            }
            this.results = start;
        }
    }
    public void getResults(){
        System.out.println(this.results);
    }
}
