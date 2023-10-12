public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00");

    private final String hexCode;

    FlowerColor(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}