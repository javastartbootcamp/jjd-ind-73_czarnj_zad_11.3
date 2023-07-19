package pl.javastart.task.computer;

import pl.javastart.task.components.HardDrive;
import pl.javastart.task.components.Memory;
import pl.javastart.task.components.Processor;
import pl.javastart.task.exception.OverheatingException;

import java.util.Objects;

public class Computer {
    private Processor processor;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(Processor processor, Memory memory, HardDrive hardDrive) {
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void overclockProcessor() {
        try {
            processor.overclock();
            System.out.println("Processor overclocked");
            System.out.println(processor);
        } catch (OverheatingException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void overclockMemory() {
        try {
            memory.overclock();
            System.out.println("Memory overclocked");
            System.out.println(memory);
        } catch (OverheatingException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", hardDrive=" + hardDrive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Computer computer)) {
            return false;
        }
        return Objects.equals(processor, computer.processor) &&
                Objects.equals(memory, computer.memory) &&
                Objects.equals(hardDrive, computer.hardDrive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, memory, hardDrive);
    }
}
