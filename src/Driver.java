public abstract class Driver <A extends Transport & Competing> {
private String fio;
private String driverLicense;
private int experience;

private A car;
    public Driver(String fio, String driverLicense, int experience, A car) {
        if (fio == null || fio.isEmpty() || fio.isBlank()){
            this.fio = "Неуказано";
        }else {
            this.fio = fio;}
        if (driverLicense == null || driverLicense.isEmpty() || driverLicense.isBlank()){
            this.driverLicense = "Нет прав на вождение";
        }else {
            this.driverLicense = driverLicense;}
        this.experience = experience;
        this.car = car;
    }
    public String getFio() {
       return fio;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMoving();

  public  abstract void stop();
public abstract void refuelTheCar();
    public abstract void category();

}
