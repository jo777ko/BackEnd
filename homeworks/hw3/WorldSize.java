package de.telran.geork.homeworks.hw3;

public enum WorldSize {
    NORTH(12),
    EAST(3),
    SOUTH(6),
    West(9);

    private int worldSize;

    WorldSize(int worldSize) {
        this.worldSize = worldSize;
    }

    @Override
    public String toString() {

        return name() + " located " + worldSize + " on hours.";
    }

    public static void main(String[] args) {
        for (WorldSize value : WorldSize.values()) {
            System.out.println(value);
        }
    }


}
