import java.time.LocalDate;

class Auto extends transport{
    private String mark;
    private String model;
    private Double engineCapacityInLiters;
    private String color;
    private int yearOfProduction;
    private String countryOfAssembly;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String theSignOfSummerOrWinterTires;

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
    }

    public Auto(String mark, String model, String bodyType, int yearOfProduction, String countryOfAssembly, Double engineCapacityInLiters, String color, String transmission, String registrationNumber, int numberOfSeats, String theSignOfSummerOrWinterTires) {
        super(mark, model, bodyType, yearOfProduction, countryOfAssembly);
        if (engineCapacityInLiters == 0) {
            this.engineCapacityInLiters = 1.5;
        } else {
            this.engineCapacityInLiters = engineCapacityInLiters;
        }
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 0;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.theSignOfSummerOrWinterTires = theSignOfSummerOrWinterTires;
}

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getEngineCapacityInLiters() {
        return engineCapacityInLiters;
    }

    public void setEngineCapacityInLiters(Double engineCapacityInLiters) {
        this.engineCapacityInLiters = engineCapacityInLiters;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    public void setCountryOfAssembly(String countryOfAssembly) {
        this.countryOfAssembly = countryOfAssembly;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTheSignOfSummerOrWinterTires() {
        return theSignOfSummerOrWinterTires;
    }

    public void setTheSignOfSummerOrWinterTires(String theSignOfSummerOrWinterTires) {
        this.theSignOfSummerOrWinterTires = theSignOfSummerOrWinterTires;
    }

    void cars() {
        System.out.println("Марка машины - " + mark);
        System.out.println("Модель - " + model);
        System.out.println("Объем двигателя - " + engineCapacityInLiters + " литров");
        System.out.println("Цвет кузова - " + color);
        System.out.println("Год производства - " + yearOfProduction);
        System.out.println("Страна производства - " + countryOfAssembly);
        System.out.println("  ");
    }

    public void changingTires() {

    }

    public boolean checkNamber() {
        if (this.registrationNumber.length() < 9) {
            System.out.println("Неправильный номер");
            return false;
        }
        char[] namber = this.registrationNumber.toCharArray();
        if (!Character.isAlphabetic(namber[0])) {
            System.out.println("Неправильный номер");
            return false;
        }
        if (!Character.isDigit(namber[1])) {
            System.out.println("Неправильный номер");
            return false;
        }
        return true;

    }

    public static class key{
private boolean remoteEngineStart;
private boolean keylessccess;

        public key(boolean remoteEngineStart, boolean keylessccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessccess = keylessccess;
        }
    }
    public static class insurance{
       private LocalDate validity;
       private double periodCost;
       private String numberS;

        public insurance(LocalDate validity, double periodCost, String numberS) {
            this.validity = validity;
            if (validity.isBefore(LocalDate.now())){
                System.out.println("Страховка просрочена");
            }
            if (numberS.length() < 9 || numberS.length() > 9){
                System.out.println("Страховка просрочена");
            }
            this.periodCost = periodCost;
            this.numberS = numberS;
        }

    }

}

