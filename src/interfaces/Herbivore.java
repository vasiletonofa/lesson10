package interfaces;

public interface Herbivore extends Animal {

    void eatPlants();

    default String getName() {  // public
      return "Herbivore";
    }

    static void method3() { // public

    }
}
