public class Main {
    public static void main(String[] args) {
//Auto lada = new Auto("Lada", "Grande", "Желтый", 2015, "Россия", 1.7, "Зеленый","Нейизветсно", "56оал26п7", 4, "Зима");
//lada.cars();
//Auto audi = new Auto("Audi", "A8 50 L TDI quattro", "Черный", 2020, "Германия", 3.0,"Черный", "Нейизветсно", "45рлв36р4", 0,"Лето");
//audi.cars();
//Auto bmw = new Auto("BMW", "Z8", "Черный", 2021, "Германия", 3.0,  "Черный", "Нейизветсно","458пов546п", 2, "Лето");
//bmw.cars();
//Auto kia = new Auto("Kia", "Sportage 4 поколение", "Красный", 2018, "Южная Корея", 2.4,  "Красный", "Нейизветсно","46п1вп25п", 6, "Зима");
//kia.cars();
//Auto hyundai = new Auto("Hyundai", "Avante", "Оранжевый",2016, "Южная Корея", 1.6, "Оранжевый", "Нейизветсно", "пп468п32а", 5, "Зима");
//hyundai.cars();
//

 //Train one = new Train("«Ласточка»", " B-901", "Зеленый", 2011, "Россия",301,3500, 6.00, "Белорусский вокзал","Минск-Пассажирский",11);
 //Train two = new Train("«Ленинград»", "D-125", "Синий",2019, "Россия",270, 1700,5.30, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
     //   one.poezd();
      //  two.poezd();

        Avtobus one1 = new Avtobus("Марка 1", "Модель 15", "Красный", 2021, "Россия", 350);
        Avtobus two2 = new Avtobus("Марка 2", "Модель 3", "Желтый", 2020, "Китай", 150);
        Avtobus three3 = new Avtobus("Марка 3", "Модель 3","Зеленый", 2015, "Корея", 230);
        Avtobus four4 = new Avtobus("Марка 4", "Модель 4", "Фиолетовый", 2022, "Россия", 300);
        one1.bus();
        two2.bus();
        three3.bus();
        four4.bus();


        PassengerCar cadilak = new PassengerCar("cadilak", "Модель cadilak", 40);
        cadilak.description();
        cadilak.endMovement();
        cadilak.startMovement();
        PassengerCar chevrolet = new PassengerCar("chevrolet", "Модель chevrolet", 20);
        chevrolet.description();
        chevrolet.endMovement();
        chevrolet.startMovement();
        PassengerCar hummer = new PassengerCar("hummer", "Модель hummer", 30);
        hummer.description();
        hummer.endMovement();
        hummer.startMovement();
        PassengerCar ford = new PassengerCar("ford", "Модель ford", 10);
        ford.description();
        ford.endMovement();
        ford.startMovement();


Truck valday = new Truck("valday", "Модель valday",30);
valday.descript();
valday.startMovement();
valday.endMovement();
        Truck sunray = new Truck("sunray", "Модель sunray", 15);
        sunray.descript();
        sunray.startMovement();
        sunray.endMovement();
        Truck kamaz = new Truck("kamaz", "Модель kamaz", 45);
        kamaz.descript();
        kamaz.startMovement();
        kamaz.endMovement();
        Truck gazel = new Truck("gazel", "Модель gazel", 22);
        gazel.descript();
        gazel.startMovement();
        gazel.endMovement();
//

        DriverB alex = new DriverB("Алекс", "В", 3, ford);
alex.category();
System.out.print("Управляет ");
ford.description();
        DriverC valera = new DriverC("Валера", "C", 4, kamaz);
valera.category();
        System.out.print("Управляет ");
        kamaz.descript();
        DriverD maks = new DriverD("Макс", "D", 7, one1);
        maks.category();
        System.out.print("Управляет "); one1.bus();
    }
}