import dotalite.*

class BootStrap {

    def init = { servletContext ->
        generateSpells()
        generateHeroes()
        mockTeams()
        mockGame()
    }

    def destroy = {

    }

    private void generateSpells() {
        //Anti-Mage
        new Spell([
            target: Target.PASSIVE,
            name: "Mana Break",
            description: "Burn 6 mana from the target, dealing additional magic damage equal to the amount of mana destroyed.",
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.POINT,
            name: "Blink",
            description: "Teleport to any location within 500 range in the blink of an eye.",
            cooldown: 5,
            manaCost: 50
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.PASSIVE,
            name: "Spell Shield",
            description: "Reduce all magic damage taken by 50%."
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.ENEMY_HERO,
            name: "Mana Void",
            description: "Stun the target for 1 second and deal magic damage damage equal to 50% of the target's missing mana within 150 area.",
            cooldown: 20,
            manaCost: 75
        ]).save(failOnError: true, flush: true)

        //Bane
        new Spell([
            target: Target.ENEMY,
            name: "Enfeeble",
            description: "Decrease the target enemy's attack damage by 6 for 8 seconds.",
            cooldown: 10,
            manaCost: 100
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.ENEMY,
            name: "Brain Sap",
            description: "Deal 25 pure damage to the enemy and restore 25 health.",
            cooldown: 6,
            manaCost: 100
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.UNIT,
            name: "Nightmare",
            description: "Exile the target for 0.5 seconds, putting it to sleep for 2 seconds and dealing 1 damage per second. Damage interrupts the effect. Attackers suffer Nightmare.",
            cooldown: 10,
            manaCost: 20
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.ENEMY_CHANNEL,
            name: "Fiend's Grip",
            description: "Stun the target, draining 10 health and mana per second over 4 seconds. Channeled.",
            cooldown: 20,
            manaCost: 150
        ]).save(failOnError: true, flush: true)

        //Dragon Knight
        new Spell([
            target: Target.POINT,
            name: "Breathe Fire",
            description: "Deal 30 magic damage to all enemy units in a cone.",
            cooldown: 6,
            manaCost: 100
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.ENEMY,
            name: "Dragon Tail",
            description: "Stun the target for 2 seconds, dealing 5 magic damage.", 
            cooldown: 6,
            manaCost: 70
        ]).save(failOnError: true, flush: true)            
        new Spell([
            target: Target.PASSIVE,
            name: "Dragon's Blood",
            description: "Increase armor and health regeneration by 4.",
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.NONE,
            name: "Elder Dragon Form",
            description: "Transform into an elder dragon for 10 seconds, gaining range, splash, and poison damage on each attack.",
            cooldown: 20,
            manaCost: 40
        ]).save(failOnError: true, flush: true)

        //Lich
        new Spell([
            target: Target.ENEMY,
            name: "Frost Blast",
            description: "Deal 15 magic damage to the target enemy and 10 magic damage to enemies within 100 range. Slows affected units by 30% for 3 seconds.",
            cooldown: 5,
            manaCost: 90
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.ALLY,
            name: "Ice Armor",
            description: "Increase an allied unit's armor by 5 for 10 seconds.", 
            cooldown: 5,
            manaCost: 35
        ]).save(failOnError: true, flush: true)            
        new Spell([
            target: Target.ALLY,
            name: "Sacrifice",
            description: "Consumes 20% of an allied unit's health, restoring 5x the stolen amount as mana.",
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.ENEMY,
            name: "Chain Frost",
            description: "Deals 12 magic damage to the target enemy, bouncing among units within 200 range. Bounces up to 8 times.",
            cooldown: 20,
            manaCost: 120
        ]).save(failOnError: true, flush: true)

        //Lina
        new Spell([
            target: Target.POINT,
            name: "Dragon Slave",
            description: "Deal 30 magic damage to all enemy units in a line.",
            cooldown: 6,
            manaCost: 90
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.AREA,
            name: "Light Strike Array",
            description: "Stun and deal 25 magic damage to all targets within 150 range of a given point.",
            cooldown: 6,
            manaCost: 100
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.PASSIVE,
            name: "Fiery Soul",
            description: "Increase movement and attack speed by 6% for 6 seconds each time a spell is cast. Stacks 3 times.",
            passive: true
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.ENEMY,
            name: "Laguna Blade",
            description: "Deal 50 magic damage to a single target.",
            cooldown: 15,
            manaCost: 150
        ]).save(failOnError: true, flush: true)

        //Pudge
        new Spell([
            target: Target.POINT,
            name: "Meat Hook",
            description: "Throw a hook at 450 range to pull in a target, dealing 30 pure damage to the target if it is an enemy.",
            cooldown: 5,
            manaCost: 100
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.TOGGLE,
            name: "Rot",
            description: "Deal 5 magic damage per second to all enemies within 150 range. Also deals damage to Pudge. Toggled.", 
            cooldown: 1,
            manaCost: 0
        ]).save(failOnError: true, flush: true)            
        new Spell([
            target: Target.PASSIVE,
            name: "Flesh Heap",
            description: "Reduces magic damage taken by 15% and increase strength by 1 each time a Meat Hook hits a target."
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.ENEMY,
            name: "Dismember",
            description: "Stuns the target for 2.5 seconds, dealing 4 damage per second.",
            cooldown: 15,
            manaCost: 100
        ]).save(failOnError: true, flush: true)

        //Shadow Fiend
        new Spell([
            target: Target.NONE,
            name: "Shadowraze",
            description: "Deal 20 magic damage in a small area in the forward direction.",
            cooldown: 2,
            manaCost: 60
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.PASSIVE,
            name: "Necromastery",
            description: "Generate a charge upon each attack. Each charge increases attack damage by 1. Stacks 10 times."
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.PASSIVE,
            name: "Presence of the Dark Lord",
            description: "Decrease the armor of all enemies within 500 range by 4.",
            passive: true
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.NONE,
            name: "Requiem of Souls",
            description: "Consume all charges of Necromastery, dealing 10 plus 3x the number of charges as magic damage to all enemies within 400 range. Additionally triggers with up to half of all charges when killed.",
            cooldown: 20,
            manaCost: 110
        ]).save(failOnError: true, flush: true)

        //Tidehunter
        new Spell([
            target: Target.ENEMY,
            name: "Gush",
            description: "Deal 18 damage to the target, decreasing its armor by 2 and slowing it by 30% for 4 seconds.",
            cooldown: 8,
            manaCost: 80
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.PASSIVE,
            name: "Kraken Shell",
            description: "Reduces the damage of all incoming attacks by 4."
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.NONE,
            name: "Anchor Smash",
            description: "Deals 6 damage to enemies within 150 range, reducing their attack damage by 40% for 3 seconds.",
            cooldown: 5,
            manaCost: 20
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.NONE,
            name: "Ravage",
            description: "Stuns all enemies within 350 range for 20 seconds, dealing 20 damage.",
            cooldown: 25,
            manaCost: 150
        ]).save(failOnError: true, flush: true)

        //Vengeful Spirit
        new Spell([
            target: Target.ENEMY,
            name: "Magic Missile",
            description: "Deal 20 magic damage to the enemy, stunning it for 1.5 seconds.",
            cooldown: 8,
            manaCost: 100
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.POINT,
            name: "Wave of Terror",
            description: "Deal 4 magic damage to enemies in a line, reducing their armor by 3 for 4 seconds.",
            cooldown: 4,
            manaCost: 20
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.PASSIVE,
            name: "Vengeance Aura",
            description: "Increase base attack damage of all allied heroes within 250 range by 30%.",
            passive: true
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.HERO,
            name: "Nether Swap",
            description: "Swap location with the target hero.",
            cooldown: 12,
            manaCost: 75
        ]).save(failOnError: true, flush: true)

        //Windrunner    
        new Spell([
            target: Target.ENEMY,
            name: "Shackleshot",
            description: "Attempt to latch the enemy to another enemy directly behind it, stunning both enemies for 2 seconds. Otherwise, stun the initial target for 0.5 seconds.",
            cooldown: 6,
            manaCost: 50
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.POINT,
            name: "Powershot",
            description: "Deal up to 20 magic damage to all enemies in a line, diminishing 20% per target hit.",
            cooldown: 6,
            manaCost: 50
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.NONE,
            name: "Windrun",
            description: "Run at maximum movement speed and evades all attacks for 3 seconds.",
            cooldown: 10,
            manaCost: 50
        ]).save(failOnError: true, flush: true)
        new Spell([
            target: Target.ENEMY,
            name: "Focus Fire",
            description: "Attack the target at maximum attack speed, dealing 50% damage on each attack. Lasts up to 10 seconds.",
            cooldown: 20,
            manaCost: 75
        ]).save(failOnError: true, flush: true)
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
        new Hero ([
            name: "Pudge",
            flavor: "dwadwad",
            bio: "asfafa",
            faction: faction,
            primaryStat: primaryStat,
            baseHealth: 190,
            baseMana: 115,
            baseDamage: 8,
            baseArmor: 1,
            baseStrength: 25,
            baseAgility: 15,
            baseIntelligence: 15,
            baseAttackSpeed: 5,
            baseMovementSpeed: 28,
            q: Spell.findByName("Meat Hook"),
            w: Spell.findByName("Rot"),
            e: Spell.findByName("Flesh Heap"),
            r: Spell.findByName("Dismember")
        ]).save(failOnError: true, flush: true)
        new Hero ([
            name: "Tidehunter",
            flavor: "I'm so hungry...",
            bio: "See: Chuanhunter",
            faction: faction,
            primaryStat: primaryStat,
            baseHealth: 175,
            baseMana: 110,
            baseDamage: 8,
            baseArmor: 2,
            baseStrength: 24,
            baseAgility: 16,
            baseIntelligence: 15,
            baseAttackSpeed: 6,
            baseMovementSpeed: 29,
            q: Spell.findByName("Gush"),
            w: Spell.findByName("Kraken Shell"),
            e: Spell.findByName("Anchor Smash"),
            r: Spell.findByName("Ravage")
        ]).save(failOnError: true, flush: true)

        //Dire Agility
        primaryStat = Stat.AGI
        new Hero ([
            name: "Shadow Fiend",
            flavor: "HALP.",
            bio: "halppp",
            faction: faction,
            primaryStat: primaryStat,
            baseHealth: 125,
            baseMana: 115,
            baseDamage: 7,
            baseArmor: 3,
            baseStrength: 17,
            baseAgility: 22,
            baseIntelligence: 18,
            baseAttackSpeed: 6,
            baseMovementSpeed: 30,  
            q: Spell.findByName("Shadowraze"),
            w: Spell.findByName("Necromastery"),
            e: Spell.findByName("Presence of the Dark Lord"),
            r: Spell.findByName("Requiem of Souls")
        ]).save(failOnError: true, flush: true)

        //Dire Intelligence
        primaryStat = Stat.INT
        new Hero ([
            name: "Lich",
            flavor: "Father of many.",
            bio: "Carry roll hu.",
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
            q: Spell.findByName("Frost Blast"),
            w: Spell.findByName("Ice Armor"),
            e: Spell.findByName("Sacrifice"),
            r: Spell.findByName("Chain Frost")
        ]).save(failOnError: true, flush: true)
        new Hero ([
            name: "Bane",
            flavor: "HALP.",
            bio: "halppp",
            faction: faction,
            primaryStat: primaryStat,
            baseHealth: 125,
            baseMana: 115,
            baseDamage: 8,
            baseArmor: 3,
            baseStrength: 18,
            baseAgility: 17,
            baseIntelligence: 23,
            baseAttackSpeed: 7,
            baseMovementSpeed: 31,  
            q: Spell.findByName("Enfeeble"),
            w: Spell.findByName("Brain Sap"),
            e: Spell.findByName("Nightmare"),
            r: Spell.findByName("Fiend's Grip")
        ]).save(failOnError: true, flush: true)
    }

