package EX2;

 public enum Month {

        January(1,"January"),
        February(2,"February"),
        March(3,"March"),
        April(4,"April"),
        May(5,"May"),
        June(6,"June"),
        July(7,"July"),
        August(8,"August"),
        September(9,"September"),
        October(10,"October"),
        November(11,"November"),
        December(12,"December");

        int code;
        String desc;

        public String getDesc(){
            return this.desc;
        }

        Month(int code,String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static Month parse(int code){
            for(Month m : Month.values()){
                if(m.code==code) return m;
            }
            return null;
        }
    }


