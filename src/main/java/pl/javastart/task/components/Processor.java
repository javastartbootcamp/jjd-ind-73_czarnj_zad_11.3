package pl.javastart.task.components;

public class Processor extends OperatingComponent {
    private static final int TEMPERATURE_INCREASE = 10;
    private static final int TIMING_INCREASE = 100;

    public Processor(String producer, String model, String serialNumber,
                     int timing, int temperature, int maxTemperature) {
        super(producer, model, serialNumber, timing, temperature, maxTemperature);
    }

    @Override
    public int getTemperatureIncrease() {
        return TEMPERATURE_INCREASE;
    }

    @Override
    public int getTimingIncrease() {
        return TIMING_INCREASE;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "maxTemperature=" + maxTemperature +
                ", timing=" + timing +
                ", temperature=" + temperature +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
