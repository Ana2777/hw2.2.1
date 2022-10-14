public class Train extends Transport{
    private int price;
    private double time;
    private String departureStationName;
    private String finalStop;
    private int numberOfWagons;
    public Train(String mark, String model, String bodyType, int yearOfProduction, String countryOfAssembly, int maximumMovementSpeed, int price, double time,
                 String departureStationName,
                 String finalStop, int numberOfWagons) {
        super(mark, model, bodyType, yearOfProduction, countryOfAssembly, maximumMovementSpeed);
        this.price = price;
        this.time = time;
        this.departureStationName = departureStationName;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
    public void poezd(){
        System.out.println("Название поезда - " + getMark());
        System.out.println("Модель поезда - " + getModel());
        System.out.println("Цвет поезда - " + getBodyType());
        System.out.println("Год производства - " + getYearOfProduction());
        System.out.println("Страна производства - " + getCountryOfAssembly());
        System.out.println("Максимальная скорость - " + getMaximumMovementSpeed());
        System.out.println("Цена проезда - " + getPrice());
        System.out.println("Время в пути - " + getTime());
        System.out.println("Станция отправки - " + getDepartureStationName());
        System.out.println("Станция прибытия - " + getFinalStop());
        System.out.println("Количество вагонов - " + getNumberOfWagons());
        System.out.println("   ");
    }


    public void refill() {
        System.out.println("Нужно заправлять дизелем");

    }
}

