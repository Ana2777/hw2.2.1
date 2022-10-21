public class PassengerCar extends Transport implements Competing{
    public PassengerCar(String mark, String model, int engineCapacity) {
        super(mark, model, engineCapacity);
    }

    public PassengerCar(String bodyType) {
        super(bodyType);
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

    public void description() {
        System.out.println("Название - " + getMark());
        System.out.println("Модель - " + getModel());
        System.out.println("Обьем двигателя - "+ getEngineCapacity());
    }
}