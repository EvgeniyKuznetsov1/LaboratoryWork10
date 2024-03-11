abstract class Animal {
    public String name;
    public String food;
    public String location;

    Animal(String name, String food, String location){
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void sleep(Animal animal){
        System.out.printf("%s спит", animal.name);
    }
}

class Dog extends Animal {
    public String breed;
    public String gender;
    public String color;

    Dog(String name, String food, String location,
        String breed, String gender, String color){
        super(name, food, location);
        this.breed = breed;
        this.gender = gender;
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        System.out.printf("Кушаю %s", food);
    }
}

class Cat extends Animal {
    public String breed;
    public String gender;
    public String color;

    Cat(String name, String food, String location,
        String breed, String gender, String color){
        super(name, food, location);
        this.breed = breed;
        this.gender = gender;
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void eat() {
        System.out.printf("Кушаю: %s\n", food);
    }
}

class Horse extends Animal {
    public String breed;
    public String gender;
    public String color;
    public double weight;
    public double height;

    Horse(String name, String food, String location,
          String breed, String gender, String color,
          double weight, double height){
        super(name, food, location);
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void makeNoise() {
        System.out.println("Фрр-р");
    }

    @Override
    public void eat() {
        System.out.printf("Кушаю: %s\n", food);
    }
}

class Veterinarian {
    public String name;

    Veterinarian(String name){
        this.name = name;
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Еда: " + animal.food);
        System.out.println("Ориал обитания: " + animal.location);
    }
}

class Program{
    public static void main(String[] args) {
        Dog Nikita = new Dog("Никита", "Семечки",
                "Степь", "Дворняга", "Мужской", "Черный");

        Cat Murka = new Cat("Мурка", "Паштет из курицы",
                "Дом бабушки", "Вислоухая шотландская", "Женский", "Трёхцветная");

        Horse Tenegriv = new Horse("Тенегрив", "-",
                "Убежище тёмного братства", "-", "Мужской", "Черный",
                122.2, 1.97);

        Veterinarian Aibolit = new Veterinarian("Айболит");

        Murka.eat();
        Tenegriv.makeNoise();
        Aibolit.treatAnimal(Nikita);
    }
}