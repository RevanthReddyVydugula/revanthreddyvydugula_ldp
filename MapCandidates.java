import java.util.*;

public class MapCandidates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Locations:\n");
        int n = sc.nextInt(); // number of locations of the company
        System.out.println("Location and their capacities");
        HashMap<String, Integer> locations = new HashMap<>();
        for (int i = 0; i < n; i++) {
            locations.put(sc.next(), sc.nextInt());
        }
        // number of candidates
        System.out.println("Enter number Of Candidates");
        int nc = sc.nextInt();
        // candidates and their preferred locations list
        System.out.println("Enter candidates name and their preferred locations list");
        LinkedHashMap<String, List<String>> candidates = new LinkedHashMap<>();
        for (int i = 0; i < nc; i++) {
            System.out.println("Enter candidate name:\n");
            String name = sc.next();
            System.out.println("Length of preference List");
            int np = sc.nextInt();
            System.out.println("Enter Locations");
            List<String> preferences = new ArrayList<>();
            for (int j = 0; j < np; j++) {
                preferences.add(sc.next());
            }
            candidates.put(name, preferences);
        }
        LinkedHashMap<String, String> finalMapping = mapCandidatesToLocation(locations, candidates);
        // print the result
        for (Map.Entry<String, String> entry : finalMapping.entrySet()) {
            System.out.println("Candidate " + entry.getKey() + " assigned the location "
                    + entry.getValue());
        }
        sc.close();
        // System.out.println(finalMapping);
    }

    private static LinkedHashMap<String, String> mapCandidatesToLocation(HashMap<String, Integer> locations,
            LinkedHashMap<String, List<String>> candidates) {
        LinkedHashMap<String, String> mappedLocations = new LinkedHashMap<>();

        // iterate over candidate and locations to assign locations according to their
        // preferences

        for (Map.Entry<String, List<String>> profile : candidates.entrySet()) {
            String candidateName = profile.getKey();
            List<String> preferences = profile.getValue();
            boolean assigned = false;
            // Iterate through the candidate's preferences
            for (String location : preferences) {
                if (locations.containsKey(location) && locations.get(location) > 0) {
                    // Check if the location can accommodate the candidate i.e., capacity is greater
                    // than zero.
                    mappedLocations.put(candidateName, location);
                    // Reduce capacity of that particular location
                    locations.put(location, locations.get(location) - 1);
                    assigned = true;
                    break;
                }
            }
            if (!assigned) {
                mappedLocations.put(candidateName, "Preferred Location is not available");
            }
        }

        return mappedLocations;
    }

}
