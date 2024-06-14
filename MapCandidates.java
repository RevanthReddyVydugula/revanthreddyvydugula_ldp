import java.util.*;

public class MapCandidates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of locations of the company
        HashMap<String, Integer> locations = new HashMap<>();
        for (int i = 0; i < n; i++) {
            locations.put(sc.next(), sc.nextInt());
        }
        // number of candidates
        int nc = sc.nextInt();
        // candidates and their preferred locations list
        HashMap<String, List<String>> candidates = new HashMap<>();
        for (int i = 0; i < nc; i++) {
            String name = sc.next();
            int np = sc.nextInt();
            List<String> preferences = new ArrayList<>();
            for (int j = 0; j < np; j++) {
                preferences.add(sc.next());
            }
            candidates.put(name, preferences);
        }
        Map<String, String> finalMapping = mapCandidatesToLocation(locations, candidates);
        // print the result
        // for (Map.Entry<String, String> entry : finalMapping.entrySet()) {
        // System.out.println("Candidate " + entry.getKey() + " assigned the location "
        // + entry.getValue());
        // }

        System.out.println(finalMapping);
    }

    private static Map<String, String> mapCandidatesToLocation(HashMap<String, Integer> locations,
            HashMap<String, List<String>> candidates) {
        Map<String, String> mappedLocations = new HashMap<>();

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