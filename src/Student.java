
public class Student {
    private String name;
    private String id;
    private int numCredits;
    public Student(){

    }
    public Student(String name, String id, int numCredits) {
        this.name = name;
        this.id = id;
        this.numCredits = numCredits;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getNumCredits() {
        return numCredits;
    }
    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }
    public double calcTuition(){
        return 0.0;
    }
    public String toString(){
        return "Name: "+this.getName()+"\nId: "+this.getId()+"\nCredits: "+this.getNumCredits();
    }

}


