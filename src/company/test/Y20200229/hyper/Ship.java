package company.test.Y20200229.hyper;

import java.util.function.Function;

public class Ship {

    private Function<Integer, Integer> function;

    public Ship(int containerCount, Function<Integer, Integer> fillContainer) {
        function = fillContainer;
    }

    public int peekContainer(int containerIndex) {

        return function.apply(containerIndex);
    }

    public static void main(String[] args) {
        Ship ship = new Ship(10, containerIndex -> containerIndex);

        for (int i = 0; i < 10; i++) {
            System.out.println("Container: " + i + ", cargo: " + ship.peekContainer(i));
        }
    }
}
