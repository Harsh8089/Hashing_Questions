import java.util.*;

public class Main {

    public static List<Integer> findMinCostServer(int n1, int n2, List<Integer> serverLoad, List<Integer> serverCapacity) {
        // Never change the input array in an interview. Bad practice !!. Hence creating a copy :)
        List<Integer> copyOfCapacity = new ArrayList<>(serverCapacity);
        List<Integer> copyOfLoad = new ArrayList<>(serverLoad);

        Collections.sort(copyOfCapacity, Collections.reverseOrder());
        Collections.sort(copyOfLoad);

        Map<Integer, List<Integer>> hashMap = new HashMap<>();
        Map<Integer, List<Integer>> mapIdx = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            hashMap.putIfAbsent(copyOfLoad.get(i), new ArrayList<>());
            hashMap.get(copyOfLoad.get(i)).add(copyOfCapacity.get(i));

            mapIdx.putIfAbsent(serverLoad.get(i), new ArrayList<>());
            mapIdx.get(serverLoad.get(i)).add(i);
        }

        List<Integer> ans = new ArrayList<>(Collections.nCopies(n2, 0));

        for (Map.Entry<Integer, List<Integer>> entry : hashMap.entrySet()) {
            List<Integer> elements = entry.getValue();
            // Since problem statement has mentioned to return lexicographically smallest.
            Collections.sort(elements);

            List<Integer> idx = mapIdx.get(entry.getKey());
            for (int k = 0; k < idx.size(); k++) {
                ans.set(idx.get(k), elements.get(k));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        List<Integer> serverLoad = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            serverLoad.add(scanner.nextInt());
        }

        List<Integer> serverCapacity = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            serverCapacity.add(scanner.nextInt());
        }

        List<Integer> sequence = findMinCostServer(n1, n2, serverLoad, serverCapacity);
        for (int i = 0; i < n2; i++) {
            System.out.print(sequence.get(i) + " ");
        }

        System.out.println();
    }
}
