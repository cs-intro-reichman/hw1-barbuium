public class TimeFormat {
        public static void main(String[] args) {
            String time = args[0];
            String[] timeParts = time.split(":");
            int hour = Integer.parseInt(timeParts[0]);  
            int minute = Integer.parseInt(timeParts[1]);
            String amPm = "AM";
            

            if (hour == 0) {
                hour = 12;
                amPm = "AM";
            } else if (hour >= 12) {
                if (hour > 12) {
                    hour -= 12;
                }
                amPm = "PM";
            }
            
            String minuteFormatted = (minute < 10) ? "0" + minute : Integer.toString(minute);
            System.out.println(hour + ":" + minuteFormatted + " " + amPm);
        }
    }

