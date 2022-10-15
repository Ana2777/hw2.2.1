public abstract class transport {
    private String mark;
    private String model;
    private int yearOfProduction;
    private String countryOfAssembly;
    private String bodyType;
    private int maximumMovementSpeed;

    public transport(String mark, String model, String bodyType, int yearOfProduction, String countryOfAssembly,  int maximumMovementSpeed) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
        this.bodyType = bodyType;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public transport(String mark, String model, String bodyType, int yearOfProduction, String countryOfAssembly) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
        this.bodyType = bodyType;
    }

    public transport(String mark,
                     String model,
                     String bodyType,
                     int yearOfProduction,
                     String countryOfAssembly,
                     short maximumMovementSpeed) {
        setMark(mark);
        setModel(model);
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
        setBodyType(bodyType);
        setMaximumMovementSpeed(maximumMovementSpeed);
    }
public abstract void refill();

    public void setMark(String mark) {
        if (mark == null || mark.isEmpty() || mark.isBlank()) {
            this.mark = "Информация не указана";
        } else {
            this.mark = mark;
        }
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Информация не указана";
        } else {
            this.model = model;
        }
    }

    public void setBodyType(String bodyType) {
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "Информация не указана";
        } else {
            this.bodyType = bodyType;
        }
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        if (maximumMovementSpeed <= 0) {
            this.maximumMovementSpeed = -1;
        } else {
            this.maximumMovementSpeed = maximumMovementSpeed;
        }
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }
}
class train extends transport{
private int price;
private double time;
private String departureStationName;
private String finalStop;
private int numberOfWagons;

    public train(String mark, String model, String bodyType, int yearOfProduction, String countryOfAssembly, int maximumMovementSpeed, int price, double time,
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

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");

    }
}

