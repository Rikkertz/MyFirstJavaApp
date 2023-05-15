/*
My first java App.
Prints a short introduction of myself.'
Written by Rik
 */

public class FirstApp {
    public static void main(String[] args) {
        IntroductieVerhaal verhaal = new IntroductieVerhaal();
        Greeter Groet = new Greeter("Harry");
        System.out.println(verhaal.verhaal);
    }
}
