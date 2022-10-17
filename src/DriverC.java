public class DriverC extends Driver<Truck>{
    public DriverC(String fio, String driverLicense, int experience, Truck car) {
        super(fio, driverLicense, experience, car);
    }

    @Override
    public void category() {
        System.out.println("Имя - " + getFio());
        System.out.println("Категория водительских прав - " + getDriverLicense());
        System.out.println("Стаж - " + getExperience());
    }

    @Override
    public void startMoving() {
        System.out.println("Начать движение");
    }

    @Override
    public void stop() {
        System.out.println("Остановиться");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Заправиться бензином");
    }
}
