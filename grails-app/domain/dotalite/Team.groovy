package dotalite

class Team {
 
    static hasMany = [heroes: HeroUnit]
    
    static constraints = {
        heroes size: 5..5
    }
}
