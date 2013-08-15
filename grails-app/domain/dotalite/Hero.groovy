package dotalite

class Hero {
    String name
    String flavor
    String bio
    Faction faction
    Stat primaryStat
    int baseHealth
    int baseMana
    int baseDamage
    int baseArmor
    int baseStrength
    int baseAgility
    int baseIntelligence
    int baseAttackSpeed
    int baseMovementSpeed
    List<Spell> spells

    static constraints = {
        name blank: false
        flavor blank: false
        bio blank: false
        baseHealth size: 100..200
        baseMana size: 100..200
        baseDamage size: 5..15
        baseArmor size: 0..5
        baseStrength size: 10..25
        baseAgility size: 10..25
        baseIntelligence size: 10..25
        baseAttackSpeed size: 0..20
        baseMovementSpeed size: 28..32
        spells size: 4
    }
}
