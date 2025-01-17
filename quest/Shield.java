package quest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
        List<Agent> agents = names
                .stream()
                .map(name -> name.split(" "))
                .map(a -> new Agent(a[0],a[1]))
                .collect(Collectors.toList());

        /* Oder auch so:
        List<Agent> agents = names
                .stream()
                .map(Agent::createAgent)
                .collect(Collectors.toList());
         */

        showAgents(agents);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}