package adapter;

public class PoundsToKilogramsAdapter implements WeightInKilograms {
    private PoundsWeight poundsWeight;

    public PoundsToKilogramsAdapter(PoundsWeight poundsWeight) {
        this.poundsWeight = poundsWeight;
    }

    @Override
    public double getWeightInKilograms() {
        return poundsWeight.getWeightInPounds() * 0.453592;
    }
}

