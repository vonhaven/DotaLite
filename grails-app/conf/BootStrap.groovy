import dotalite.*

class BootStrap {

    def init = { servletContext ->
        generateSpells()
        generateHeroes()
    }

    def destroy = {

    }

    private void generateSpells() {
        //Anti-Mage
        new Spell(
            target: Target.PASSIVE,
            name: "Mana Break",
            description: "Burn 6 mana from the target, dealing additional magic damage equal to the amount of mana destroyed.",
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.POINT,
            name: "Blink",
            description: "Teleport to any location within 500 range in the blink of an eye.",
            cooldown: 5,
            manaCost: 50
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.PASSIVE,
            name: "Spell Shield",
            description: "Reduce all magic damage taken by 50%."
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.ENEMY_HERO,
            name: "Mana Void",
            description: "Stun the target for 1 second and deal magic damage damage equal to 50% of the target's missing mana within 150 area.",
            cooldown: 20,
            manaCost: 75
        ).save(failOnError: true, flush: true)

        //Dragon Knight
        new Spell(
            target: Target.POINT,
            name: "Breathe Fire",
            description: "Deal 30 magic damage to all enemy units in a cone.",
            cooldown: 6,
            manaCost: 100
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.ENEMY,
            name: "Dragon Tail",
            description: "Stun the target for 2 seconds, dealing 5 magic damage.", 
            cooldown: 6,
            manaCost: 70
        ).save(failOnError: true, flush: true)            
        new Spell(
            target: Target.PASSIVE,
            name: "Dragon's Blood",
            description: "Increase armor and health regeneration by 4.",
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.NONE,
            name: "Elder Dragon Form",
            description: "Transform into an elder dragon for 10 seconds, gaining range, splash, and poison damage on each attack.",
            cooldown: 20,
            manaCost: 40
        ).save(failOnError: true, flush: true)

        //Lina
        new Spell(
            target: Target.POINT,
            name: "Dragon Slave",
            description: "Deals 30 magic damage to all enemy units in a line.",
            cooldown: 6,
            manaCost: 90
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.AREA,
            name: "Light Strike Array",
            description: "Stuns and deals 25 magic damage to all targets within 150 range of a given point.",
            cooldown: 6,
            manaCost: 100
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.PASSIVE,
            name: "Fiery Soul",
            description: "Increases movement and attack speed by 6% for 6 seconds each time a spell is cast. Stacks 3 times.",
            passive: true
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.ENEMY,
            name: "Laguna Blade",
            description: "Deals 50 magic damage to a single target.",
            cooldown: 15,
            manaCost: 150
        ).save(failOnError: true, flush: true)

        //Vengeful Spirit
        new Spell(
            target: Target.ENEMY,
            name: "Magic Missile",
            description: "Deals 20 magic damage to the enemy, stunning it for 1.5 seconds.",
            cooldown: 8,
            manaCost: 100
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.POINT,
            name: "Wave of Terror",
            description: "Deals 4 magic damage to enemies in a line, reducing their armor by 3 for 4 seconds.",
            cooldown: 4,
            manaCost: 20
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.PASSIVE,
            name: "Vengeance Aura",
            description: "Increases base attack damage of all allied heroes within 250 range by 30%.",
            passive: true
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.HERO,
            name: "Nether Swap",
            description: "Swaps location with the target hero.",
            cooldown: 12,
            manaCost: 75
        ).save(failOnError: true, flush: true)

        //Windrunner    
        new Spell(
            target: Target.ENEMY,
            name: "Shackleshot",
            description: "Attempt to latch the enemy to another enemy directly behind it, stunning both enemies for 2 seconds. Otherwise, stun the initial target for 0.5 seconds.",
            cooldown: 6,
            manaCost: 50
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.POINT,
            name: "Powershot",
            description: "Deal up to 20 magic damage to all enemies in a line, diminishing 20% per target hit.",
            cooldown: 6,
            manaCost: 50
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.NONE,
            name: "Windrun",
            description: "Run at maximum movement speed and evades all attacks for 3 seconds.",
            cooldown: 10,
            manaCost: 50
        ).save(failOnError: true, flush: true)
        new Spell(
            target: Target.ENEMY,
            name: "Focus Fire",
            description: "Attack the target at maximum attack speed, dealing 50% damage on each attack. Lasts up to 10 seconds.",
            cooldown: 20,
            manaCost: 75
        ).save(failOnError: true, flush: true)
    }

    private void generateHeroes() {
        def faction
        def primaryStat
        
        //Radiant Strength
        faction = Faction.RADIANT
        primaryStat = Stat.STR
        new Hero ([
            name: "Dragon Knight",
            flavor: "Most original.",
            bio: "bioooo",
            faction: faction,
            primaryStat: primaryStat,
            baseHealth: 185,
            baseMana: 105,
            baseDamage: 9,
            baseArmor: 3,
            baseStrength: 24,
            baseAgility: 16,
            baseIntelligence: 15,
            baseAttackSpeed: 6,
            baseMovementSpeed: 29,
            q: Spell.findByName("Breathe Fire"),
            w: Spell.findByName("Dragon Tail"),
            e: Spell.findByName("Dragon's Blood"),
            r: Spell.findByName("Elder Dragon Form")
        ]).save(failOnError: true, flush: true)

        //Radiant Agility
        primaryStat = Stat.AGI
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
        new Hero ([
            name: "Vengeful Spirit",
            flavor: "JOHN HALPPP.",
            bio: "JOHN HALPPP",
            faction: faction,
            primaryStat: primaryStat,
            baseHealth: 125,
            baseMana: 105,
            baseDamage: 8,
            baseArmor: 3,
            baseStrength: 18,
            baseAgility: 22,
            baseIntelligence: 18,
            baseAttackSpeed: 5,
            baseMovementSpeed: 29,  
            q: Spell.findByName("Magic Missile"),
            w: Spell.findByName("Wave of Terror"),
            e: Spell.findByName("Vengeance Aura"),
            r: Spell.findByName("Nether Swap")
        ]).save(failOnError: true, flush: true)
        
        //Radiant Intelligence
        primaryStat = Stat.INT
        new Hero ([
            name: "Windrunner",
            flavor: "Pew.",
            bio: "Moer like winrun hue.",
            faction: faction,
            primaryStat: primaryStat,
            baseHealth: 125,
            baseMana: 105,
            baseDamage: 8,
            baseArmor: 3,
            baseStrength: 18,
            baseAgility: 22,
            baseIntelligence: 18,
            baseAttackSpeed: 5,
            baseMovementSpeed: 29,  
            q: Spell.findByName("Shackleshot"),
            w: Spell.findByName("Powershot"),
            e: Spell.findByName("Windrun"),
            r: Spell.findByName("Focus Fire")
        ]).save(failOnError: true, flush: true)
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
    
        //Dire Strength
        faction = Faction.DIRE
        primaryStat = Stat.STR

        //Dire Agility
        primaryStat = Stat.AGI

        //Dire Intelligence
        primaryStat = Stat.INT
    }
}
