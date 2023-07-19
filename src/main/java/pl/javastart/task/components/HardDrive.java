package pl.javastart.task.components;

import java.util.Objects;

public class HardDrive extends Component {
    private int memory;

    public HardDrive(String producer, String model, String serialNumber, int memory) {
        super(producer, model, serialNumber);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "memory=" + memory +
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
        if (!(o instanceof HardDrive hardDrive)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return memory == hardDrive.memory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memory);
    }
}
