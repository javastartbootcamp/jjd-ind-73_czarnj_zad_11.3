package pl.javastart.task.components;

import java.util.Objects;

public abstract class Component {
    String producer;
    String model;
    String serialNumber;

    public Component(String producer, String model, String serialNumber) {
        this.producer = producer;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Component component)) {
            return false;
        }
        return Objects.equals(producer, component.producer) &&
                Objects.equals(model, component.model) &&
                Objects.equals(serialNumber, component.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, serialNumber);
    }
}
