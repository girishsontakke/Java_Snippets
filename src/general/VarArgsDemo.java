package general;

class Calculator{
    public int sum(int ... a){ // variable length arguments
        int sum = 0;
        for(int i: a){
            sum += i;
        }
        return sum;
    }
}

public class VarArgsDemo {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int result = calc.sum(1,3,45,6,3,6);
        System.out.println(result);

    }
}
