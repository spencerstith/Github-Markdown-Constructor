package craigscode.components;

public enum MD {

    NORMAL(1),
    BOLD(2),
    ITALICIZED(2),
    BANDI(3);

    private final int type;

    private MD(int type) {
        this.type = type;
    }

}
