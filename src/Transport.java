public abstract class Transport {
    private String mark;
    private String model;
    private int yearOfProduction;
    private String countryOfAssembly;
    private String bodyType;
    private int maximumMovementSpeed;
    private int engineCapacity;

    public Transport(String bodyType) {
        this.bodyType = bodyType;
    }

    public Transport(String mark, String model, String bodyType, int yearOfProduction, String countryOfAssembly, int maximumMovementSpeed) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
        this.bodyType = bodyType;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public Transport(String mark, String model, String bodyType, int yearOfProduction, String countryOfAssembly) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
        this.bodyType = bodyType;
    }

    public Transport(String mark,
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

    public Transport(String mark, String model, int engineCapacity) {
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    //public abstract void refill();

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

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
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
