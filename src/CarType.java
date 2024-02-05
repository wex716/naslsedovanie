public enum CarType {
    Sport("sport"),
    Family("family"),
    Eco("eco");

    private String value;

    CarType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
