public class PassengerCar extends Transport implements Competing{
    public PassengerCar(String mark, String model, int engineCapacity) {
        super(mark, model, engineCapacity);
    }

    @Override
    public void pitStop() {
        System.out.println("Останавливается каждый 1 круг");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время прохождения круга 1 минута");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость 230");
    }

    public void startMovement() {
        System.out.println("Начало движения");

    }

    public void endMovement() {
        System.out.println("Конец движения");
    }

    void description() {
        System.out.println("Название - " + getMark());
        System.out.println("Модель - " + getModel());
        System.out.println("Обьем двигателя - "+ getEngineCapacity());
    }
}