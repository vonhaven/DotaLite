package dotalite

class MapInstance {
    List<Unit> units

    static constraints = {
        units max: 512
    }
}
