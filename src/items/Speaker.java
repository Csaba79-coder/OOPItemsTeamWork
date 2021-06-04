package items;

public class Speaker extends Item {
    private int volume;

    public Speaker(String name, String type, String color, String manufacturer, int volume) {
        super(name, type, color, manufacturer);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
