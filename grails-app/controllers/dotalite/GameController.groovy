package dotalite

class GameController {

    def index() { 
        def game = Game.findAll()[0]
        [game: game]
    }
}
