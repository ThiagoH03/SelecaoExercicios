import java.util.Scanner;
public class SelecaoEx1{
    public static void main(String[] args){
        float x;
        Scanner inputX = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        x = inputX.nextFloat();
        
        while(x > 1){
            if(x % 2 == 0){
                x = x / 2;
                
            }else{
                x = x * 3 + 1;
            }
            System.out.print(x +" -> ");
        }


    }
}