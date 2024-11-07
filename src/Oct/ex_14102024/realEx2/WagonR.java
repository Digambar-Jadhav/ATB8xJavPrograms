package Oct.ex_14102024.realEx2;

public class WagonR extends Engine{
    void drive() {
        startEngine();
        startEngine();

    }
    @Override
    void startEngine(){
        System.out.println("Starting a car");
    }
    @Override
    void stopEngine(){
        System.out.println("Stopping a car");
    }
}
