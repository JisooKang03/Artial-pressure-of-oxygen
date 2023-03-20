/**
 * Name: Ji-Soo Kang
 * Campus: Trafalgar Campus
 * Assignment 2
 * Date: June 06, 2022
 * Student# 991636291
 */

public class Temperature extends mHealth{
    public double temperValue;

    //Accessor Methods
    public double getTemperValue() {
        return temperValue;
    }


    //Mutator Methods
    public void setTemperValue(double temperValue){
        this.temperValue = temperValue;
    }

    public double computeOutput(){
        return (temperValue - 32.0) * 5.0/9.0;
    }
}
