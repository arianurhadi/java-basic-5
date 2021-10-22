public class Main {
    public static void main(String[] args){

        Hero hero = new Hero("Aria", 20);

        hero.player();

        for(int i = 1; i <=20; i++){
            hero.walk();
        }

        for(int i = 1; i <=5; i++){
            hero.run();
        }

        for(int i = 1; i <=3; i++){
            hero.eat();
        }

        for(int i = 1; i <=2; i++){
            hero.drink();
        }

        for(int i = 1; i <=5; i++){
            hero.walk();
        }

        for(int i = 1; i <=2; i++){
            hero.jump();
        }

        hero.sit();

        for(int i = 1; i <=3; i++){
            hero.attack();
        }

        hero.player();

    }
}
