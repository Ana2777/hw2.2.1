import java.time.LocalDate;

class Auto {
    private String mark;
    private String model;
    private Double engineCapacityInLiters;
    private
    String color;
    private int yearOfProduction;
    private String countryOfAssembly;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private Boolean theSignOfSummerOrWinterTires;

    public Auto(String mark, String model, Double engineCapacityInLiters, String color, int yearOfProduction, String countryOfAssembly, String transmission, String bodyType, String registrationNumber, int numberOfSeats, Boolean theSignOfSummerOrWinterTires) {
        if (mark == null || mark.isBlank() || mark.isEmpty()) {
            this.mark = "default";
        } else {
            this.mark = mark;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
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
        if (yearOfProduction == 0) {
            this.yearOfProduction = 2000;
        } else {
            this.yearOfProduction = yearOfProduction;
        }
        if (countryOfAssembly == null || countryOfAssembly.isBlank() || countryOfAssembly.isEmpty()) {
            this.countryOfAssembly = "default";
        } else {
            this.countryOfAssembly = countryOfAssembly;
        }
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
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

    public Boolean getTheSignOfSummerOrWinterTires() {
        return theSignOfSummerOrWinterTires;
    }

    public void setTheSignOfSummerOrWinterTires(Boolean theSignOfSummerOrWinterTires) {
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
        this.theSignOfSummerOrWinterTires = !theSignOfSummerOrWinterTires;
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

