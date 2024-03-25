import java.util.Scanner;
public class Exercicio03 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o primeiro número: ");
        int num = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();


if (num > num2){
    
System.out.println("o primeiro numero: '" + num + "' é maior que o segundo numero: '" + num2 +"'");

}


if (num2 > num){
    
System.out.println("o primeiro numero: '" + num + "' é menor que o segundo numero: '" + num2 +"'");

}

else{
    System.out.println(" sequência de números informados é inválida");
}







}
}