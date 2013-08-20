package dotalite

class Team {
    
    List<HeroUnit> heroes
    
    static constraints = {
        heroes size: 5..5
    }
}
