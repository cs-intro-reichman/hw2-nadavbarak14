public class TimeCalc {
    public static void main(String[] args) {
        String[] timeParts = args[0].split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = hours * 60 + minutes + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        // Constructing output with leading zeros where necessary using string concatenation
        String formattedHours = (newHours < 10) ? "0" + newHours : String.valueOf(newHours);
        String formattedMinutes = (newMinutes < 10) ? "0" + newMinutes : String.valueOf(newMinutes);

        System.out.println(formattedHours + ":" + formattedMinutes);
    }
}
