package NullSafety;
class Hero{
    int a = 5;
    void print(){
        System.out.println(a);
    }
}

public class Tester {
    public static void main(String[] args) {
        Hero hero = null;
//        Hero herolaal = new Hero();
//        hero.print();

        hero.print();
        //printing object details
        //hashing of objects is done for quicker access
        System.out.println(hero.hashCode());
        System.out.println(hero.getClass());
        System.out.println(hero);

    }
}
