package util;

public class Pair<firstThing, secondThing>{
    private firstThing first;
    private secondThing second;

    public Pair(firstThing first, secondThing second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(firstThing first){
        this.first = first;
    }

    public void setSecond(secondThing second) {
        this.second = second;
    }

    public firstThing getFirst() {
        return this.first;
    }

    public secondThing getSecond() {
        return this.second;
    }
}