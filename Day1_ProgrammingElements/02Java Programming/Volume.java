public class Volume {
    public static void main(String[] args) {
        double r = 6378.0; 
        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(r, 3);
        double volumeMiles3 = volumeKm3 * 0.239913; 

        System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volumeKm3, volumeMiles3);
    }
}
