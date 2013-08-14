package dotalite

class Spell {
    String name
    String description
    boolean castable
    int cooldown
    int manaCost

    static constraints = {
        name blank: false
        description blank: false
        cooldown size: 0..30
        manaCost min: 0
    }
}
