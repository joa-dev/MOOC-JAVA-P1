
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        if (this.day < 30) {
            day++;
        } else if (this.day == 30 && this.month < 12) {
            day = 1;
            month++;
        } else if (this.day == 30 && this.month == 12) {
            day = 1;
            month = 1;
            year++;
        }
    }
    
    public void advance(int howManyDays) {
/*        if (howManyDays == 1){
            advance();
        } else if ((this.day + howManyDays) <= 30) {
            day += howManyDays;
        } else if ((this.day + howManyDays) > 30) {.......
        
        this was my first approach, and then came out with...
        
        THIS IS SOOOOO CLEVER*/
            for(int i = 0; i < howManyDays; i++){
                advance();
            }/*
        }*/
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}
