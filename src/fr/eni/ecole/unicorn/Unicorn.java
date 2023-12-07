package fr.eni.ecole.unicorn;

public class Unicorn {
    private String name;
    private String color;

    public Unicorn(
        String name,
        String color
    ) {
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public String toString() {
        return String.format(
            "%s, the %s unicorn",
            this.name,
            this.color
        );
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
