package com.example.Vehicle;

public class Test {
    public static void main(String[] args) {
        
        vehicle v1 = new vehicle();
        MotorCycle m1 = new MotorCycle();
        TwoWheeler t1 = new TwoWheeler();

        m1.commute();
        t1.balance();
        System.out.println("\n"+ v1);


    }
}
