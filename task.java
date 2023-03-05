
public class task {
    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = {
            new Cat("Тефтелька", 10), 
            new Cat("Рыжик", 11), 
            new Cat("Маврик", 12), 
            new Cat("Баксик", 13), 
            new Cat("Кэтька", 14)
        };
    
        Plate plate = new Plate(100);

        while (!plate.isEmpty()) {

            for (Cat catsCat : cats) {
                catsCat.eat(plate);
                System.out.println(catsCat);
                System.out.println(plate);
            }
            plate.increaseFood();
            System.out.println(plate);
            System.out.println("В миску добавили еду");
            
            Thread.sleep(1000);
        }
        System.out.println("Игра окончена");
    }

}