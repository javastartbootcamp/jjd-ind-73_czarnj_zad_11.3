package pl.javastart.task;

import pl.javastart.task.components.HardDrive;
import pl.javastart.task.components.Memory;
import pl.javastart.task.components.Processor;
import pl.javastart.task.computer.Computer;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "Core i9 12900K", "0011433",
                3000, 200, 220);
        Memory memory = new Memory("Kingston", "Fury Impact 32GB", "12846",
                3200, 150, 180, 32);
        HardDrive hardDrive = new HardDrive("Samsung", "SSD 870",
                "33211", 128);
        Computer computer = new Computer(processor, memory, hardDrive);
        computer.overclockProcessor();
        computer.overclockProcessor();
        computer.overclockProcessor();
        System.out.println(computer);
        computer.overclockMemory();
        computer.overclockMemory();
        computer.overclockMemory();
        System.out.println(computer);
    }
}
