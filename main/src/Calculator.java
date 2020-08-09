import java.util.Scanner;

    public class Calculator {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.println("Введите первое число");
            int firstNum = in.nextInt();
            System.out.println("Введите второе чсило");
            int secondNum = in.nextInt();
            System.out.println("Введите знак");
            String znak = in.next();

            if(znak.equals("+")){
                System.out.println("Вот сумма этих чисел " + (firstNum + secondNum));
            }else if(znak.equals("-")){
                System.out.println("Вот разность этих чисел " + (firstNum - secondNum));
            }else if(znak.equals("*")){
                System.out.println("Вот произведение этих чисел " + (firstNum * secondNum));
            }else if(znak.equals("/")){
                System.out.println("Вот деление этих чисел " + (firstNum / secondNum));
            }else{
                System.out.println("Что то не так ");}
        }
    }