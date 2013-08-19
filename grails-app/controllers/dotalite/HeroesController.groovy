package dotalite

class HeroesController {

    def index() {
        def heroes = Hero.findAll()
        [heroes: heroes]
    }
}
