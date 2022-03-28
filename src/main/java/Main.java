public class Main {

    public int addition(int a,int b){
        return a+b;
    }

    public char answer(int num){
        if(num<0||num>100){
            throw new IllegalArgumentException();
        }
        if(num<40){
            return 'F';
        }
        if(num<70){
            return 'P';
        }
        else{
            return 'D';
        }
    }
}
