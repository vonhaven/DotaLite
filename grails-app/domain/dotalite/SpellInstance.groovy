package dotalite

class SpellInstance extends Spell {
    int cooldownLeft

    static constraints = {
        cooldownLeft size: 0..cooldown
    }
}
