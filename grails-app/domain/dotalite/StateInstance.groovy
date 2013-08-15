package dotalite

class StateInstance extends State {
    int timeLeft
    int stacks = 1

    static constraints = {
        timeLeft size: 0..duration
        stacks size: 1..maxStacks
    }
}
