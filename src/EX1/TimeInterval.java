package EX1;

public class TimeInterval {

    int firstTime;
    int secondTime;

    public TimeInterval(int firstTime, int secondTime) {
        this.firstTime = firstTime;
        this.secondTime = secondTime;
    }

    public TimeInterval() {

    }

    public int interval(){
        return Math.abs(firstTime-secondTime);
    }

    public int getHours(int time){
        if(time <=999){
            return time/100;
        }else if(time <=2400){
            return (time/100);
        }else{return 0;}

    }

    public int getMinutes(int time){
        String lastTwoDigits = String.valueOf(time);
        return Integer.parseInt(lastTwoDigits.substring(2));
    }

    public boolean validate(int time){
        if(time > 2400){
            System.out.println("Invalid Input, Exiting Program");
            return false;
        }else if(time < 0){
            System.out.println("Invalid Input, Exiting Program");
            return false;
        }
        return true;
    }

    public double getDecimalTime(int time){
        double p = ((double) getMinutes(time))/60;
        return getHours(time) + (p);

    }

    public String printValues(){
        return "Elapsed time in hrs/min: " + getHours(interval()) +" hours "+ getMinutes(interval()) +" minutes "+

                "\nElapsed Time in decimal: " + getDecimalTime(interval()) +" hours " ;
    }
}
