public class Avtobus extends Transport implements Competing{
    private TypeOfCapacity typeOfCapacity;
    public Avtobus(String mark, String model, String bodyType, int yearOfProduction, String countryOfAssembly, int maximumMovementSpeed, TypeOfCapacity typeOfCapacity) {
        super(mark, model, bodyType, yearOfProduction, countryOfAssembly, maximumMovementSpeed);
    this.typeOfCapacity = typeOfCapacity;
    }

    public TypeOfCapacity getTypeOfCapacity() {
        return typeOfCapacity;
    }

    public void setTypeOfCapacity(TypeOfCapacity typeOfCapacity) {
        this.typeOfCapacity = typeOfCapacity;
    }

    void bus(){
        System.out.println("Название - " + getMark());
        System.out.println("Модель - " + getModel());
        System.out.println("Цвет - " + getBodyType());
        System.out.println("Год производства - " + getYearOfProduction());
        System.out.println("Страна производства - " + getCountryOfAssembly());
        System.out.println("Максимальная скорость - " + getMaximumMovementSpeed());
        System.out.println("   ");
    }

    @Override
    public void pitStop() {
        System.out.println("Останавливается каждые 3 круга");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время прохождения круга 2 минуты");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость 150");
    }

    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке.");
    }
    public void startMovement(){
        System.out.println("Начало движения");

    }
    public void endMovement(){
        System.out.println("Конец движения");

    }

    @Override
    public void description() {
        System.out.println("Автобус");
    }
}



