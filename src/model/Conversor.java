package model;

/**
 *
 * @author Davi Alves
 * @since 18/03 - 09:09
 * @version 1.0 Catelyn Version
 * 
 */
public class Conversor {
   private int year=1;

    public Conversor() {
    }
    
    /**
     * @param year is prepared to receive the value of year. 
     */
    public Conversor(int year) {
        this.year = year;
    }
    //getter
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //setter
   
    /**
     * @return converts the value of the year in months
     */
    public int convertToMonths(){
        return this.year * 12;
    }
    
    /**
     * @return converts the value of the year in weeks 
     */
    public int convertToWeeks(){
        return this.year * 52;
    }
    
    /** 
     * @return converts the value of the year in weeks
     */
    public int convertToDays(){
        return this.year * 365;
    }

    @Override
    public String toString() {
        return this.year + " Ano(s) \n" +
               convertToMonths() + " Meses\n" +
               convertToWeeks() + " Semanas\n" +
               convertToDays() + " Dias";
    }
}