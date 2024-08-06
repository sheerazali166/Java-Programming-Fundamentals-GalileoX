package multithreading_example;

import java.util.LinkedList;

public class CustomerQueues {

    private static LinkedList<Customer> linkedListCustomerQueueOne = new LinkedList<Customer>();
    private static LinkedList<Customer> linkedListCustomerQueueTwo = new LinkedList<Customer>();

    public static void enterCustomer(int queue, Customer customer) {

        if (queue == 0) {
            linkedListCustomerQueueOne.addLast(customer);
        } else {
            linkedListCustomerQueueTwo.addLast(customer);
        }

    }

    public static Customer attendCustomer(int queue) {
        if (queue == 0) {
            if (linkedListCustomerQueueOne.size() > 0) {
                return linkedListCustomerQueueOne.removeFirst();
            }
            return null;
        }
        if (linkedListCustomerQueueTwo.size() > 0) {
            return linkedListCustomerQueueTwo.removeFirst();
        }
        return null;
    }

    public String toString() {
        return "\tQueue 1: " + linkedListCustomerQueueOne + "\n\tQueue 2: " + linkedListCustomerQueueTwo;
    }
}
