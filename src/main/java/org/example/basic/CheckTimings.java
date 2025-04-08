package org.example.basic;

import java.time.LocalDate;
import java.util.List;

public class CheckTimings {
    public String onTimeOrDelayed(List<LocalDate> arrivalTimes) {
        String result = null;
        for (LocalDate kc : arrivalTimes) {
            if (kc.isAfter(LocalDate.now())) {
                result = result + kc + "\n";
            } else {
                result = result + "Delayed\n";
            }
        }
        return result;
    }
}
