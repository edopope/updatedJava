package Chapter8;

public class Native {
    private Day dayOfBirth;
    public Native(Day dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }

    public Day getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Day dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
}
