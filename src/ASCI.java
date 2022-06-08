import java.util.Scanner;

public class ASCI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//создаем объект сканнер
        int a = scan.nextInt();//считываем со строки число
        char ch = (char)a;//используется для перевода числа в символ
        if(a>64 && a<91 || a>96 && a<123) {
            System.out.println("English letter"); //если буква английская
        }
        else System.out.println("Not english letter, character : " + ch);//иначе

    }
}


