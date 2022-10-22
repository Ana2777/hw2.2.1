public enum TypeOfLoadCapacity {
    N1 (0,3.5),
    N2 (3.5, 12),
    N3 (12, 100);

    private double from;
    private double to;

    TypeOfLoadCapacity(double from, double to) {
        this.from = from;
        this.to = to;

    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
