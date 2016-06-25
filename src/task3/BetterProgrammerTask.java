package task3;

import java.util.*;

public class BetterProgrammerTask {

    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    public static double getAverage(Node root) {
        /*
          Please implement this method to
          return the average of all node values (Node.getValue()) in the tree.
         */

        List<Node> nodes = new ArrayList<Node>();
        CountNodes(root, nodes);

        double sum = 0;
        for (Node node : nodes) {
            sum += node.getValue();
        }

        return sum / nodes.size();
    }

    private static void CountNodes(Node root, List<Node> nodes) {
        nodes.add(root);
        for (Node node : root.getChildren()) {
            CountNodes(node, nodes);
        }
    }
}
