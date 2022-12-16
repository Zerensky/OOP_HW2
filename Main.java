public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Dimka",4,"Oleg"))
                .addAnimal(new Dog("Tuzik",4,"Petya"))
                .addAnimal(new Duck("Donald",2,"Ivan"))
                .addAnimal(new Eagle("Trut",2,"Sasha"))
                .addAnimal(new Octopus("-", 8, "Davy Jhones" ));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.runSpeed());
        }
        System.out.println(zoo.getChampionSpeed());
        System.out.println("----------");
        for (Flyable i: zoo.getFlyable())
        {
            System.out.println(i.flySpeed());
        }
        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        saveManagerAnimals.save(zoo.getAnimals());

    }
}