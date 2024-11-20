public class TimeFormat {

        public static void main(String[] args) {
            String time = args[0];
            String[] timePart = time.split(":");
            int hour = Integer.parseInt(timePart[0]);  
            int minute = Integer.parseInt(timePart[1]);
            String amPM = (hour < 12) ? "AM" : "PM";
            
            if (hour == 0) {
                hour = 12;
            } else if (hour > 12) {
                    hour -= 12;
                  }

              String formattedMinute;
                  if (minute < 10) {
                      formattedMinute = "0" + minute;  
                  } else {
                      formattedMinute = String.valueOf(minute); 
                  }

                  System.out.println(hour + ":" + formattedMinute + " " + amPM);
        }
    }

