//import java.util.Hashtable;
//import java.util.function.Function;
//
//public class Ship {
//    private Hashtable<Integer, Integer> containers;
//
//    public Ship(int containerCount, Function<Integer, Integer> fillContainer) {
//        this.containers = new Hashtable<Integer, Integer>();
//
//        for (int i = 0; i < containerCount; i++) {
//            this.containers.put(i, fillContainer.apply(i));
//        }
//    }
//
//    public int peekContainer(int containerIndex) {
//        return this.containers.get(containerIndex);
//    }
//
//    public static void main(String[] args) {
//        Ship ship = new Ship(10, containerIndex -> containerIndex);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Container: " + i + ", cargo: " + ship.peekContainer(i));
//        }
//    }
//}
