package dotalite

class SpellInstance {
    int cooldownLeft

    static constraints = {
        cooldownLeft size: 0..cooldown
    }
}
