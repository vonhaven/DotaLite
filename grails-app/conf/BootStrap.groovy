import dotalite.*

class BootStrap {

    def init = { servletContext ->
        generateHeroes()
    }

    def destroy = {
    }

    private void generateHeroes() {
        def faction
        def primaryStat
        
        //Radiant Strength
        faction = Faction.RADIANT
        primaryStat = Stat.STR

        //Radiant Agility
        primaryStat = Stat.AGI
        new Hero ([
            name: "Anti-Mage",
            flavor: "Blinkin' and Slammin'",
            bio: "Magic sucks.",
            faction: faction,
            primaryStat: primaryStat,
            baseHealth: 130,
            baseMana: 100,
            baseDamage: 8,
            baseArmor: 3,
            baseStrength: 20,
            baseAgility: 22,
            baseIntelligence: 15,
            baseAttackSpeed: 7,
            baseMovementSpeed: 32,  
            spells: [ 
                new Spell (
                    name: "Mana Break",
                    description: "Burns 6 mana from the target, dealing additional magic damage equal to the amount of mana destroyed.",
                    passive: true
                ),
                new Spell (
                    name: "Blink",
                    description: "Teleports to any location within 500 range in the blink of an eye.",
                    cooldown: 5,
                    manaCost: 50
                ),
                new Spell (
                    name: "Spell Shield",
                    description: "Reduces all magic damage taken by 50%.",
                    passive: true
                ),
                new Spell (
                    name: "Mana Void",
                    description: "Stuns the target for 1 second and deals magic damage damage equal to 50% of the target's missing mana in a small area of effect.",
                    cooldown: 20,
                    manaCost: 75
                )
            ]
        ]).save(failOnError: true, flush: true)
        
        //Radiant Intelligence
        primaryStat = Stat.INT
    
        //Dire Strength
        faction = Faction.DIRE
        primaryStat = Stat.STR

        //Dire Agility
        primaryStat = Stat.AGI

        //Dire Intelligence
        primaryStat = Stat.INT
    }
}
