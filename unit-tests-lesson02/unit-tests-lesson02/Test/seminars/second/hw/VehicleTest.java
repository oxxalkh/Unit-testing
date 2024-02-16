package seminars.second.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//*Задание 1.
//Проект Vehicle. Написать следующие тесты с использованием JUnit5:
//
//        - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
//
//        - Проверить, что объект Car создается с 4-мя колесами.
//
//        - Проверить, что объект Motorcycle создается с 2-мя колесами.
//
//        - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
//
//        - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
//
//        - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
//
//        - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
////
//В этом проекте, вы будете работать с проектом ""Vehicle"", который представляет собой иерархию классов, включающую абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".
//
//Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"", а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".
//
//Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.
//
//Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.
class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("BMW", "X5", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("BMW", "3", 2022);
        Assertions.assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("BMW", "R1200", 2012);
        Assertions.assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void testCarSpeed() {
        Car car = new Car("BMW", "iX", 2022);
        car.testDrive();
        Assertions.assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("BMW", "F650", 2017);
        motorcycle.testDrive();
        Assertions.assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    public void testCarPark() {
        Car car = new Car("BMW", "iX", 2022);
        car.testDrive();
        car.park();
        Assertions.assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("BMW", "F650", 2017);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(motorcycle.getSpeed(), 0);
    }

}