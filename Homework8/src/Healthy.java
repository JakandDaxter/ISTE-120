import java.text.DecimalFormat;

public class Healthy {

    private String name;
    private char gender;
    private double weight;
    private double height;
    private int age;
    private double TDEE;
    private int i;

    final double SEDENTARY = 1.2;
    final double LIGHTLYACTIVE = 1.375;
    final double MODACTIVE = 1.55;
    final double VERYACTIVE = 1.725;
    final double EXTRAACTIVE = 1.9;

    final double KG = 0.45359237;
    final double CM = 2.54;

    public Healthy(String name, char gender, double weight, double height, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public Healthy() {

    }

    public void setI(int i) {
        this.i = i;
    }

    public double BMR(){
        if(gender == 'f'||gender == 'F') {
        return 655+(convertKG()*9.6)+(1.8*convertCM())-(4.7*age);}
        return 66+(convertKG()*13.7)+(5*convertCM())-(6.8*age);
    }

    public double convertKG(){return weight*KG;}

    public double convertCM(){return height*CM;}

    public double calcBMI(){
        double hold = (weight/(height*height));
        return (hold)*703;}

    public String classification(){
        if(calcBMI() < 18.5){
                return "You are underweight";
        }
        else if(calcBMI() >= 18.5 && calcBMI() < 25){
                return "You are Normal weight";
        }
        else if(calcBMI() >= 25 && calcBMI() < 30){
                return "You are Overweight";
        }
        else if(calcBMI() >= 30){
            return "You are Overweight";
        }
        return null;
    }

    public double calcTDEE(){
        switch(i){
            case 1:
                if(gender == 'f'||gender == 'F') {
                    return TDEE = BMR() * SEDENTARY;
                }
                else{
                    return TDEE = BMR() * SEDENTARY;
                }
            case 2:
                if(gender == 'f'||gender == 'F'){
                    return TDEE = BMR() * LIGHTLYACTIVE;
                }
                else{
                    return TDEE = BMR() * LIGHTLYACTIVE;
                }
            case 3:
                if(gender == 'f'||gender == 'F'){
                    return TDEE = BMR() * MODACTIVE;
                }
                else{
                    return TDEE = BMR() * MODACTIVE;
                }
            case 4:
                if(gender == 'f'||gender == 'F'){
                    return TDEE = BMR() * VERYACTIVE;
                }
                else{
                    return TDEE = BMR() * VERYACTIVE;
                }
            case 5:
                if(gender == 'f'||gender == 'F'){
                    return TDEE = BMR() * EXTRAACTIVE;
                }
                else{
                    return TDEE = BMR() * EXTRAACTIVE;
                }

            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }
    }

    public void printInfo(){
        DecimalFormat df = new DecimalFormat("0.00");

        String gen;
        if(gender=='f'||gender=='F'){gen = "Female";}else{gen="Male";}

        System.out.println("\n"+name + "'s Information"
                +
                "\n"+"Weight: " + df.format(weight) + " pounds"
                +
                "\n"+"Height: " + df.format(height) + " inches"
                +
                "\n"+"Age: \t" + age + " years"
                +
                "\n"+"These are for a " + gen
                +
                "\n\n"+"BMR  is  " + df.format(BMR())
                +
                "\n"+"BMI  is  " + df.format(calcBMI())
                +
                "\n"+"TDEE  is  " + df.format(calcTDEE())
                +
                "\n"+"Your BMI classifies "+ classification());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
