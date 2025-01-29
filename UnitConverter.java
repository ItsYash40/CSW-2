//package january28;

public class UnitConverter {

    static double convert(double val, String from, String to) {
        switch (from.toLowerCase()) {
            case "km":
                if (to.equalsIgnoreCase("miles")) {
                    return val * 0.621371;
                }
                break;
            case "miles":
                if (to.equalsIgnoreCase("km")) {
                    return val / 0.621371; 
                }
                break;
            case "celsius":
                if (to.equalsIgnoreCase("fahrenheit")) {
                    return (val * 9 / 5) + 32;
                }
                break;
            case "fahrenheit":
                if (to.equalsIgnoreCase("celsius")) {
                    return (val - 32) * 5 / 9; 
                }
                break;
            default:
                return val;
        }
        return val;
    }

    
    static double convert(int val, String unitType) {
        switch (unitType.toLowerCase()) {
            case "hours to minutes":
                return val * 60;
            case "days to seconds":
                return val * 86400; 
            default:
                return val;
        }
    }
    static double convert(String time) {
        String[] parts = time.split(":");
        if (parts.length != 3) {
            return 0;
        }
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        return (hours * 3600) + (minutes * 60) + seconds;
    }

    public static void main(String[] args) {
       
        System.out.println("10 km to miles: " + convert(10, "km", "miles"));
        System.out.println("25 Celsius to Fahrenheit: " + convert(25, "celsius", "fahrenheit"));
        System.out.println("5 hours to minutes: " + convert(5, "hours to minutes"));
        System.out.println("2 days to seconds: " + convert(2, "days to seconds"));
        System.out.println("Time '02:30:15' in seconds: " + convert("02:30:15"));
    }
}
