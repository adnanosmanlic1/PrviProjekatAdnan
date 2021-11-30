package seven;

public enum Season {
    WINTER("Zima"),
    SPRING("Proljeće"),
    SUMMER("Ljeto"),
    AUTUMN("Jesen");

    private String name;

    private Season(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
