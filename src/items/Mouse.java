package items;

public class Mouse extends Item {
    private boolean isWireless;

    public Mouse(String name, String type, String color, String manufacturer, boolean isWireless) {
        super(name, type, color, manufacturer);
        this.isWireless = isWireless;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
