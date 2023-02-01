public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int taken) {
        return expectedMinutesInOven() - taken;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int taken) {
        return preparationTimeInMinutes(layers) + taken;
    }
}
