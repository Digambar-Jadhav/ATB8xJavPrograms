package Oct.ex_09102024_Inheritance.HasA_Concept_Aggregation_IsA;

public class Car {
    // Car Has-A Engine, Tyre
    protected void startCar(){
        new Engine().start();
        new Tyre().rolling();
    }
}