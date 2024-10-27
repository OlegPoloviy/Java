import abstractExample.*;

class Program{
    public static void main(String[] args){
        System.out.println("This is 1 module");

       int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\n ");
        }

        String text = "Some example text that I will change soon and replace by my surname";
        String lastName = "Polovyi";
        String[] words = text.split(" ");

        for (int i = 2; i < words.length; i += 3) {
            words[i] = lastName;
        }

        String result = String.join(" ", words);

        System.out.println("Result: " + result);

        Apple apple = new Apple(150, true, 1.20);
        apple.printInfo();
        apple.tryFood();

        Hamburger burger = new Hamburger("fastfood",250,true);
        burger.tryFood();
        burger.printInfo();
    }


}