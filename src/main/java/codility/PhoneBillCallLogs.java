package codility;

import java.util.HashMap;
import java.util.Map;

/*Recalculate the phone bill amount using the call logs*/
public class PhoneBillCallLogs {
    public static void main(String[] args) {

        String S = "00:01:07,400-234-090#00:05:01,701-080-080#00:05:00,400-234-090";
        String[] callLogs = S.split("#");
        HashMap<String, String> logsMap = new HashMap<>();
        int amount = 0;
        HashMap<String, Integer> durationMap = new HashMap<>();

        for (String log : callLogs) {
            String[] currCall = log.split(",");
            String[] time = currCall[0].split(":");
            int hh = Integer.parseInt(time[0]), mm = Integer.parseInt(time[1]), ss = Integer.parseInt(time[2]);
            int currDuration = (hh * 60 * 60) + (mm * 60) + ss;
            if (!durationMap.containsKey(currCall[1]))
                durationMap.put(currCall[1], currDuration);
            else
                durationMap.put(currCall[1], durationMap.get(currCall[1]) + currDuration);
        }

        /*Key=PhoneNumber, Value=Duration*/
        int max = -1;
        String promoNumber = "";
        for (Map.Entry<String, Integer> currCallDuration : durationMap.entrySet()) {
            if (max < currCallDuration.getValue()) {
                max = currCallDuration.getValue();
                promoNumber = currCallDuration.getKey();
            }
        }

        /*Calculate cost*/
        for (Map.Entry<String, Integer> currCallDuration : durationMap.entrySet()) {
            int mm = (int) Math.ceil(currCallDuration.getValue() / 60);
            if (promoNumber != currCallDuration.getKey()) {
                if (mm < 5) {
                    amount += currCallDuration.getValue() * 3;
                } else {
                    amount += 150 * ((currCallDuration.getValue() % 60 == 0) ? currCallDuration.getValue() / 60 : (currCallDuration.getValue() / 60) + 1);
                }
            }
        }
        System.out.println("Amount: " + amount);
    }
}
