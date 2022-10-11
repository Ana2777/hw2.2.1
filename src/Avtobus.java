public class Avtobus extends transport{
    public Avtobus(String mark, String model, String bodyType, int yearOfProduction, String countryOfAssembly, int maximumMovementSpeed) {
        super(mark, model, bodyType, yearOfProduction, countryOfAssembly, maximumMovementSpeed);
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
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке.");
    }
}



