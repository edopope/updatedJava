package menstalApp;

import java.time.LocalDate;

public class TheMonthlyApp{
    private LocalDate flowDate;
    private LocalDate ovulationDate;
    private LocalDate safePeriods;
    private LocalDate fertilePeriods;
    private int numberOfDays;

    public TheMonthlyApp(LocalDate flowDate, int numberOfDays) {
        this.flowDate = flowDate;
        this.numberOfDays = numberOfDays;

    }

    public TheMonthlyApp() {
    }

    public LocalDate getFlowDate() {
        return flowDate;
    }

    public void setFlowDate(LocalDate flowDate) {
        this.flowDate = flowDate;
    }

    public LocalDate getOvulationDate() {
        return ovulationDate;
    }

    public void setOvulationDate(LocalDate ovulationDate) {
        this.ovulationDate = ovulationDate;
    }

    public LocalDate getSafePeriods() {
        return safePeriods;
    }

    public void setSafePeriods(LocalDate safePeriods) {
        this.safePeriods = safePeriods;
    }

    public LocalDate getFertilePeriods() {
        return fertilePeriods;
    }

    public void setFertilePeriods(LocalDate fertilePeriods) {
        this.fertilePeriods = fertilePeriods;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
    public void calculateMenses(LocalDate flowDate, int numberOfDays){

    }
}
