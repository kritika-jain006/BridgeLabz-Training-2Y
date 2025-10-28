import java.util.*;

class Participant<T> {
    private T rollNo;
    private String name;
    private String branch;

    public Participant(T rollNo, String name, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
    }

    public T getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
    public String getBranch() {
        return branch;
    }
}
public void registeredParticipant() {
    System.out.println("Registered Participants:");
    for (String participant : registered) {
        System.out.println(participant);
    }
}
public void cancelRegistered() {
    if (!registered.isEmpty()) {
        String removedParticipant = registered.remove(0);
        System.out.println(removedParticipant);
    } 
}   

public class StudentEventRegistrationSystem {
    public static void main(String[] args) {
        ArrayList<String> registered = new ArrayList<>();
        LinkedList<String> waitlist = new LinkedList<>();
        HashSet<Integer> rollNos = new HashSet<>();
        registered.add("Kritika");
        registered.add("Bhoomi");
        waitlist.add("Ritika");
        waitlist.add("Khushi");
        rollNos.add(101);
        rollNos.add(102);
        registeredParticipant();
        cancelRegistered();
    }}