import java.util.Calendar;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(day>=1&&day<=31){
            this.day = day;
        }else {
            this.day = 1;
        }
        if(month>=1&&month<=12){
            this.month = month;
        }else {
            this.month = 1;
        }
        if(year>=0){
            this.year = year;

        }else {
            this.year = 0;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(this.year,this.month,day);
        this.day = cal.get(Calendar.DATE);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(this.year,month,this.day);
        this.month = cal.get(Calendar.MONTH);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year,this.month,this.day);
        this.year = cal.get(Calendar.YEAR);
    }
}
