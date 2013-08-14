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
            bio: "He brings an end to magic",
            faction: faction,
            primaryStat: primaryStat,
            baseHealth: 130,
            baseMana: 100,
            baseDamage: 8,
            baseArmor: 3,
            baseStrength: 20,
            baseAgility: 22,
            baseIntelligence: 15,
            baseMovementSpeed: 32  
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
