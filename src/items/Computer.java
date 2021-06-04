package items;

public class Computer extends Item {
    private boolean isIntel;


    public Computer(String name, String type, String color, String manufacturer, boolean isIntel) {
        super(name, type, color, manufacturer);
        this.isIntel = isIntel;
    }

    public boolean isIntel() {
        return isIntel;
    }

    public void setIntel(boolean intel) {
        isIntel = intel;
    }
}
