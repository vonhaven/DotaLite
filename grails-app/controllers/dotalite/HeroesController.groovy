package dotalite

class HeroesController {

    def index() {
        List<Hero> heroes
        heroes = Hero.findAll()
        [
            heroes: heroes
        ]
    }
}
