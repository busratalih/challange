package day01;

public class Q02_Println_vs_print {
    public static void main(String[] args) {

         /*
  println() ve print() arasinda tek fark var;
  println satir atliyor,
  print ise imlecin ayni satirda kalmasini sagliyor.
    Konsolda
    *****println*****
    Welcome
    to
    Java
    Class
    *****print*****
    Welcome to Java Class yazdirinz
   */
    /*
   konsolda
   1
   2
   3
   4
   5
   yazdiriniz
   sonrasinda da  yanyana 12345 yazdiriniz
    */

        System.out.println("*****println*****");
        System.out.println("Welcome");
        System.out.println("to");
        System.out.println("Java");
        System.out.println("Class");
        System.out.println("*****print*****");
        System.out.print("Welcome to Java Class");
        System.out.println("fark bu sekilde gorulur");


        System.out.println("");
        System.out.println("*****println*****");
        System.out.println("Welcome");
        System.out.println("to");
        System.out.println("java");
        System.out.println("class");
        System.out.println("*****print*****");
        System.out.print("Welcome to java class");

        System.out.println("");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.print("12345");























    }
}
