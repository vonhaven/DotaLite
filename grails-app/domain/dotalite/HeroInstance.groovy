package dotalite

class HeroInstance extends Hero {
    Faction side
    int health = baseHealth
    int mana = baseMana
    int modHealth = 0
    int modMana = 0
    int modHealthRegen = 0
    int modManaRegen = 0
    int modDamage = 0
    int modArmor = 0
    int modStrength = 0
    int modAgility = 0
    int modIntelligence = 0
    int modMovementSpeed = 0

    static constraints = {
        
    }
}
