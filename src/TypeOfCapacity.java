public enum TypeOfCapacity {
    ESPECIALLY_SMALL(0,10),
    SMALL(0, 25),
    AVERAGE(40,50),
    LARGE(60,80),
    ESPECIALLY_LARGE(100,120);

    private double from;
    private double to;


    TypeOfCapacity(double from, double to) {
        this.from = from;
        this.to = to;}

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }
}
