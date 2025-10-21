public class NullPointerDemo {

    public static void generateNullPointerException() {
        String text = null;
        System.out.println("Length of the text: " + text.length());
    }

    public static void handleNullPointerException() {
        String text = null; 

        try {
         
            System.out.println("Length of the text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
            System.out.println("Message: " + e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
        }
    }

    public static void main(String[] args) {


        //generateNullPointerException(); this is commented to avoid program termination as it will throw an NPE

        
        handleNullPointerException();
        //this will handle the NPE and continue execution
    }
}
