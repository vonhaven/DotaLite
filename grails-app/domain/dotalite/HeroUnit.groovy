package dotalite

class HeroUnit extends Unit {
    Hero hero
    Faction side
    //int health = hero.baseHealth
    //int mana = hero.baseMana
    int modHealth = 0
    int modMana = 0
    int modHealthRegen = 0
    int modManaRegen = 0
    int modDamage = 0
    int modArmor = 0
    int modStrength = 0
    int modAgility = 0
    int modIntelligence = 0
    int modAttackSpeed = 0
    int modMovementSpeed = 0
    List<State> states

    static constraints = {
        
    }
}
