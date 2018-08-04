public class Time {
    private int h;
    private int m;
    private int s;

    public String whatTime(int seconds){
        h = seconds/3600;
        int remainder1 = seconds - h*3600;
        m = remainder1/60;
        s = remainder1-m*60;
        String ret = ""+h+":"+m+":"+s;
        System.out.println(ret);
        return ret;
    }

    public static void main(String[] args) {
        Time time = new Time();
        time.whatTime(0);
        time.whatTime(3661);
        time.whatTime(5436);
        time.whatTime(86399);
    }
}


