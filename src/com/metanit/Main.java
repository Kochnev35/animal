package com.metanit;

public class Main {

    public static void main(String[] msi) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Бобик", "Мясо", "Вольер #5");
        animals[1] = new Cat("Мурзик", "Рыба", "Вольер #6");
        animals[2] = new Horse("Плотва", "Сено", "Конюшня");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
