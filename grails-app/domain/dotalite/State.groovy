package dotalite

class State {
    String name
    String description
    boolean canPurge
    boolean isHarmful
    int duration
    int maxStacks = 1

    static constraints = {
        name blank: false
        description blank: false
    }
}
