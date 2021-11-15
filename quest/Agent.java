package quest;

public class Agent {

    private String firstName;
    private String lastName;

    public Agent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static Agent createAgent(String s){

        String firstname = s.split(" ") [0];
        String lastname = s.split(" ") [1];

        return new Agent(firstname, lastname);
    }
}