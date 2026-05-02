public class MenstrualApp{

    public static int calculateNextCycle(int date, int length) {
        int lastStartDate = 10;
        int cycleLength = 18;
        return lastStartDate + cycleLength;
    }
    
    public static int calculateLengthOfCycle(int firstStartDate, int secondStartDate) {
        return secondStartDate - firstStartDate;
    }
    
    public static int calculateOvulationDates(int nextCycleDate) {
        return nextCycleDate -14;
    }
    
    public static int calculateSafeDays(int ovulationDate) {
        return ovulationDate - 6;
    }
    
    public static void main(String[] args){
    
    }
}
