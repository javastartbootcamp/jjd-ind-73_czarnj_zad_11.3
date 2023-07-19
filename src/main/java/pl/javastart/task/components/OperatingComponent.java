package pl.javastart.task.components;

import pl.javastart.task.exception.OverheatingException;

import java.util.Objects;

public abstract class OperatingComponent extends Component implements Overclockable {
    final int maxTemperature;
    int timing;
    int temperature;

    public OperatingComponent(String producer, String model, String serialNumber,
                              int timing, int temperature, int maxTemperature) {
        super(producer, model, serialNumber);
        this.timing = timing;
        this.temperature = temperature;
        this.maxTemperature = maxTemperature;
    }

    public void overclock() {
        if (temperature + getTemperatureIncrease() > maxTemperature) {
            throw new OverheatingException("Overclocking may cause overheating");
        }
        temperature += getTemperatureIncrease();
        timing += getTimingIncrease();
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getTiming() {
        return timing;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperatingComponent that)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return maxTemperature == that.maxTemperature &&
                timing == that.timing &&
                temperature == that.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxTemperature, timing, temperature);
    }
}
