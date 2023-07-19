package pl.javastart.task.components;

import java.util.Objects;

public class Memory extends OperatingComponent {
    private static final int TEMPERATURE_INCREASE = 15;
    private static final int TIMING_INCREASE = 100;
    private int memoryAmount;

    public Memory(String producer, String model, String serialNumber, int timing,
                  int temperature, int maxTemperature, int memoryAmount) {
        super(producer, model, serialNumber, timing, temperature, maxTemperature);
        this.memoryAmount = memoryAmount;
    }

    public int getMemoryAmount() {
        return memoryAmount;
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
        return "Memory{" +
                "memoryAmount=" + memoryAmount +
                ", maxTemperature=" + maxTemperature +
                ", timing=" + timing +
                ", temperature=" + temperature +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Memory memory)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return memoryAmount == memory.memoryAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memoryAmount);
    }
}
