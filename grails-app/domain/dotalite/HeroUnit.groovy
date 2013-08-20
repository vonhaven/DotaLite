package dotalite

class HeroUnit extends Unit {
    Hero hero
    Faction side
    int health
    int mana
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

    public HeroUnit() {
        //health = hero.baseHealth
        //mana = hero.baseMana
    }

    static constraints = {
        health min: 0
        mana min: 0    
    }
}
