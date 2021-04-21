package EX1;

public enum GradePoint {

    A(4,'A','a'),
    B(3,'B','b'),
    C(2,'C','c'),
    D(1,'D','d'),
    F(0,'F','f');

    int  code;
    char desc1;
    char desc2;

    GradePoint(int code,char desc1,char desc2) {
        this.code = code;
        this.desc1 = desc1;
        this.desc2 = desc2;
    }

    public static int parse(char desc){
        for(GradePoint m : GradePoint.values()){
            if(m.desc1==desc){
                return m.code;
            }
            if(m.desc2==desc){
                return m.code;
            }
        }
        return -1;
    }



}
