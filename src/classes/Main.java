package classes;

public class Main {
    public static void main(String[] args)
    {
        Calculator calculator  = new Calculator();
        {
            calculator.a = 0; // введите первую переменную
            calculator.b = 0; //введите вторую переменную
            //===============================================================================
            System.out.println("значение суммы a и b =  " + calculator.add());
            System.out.println("значение разности a и b =  " + calculator.adb());
            if(calculator.adc() == 0)
            {
                System.out.println("умножение на 0 не возможно");
            }
            else
            {
                System.out.println("значение умножения a и b =  " + calculator.adc());
            }
            if(calculator.adc() == 0)
            {
                System.out.println("деление на 0 не возможно");
            }
            else
            {
                System.out.println("значение умножения a и b =  " + calculator.adl());
            }
        }
    }
}