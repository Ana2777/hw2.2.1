public class Truck extends Transport implements Competing{
private TypeOfLoadCapacity typeOfLoadCapacity;
    public Truck(String mark, String model, int engineCapacity, TypeOfLoadCapacity typeOfLoadCapacity) {
        super(mark, model, engineCapacity);
        this.typeOfLoadCapacity = typeOfLoadCapacity;
    }

    public TypeOfLoadCapacity getTypeOfLoadCapacity() {
        return typeOfLoadCapacity;
    }

    public void setTypeOfLoadCapacity(TypeOfLoadCapacity typeOfLoadCapacity) {
        this.typeOfLoadCapacity = typeOfLoadCapacity;
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
