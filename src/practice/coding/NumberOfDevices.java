package practice.coding;

import java.util.*;


public class NumberOfDevices {

    static int[] numberOfDevices(String[][] connections, String[] toggleIps) {
        Map<List<String>,String> ipMap = new HashMap<>();
        int arrLength = connections.length;
        List<DoublyLinkedList.Node> nodes = new ArrayList<>();
        int[] numOfDevices = new int[toggleIps.length];

        for(int row = 0; row < connections.length; row ++) {
            DoublyLinkedList.Node n1 = DoublyLinkedList.createNode(connections[row][0]);
            DoublyLinkedList.Node n2 = DoublyLinkedList.createNode(connections[row][1]);
            n1.next = n2;
            n2.prev = n1;
            nodes.add(n1);
            nodes.add(n2);
        }

        for(int idx =0 ; idx < toggleIps.length; idx++) {
            DoublyLinkedList.Node n = DoublyLinkedList.createNode(toggleIps[idx]);
            for(DoublyLinkedList.Node ipNode: nodes) {
                if(ipNode.val.equalsIgnoreCase(n.val)){
                    if(ipNode.next != null && ipNode.next.state.equalsIgnoreCase("active") && ipNode.state.equalsIgnoreCase("active")) {
                        numOfDevices[idx] = 1;
                    } else {
                        numOfDevices[idx] = 0;
                        ipNode.state ="active";
                    }
                    if(ipNode.prev != null && ipNode.prev.state.equalsIgnoreCase("active") && ipNode.state.equalsIgnoreCase("active")) {
                        numOfDevices[idx] = 1;
                    } else {
                        numOfDevices[idx] = 0;
                        ipNode.state ="active";
                    }
                }
            }
        }

        return numOfDevices;
    }

    static class DoublyLinkedList {
        int dimension = 3;

        static class Node {
            String state;
            String val;
            Node prev;
            Node next;
        }

        static Node createNode(String data) {
            Node node = new Node();
            node.val = data;
            node.state = "inactive";
            node.prev = null;
            node.next = null;

            return node;

        }

    }


    public static void main(String[] s) {
        String[][] connections = new String [][] {{"192.167.0.0", "192.167.0.1"}, {"192.167.0.2", "192.167.0.0"}, {"192.167.0.0", "192.167.0.3"}};
        String[] toggleIps = new String[] {"192.167.0.1"};
        numberOfDevices(connections,toggleIps);
    }
}
