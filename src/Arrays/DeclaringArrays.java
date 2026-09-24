package Arrays;

public class DeclaringArrays {
    public static void main(String[] args) {
        int[] daysInMonth = new int[12];
        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 30 ;
        daysInMonth[8] = 31 ;
        daysInMonth[9] = 31 ;
        daysInMonth[10] = 30 ;
        daysInMonth[11] = 31 ;

        String[] monthNames = {"Jan","feb","march","apr","may","june","july","aug","sept","nov","dec"};

        for (int i = 0; i < daysInMonth.length; i++) {
            System.out.println(monthNames[i] + daysInMonth[i]);
        }
    }
}
