public class Truck extends Transport implements Competing{

    public Truck(String mark, String model, int engineCapacity) {
        super(mark, model, engineCapacity);
    }

    @Override
    public void pitStop() {
        System.out.println("Останавливается каждые 4 круга");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время прохождения круга 4 минуты");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость 100");
    }

    public void startMovement(){
        System.out.println("Начало движения");
    }
    public void endMovement(){
        System.out.println("Конец движения");
    }

    public void description() {
        System.out.println("Название - " + getMark());
        System.out.println("Модель - " + getModel());
        System.out.println("Обьем двигателя - "+ getEngineCapacity());
    }
}