    private void mockTeams() {
        //Mock static radiant team for testing
        new Team([ 
            heroes: [
                new HeroUnit([hero: Hero.findByName("Anti-Mage")]).save(failOnError: true, flush: true),
                new HeroUnit([hero: Hero.findByName("Windrunner")]).save(failOnError: true, flush: true),
                new HeroUnit([hero: Hero.findByName("Dragon Knight")]).save(failOnError: true, flush: true),
                new HeroUnit([hero: Hero.findByName("Vengeful Spirit")]).save(failOnError: true, flush: true),
                new HeroUnit([hero: Hero.findByName("Lina")]).save(failOnError: true, flush: true)
            ]
        ]).save(failOnError: true, flush: true)

        //Mock static dire team for testing
        new Team([ 
            heroes: [
                new HeroUnit([hero: Hero.findByName("Shadow Fiend")]).save(failOnError: true, flush: true),
                new HeroUnit([hero: Hero.findByName("Bane")]).save(failOnError: true, flush: true),
                new HeroUnit([hero: Hero.findByName("Pudge")]).save(failOnError: true, flush: true),
                new HeroUnit([hero: Hero.findByName("Lich")]).save(failOnError: true, flush: true),
                new HeroUnit([hero: Hero.findByName("Tidehunter")]).save(failOnError: true, flush: true)
            ]
        ]).save(failOnError: true, flush: true)
    }

    private void mockGame() {
        //Mock up the pre-loaded test game
        new Game([
            radiant: Team.findAll()[0],
            dire: Team.findAll()[1]
        ]).save(failOnError: true, flush: true)
    }
}
