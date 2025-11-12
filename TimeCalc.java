public class TimeCalc {
    public static void main(String[] args) {
        // extract the hours, minutes and minutes to add from input
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutes_to_add = Integer.parseInt(args[1]);

        // calculating the new time with the added minutes.
        int total_minutes = (hours*60) + minutes + minutes_to_add;
        int total_hours = total_minutes/60;
        int new_hours = total_hours%24;
        int new_minutes = total_minutes - (total_hours*60);

        // checking if we need to add 0 to the hour or minutes
        if (new_hours<=9){
            if (new_minutes <= 9){
                System.out.println("0" + new_hours + ":" + "0" + new_minutes);
            } else {
                System.out.println("0" + new_hours + ":" + new_minutes);
            }
        } else {
            if (new_minutes <= 9){
                System.out.println(new_hours + ":" + "0" + new_minutes);
            } else {
                System.out.println(new_hours + ":" + new_minutes);
            }
        }
    }
}
