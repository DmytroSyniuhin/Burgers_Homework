public class BurgerMain {
    public static void main(String[] args) {

        Burger standrtBurger = new Burger("булочка + ", "одна порція м'яса + ", "сир + ", "зелень + ", true);

        Burger dietBurger = new Burger( false, "булочка + ", "одна порція м'яса + ", "сир + ", "зелень");

        Burger doubleMeat = new Burger("булочка + ", "double", " + сир + ", true, "зелень + ");
    }
}
