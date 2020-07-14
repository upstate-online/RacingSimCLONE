package RacingSim;

import java.util.List;

public class Car {
    String team;
    String driver;
    //Engine engine;
    //Tires tires;
    double speed;
    double distance;
    double lapDistance;
    int currentLap;
    double totalTime;
    List<Double> laptime;

    public Car (String teamIn, String driverIn ){
        this.team = teamIn;
        this.driver = driverIn;
        this.speed = 0.0;
        this.distance = 0.0;
        this.lapDistance = 0.0;
        this.currentLap = 0;
        this.totalTime = 0;


    }

    public void setTeam(String team){
        this.team = team;
    }

    public void setDriver (String driver){
        this.driver = driver;
    }

    public void setDistance (double distanceIn){
        this.distance = distanceIn;
    }

    public void setSpeed (double speed){
        this.speed = speed;
    }

    public void setLapDistance(double lapDistance){
        this.lapDistance = lapDistance;
    }

    public void updateLap(){
        this.currentLap ++;
    }

    public int getCurrentLap() {
        return currentLap;
    }

    public String getTeam(){
        return this.team;
    }

    public String getDriver(){
        return this.driver;
    }

    public void addLaptime(double lapIn){
        laptime.add(lapIn);
    }

    public double calcTotalTime(){
        double totalTime = 0;

        for(int i = 0; i < laptime.size(); i++){
            totalTime += laptime.get(i);
        }

        return totalTime;


    }

}
