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
        new Spell(
            name: "Mana Break",
            description: "Burns 6 mana from the target, dealing additional magic damage equal to the amount of mana destroyed.",
            passive: true
        ).save(failOnError: true, flush: true)
        new Spell(
            name: "Blink",
            description: "Teleports to any location within 500 range in the blink of an eye.",
            cooldown: 5,
            manaCost: 50
        ).save(failOnError: true, flush: true)
        new Spell(
            name: "Spell Shield",
            description: "Reduces all magic damage taken by 50%.",
            passive: true
        ).save(failOnError: true, flush: true)
        new Spell(
            name: "Mana Void",
            description: "Stuns the target for 1 second and deals magic damage damage equal to 50% of the target's missing mana in a small area of effect.",
            cooldown: 20,
            manaCost: 75
        ).save(failOnError: true, flush: true)
        new Hero ([
            name: "Anti-Mage",
            flavor: "Blinkin' 'n' Slammin'",
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
            q: Spell.findByName("Mana Break"),
            w: Spell.findByName("Blink"),
            e: Spell.findByName("Spell Shield"),
            r: Spell.findByName("Mana Void")
        ]).save(failOnError: true, flush: true)
        
        //Radiant Intelligence
        primaryStat = Stat.INT
        new Spell(
            name: "Dragon Slave",
            description: "Deals 30 magic damage to all enemy units in a line.",
            cooldown: 6,
            manaCost: 90
        ).save(failOnError: true, flush: true)
        new Spell(
            name: "Light Strike Array",
            description: "Stuns and deals 25 magic damage to all targets within 150 range of a given point.",
            cooldown: 6,
            manaCost: 100
        ).save(failOnError: true, flush: true)
        new Spell(
            name: "Fiery Soul",
            description: "Increases movement and attack speed by 6% for 6 seconds each time a spell is cast. Stacks 3 times.",
            passive: true
        ).save(failOnError: true, flush: true)
        new Spell(
            name: "Laguna Blade",
            description: "Deals 50 magic damage to a single target.",
            cooldown: 15,
            manaCost: 150
        ).save(failOnError: true, flush: true)
        new Hero ([
            name: "Lina",
            flavor: "Turn up the heat.",
            bio: "2hot2handelHUEH",
            faction: faction,
            primaryStat: primaryStat,
            baseHealth: 110,
            baseMana: 150,
            baseDamage: 7,
            baseArmor: 1,
            baseStrength: 17,
            baseAgility: 17,
            baseIntelligence: 20,
            baseAttackSpeed: 5,
            baseMovementSpeed: 29,  
            q: Spell.findByName("Dragon Slave"),
            w: Spell.findByName("Light Strike Array"),
            e: Spell.findByName("Fiery Soul"),
            r: Spell.findByName("Laguna Blade")
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
    
        //Dire Strength
        faction = Faction.DIRE
        primaryStat = Stat.STR

        //Dire Agility
        primaryStat = Stat.AGI

        //Dire Intelligence
        primaryStat = Stat.INT
    }
}
