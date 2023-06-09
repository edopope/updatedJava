package menstalApp;
    import java.util.Calendar;

public class Mens {
            private int cycleLength;
        private Calendar startDate;

        public Mens(int cycleLength, Calendar startDate) {
            this.cycleLength = cycleLength;
            this.startDate = startDate;
        }

        public Calendar getStartDate() {
            return startDate;
        }

        public void setStartDate(Calendar startDate) {
            this.startDate = startDate;
        }

        public int getCycleLength() {
            return cycleLength;
        }

        public void setCycleLength(int cycleLength) {
            this.cycleLength = cycleLength;
        }

        public Calendar getEndDate() {
            Calendar endDate = (Calendar) startDate.clone();
            endDate.add(Calendar.DATE, cycleLength);
            return endDate;
        }


    }


