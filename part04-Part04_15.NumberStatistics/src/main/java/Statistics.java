
import java.util.ArrayList;


public class Statistics {
    private int count;
    private int sum;
    
    public Statistics(){
        //this.count = numberCount;
    }
    
    public void addNumber(int number){
        this.sum += number;
        count++;
    }
    
    public int getCount(){
        return count;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average() {
        if(sum == 0 || count == 0){
            return 0;
        }
        return sum / (count * 1.0);
    }
}
