public class Burger {

    public String bun;
    public String meat;
    public String cheese;
    public String green;
    public boolean mayo;

    // Для звичайного бургера
    public Burger(String bun, String meat, String cheese, String green, boolean mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;

        String strMayo = mayo ? "майонез" : "без майонезу, ";

        System.out.println("Звичайний бургер: " + bun + meat + cheese + green + strMayo + ".");
    }

    // Для дієтичного бургера
    public Burger( boolean mayo, String bun, String meat, String cheese, String green) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;

        String strMayo = mayo ? "майонез" : "без майонезу, ";

        System.out.println("Дієтичний бургер: " + strMayo + bun + meat + cheese + green  + ".");
    }

    // Для бургера з подвійним м'ясом
    public Burger(String bun, String meat, String cheese, boolean mayo,  String green) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;

        String strMayo = mayo ? "майонез" : "без майонезу, ";
        String strMeat = meat.equals("double") ? "подвійна порція м'яса" : "одна порція м'яса";

        System.out.println("Бургер з подвійним м'ясом: " + bun + strMeat + cheese + green + strMayo + ".");
    }
}