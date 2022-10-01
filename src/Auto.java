class Auto {
    String mark;
    String model;
    Double engineCapacityInLiters;
    String color;
    int yearOfProduction;
    String countryOfAssembly;

    Auto(String mark, String model, Double engineCapacityInLiters, String color, int yearOfProduction, String countryOfAssembly) {
        this.mark = mark;
        this.model = model;
        this.engineCapacityInLiters = engineCapacityInLiters;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
    }
    Auto(Double engineCapacityInLiters, String color, int yearOfProduction) {
        this.mark = "default";
        this.model = "default";
        this.engineCapacityInLiters = engineCapacityInLiters;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = "default";
    }
    Auto(String mark, String model, String color, int yearOfProduction, String countryOfAssembly) {
        this.mark = mark;
        this.model = model;
        this.engineCapacityInLiters = 1.5;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
    }
    Auto(String mark, String model, Double engineCapacityInLiters, String countryOfAssembly) {
        this.mark = mark;
        this.model = model;
        this.engineCapacityInLiters = engineCapacityInLiters;
        this.color = "Белый";
        this.yearOfProduction = 2000;
        this.countryOfAssembly = countryOfAssembly;}

    void cars(){
System.out.println("Марка машины - " + mark);
System.out.println("Модель - " + model);
System.out.println("Объем двигателя - " + engineCapacityInLiters + " литров");
System.out.println("Цвет кузова - " + color);
System.out.println("Год производства - " + yearOfProduction);
System.out.println("Страна производства - " + countryOfAssembly);
System.out.println("  ");
    }

}
