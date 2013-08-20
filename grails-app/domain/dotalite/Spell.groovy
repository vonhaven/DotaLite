package dotalite

class Spell {
    String name
    String description
    Target target
    int cooldown = 0
    int manaCost = 0

    static constraints = {
        name blank: false
        description blank: false
        cooldown size: 0..30
        manaCost min: 0
    }
}
