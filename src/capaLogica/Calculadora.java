
package capaLogica;


public class Calculadora {
    
    private static Calculadora calculator;
    
    private Calculadora(){
 
    }
    
    public static Calculadora getInstance(){
        if(calculator == null){
            calculator = new Calculadora();
        }
        return calculator;
    }
    
    public double suma(double num1, double num2){
        return num1 + num2;
    }
    
    public double resta(double num1, double num2){
        return num1 - num2;
    }
    
    public double multiplicacion(double num1, double num2){
        return num1 * num2;
    }
    
    public double division(double num1, double num2){
        return num1 / num2;
    }
    
    public double potencia(double num){
        return Math.pow(num, 2);
    }
    
    //Conversiones 
    public double raizCuadrada(double num){
        return Math.sqrt(num);
    }
    
    public String convertIntoBinary(int num){  
        return Integer.toBinaryString(num);

    }
    
    public String convertIntoHexadecimal(int num){
        return Integer.toHexString(num);
    }
    
    public String convertIntoOctal(int num){
        return Integer.toOctalString(num); 
    }
    
}
