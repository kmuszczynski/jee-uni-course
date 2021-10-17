package zad03;

public enum Planet {
    MERCURY (0.24),
    VENUS (0.62),
    EARTH (1),
    MARS (1.9),
    JUPITER (12),
    SATURN (29),
    URANUS (84),
    NEPTUNE (165);

    private final double orbitRatio;
    Planet(double orbitRatio) {this.orbitRatio = orbitRatio;}
    public double getOrbitRatio() {return this.orbitRatio;}
}
