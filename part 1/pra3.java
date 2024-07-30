import java.util.Scanner;

class pra3 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the distance (in meters): ");
        float distance = sc.nextFloat();

        
        System.out.print("Enter the time - hours: ");
        int hours = sc.nextInt();

        System.out.print("Enter the time - minutes: ");
        int minutes = sc.nextInt();

        System.out.print("Enter the time - seconds: ");
        int seconds = sc.nextInt();

    
        sc.close();

    
        int totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        
        float speedMetersPerSecond = distance / totalTimeInSeconds;
        float totalHours = totalTimeInSeconds / 3600.0f;
        float distanceInKilometers = distance / 1000.0f;
        float speedKilometersPerHour = distanceInKilometers / totalHours;
        float distanceInMiles = distance / 1609.0f;
        float speedMilesPerHour = distanceInMiles / totalHours;

    
        System.out.println(speedMetersPerSecond + " meters per second");
        System.out.println(speedKilometersPerHour + " kilometers per hour");
        System.out.println(speedMilesPerHour + " miles per hour");
    }
}
