public class PassengerCar extends Transport {
    public PassengerCar(String mark, String model, int engineCapacity) {
        super(mark, model, engineCapacity);
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