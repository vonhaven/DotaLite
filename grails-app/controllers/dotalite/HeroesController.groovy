package dotalite

class HeroesController {

    def index() {
        List<Hero> heroes
        List<Spell> spells
        heroes = Hero.findAll()
        spells = Spell.findAll()
        [heroes: heroes, spells: spells]
    }
}
