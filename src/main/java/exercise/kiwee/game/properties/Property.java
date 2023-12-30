package exercise.kiwee.game.properties;

public abstract class Property {
    private final String name;
    
    protected Property(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
}
