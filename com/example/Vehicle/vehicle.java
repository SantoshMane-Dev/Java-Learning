package com.example.Vehicle;

public class vehicle {
    private int noOfTyres;

    public void setNoOfTyers(int noOfTyres){
        this.noOfTyres = noOfTyres;
    }


    public void commute() {

        System.out.printf("I Am Going Place A To Place B By Using %d Tyres\n" , noOfTyres);

    }
}
