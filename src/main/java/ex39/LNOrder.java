package ex39;

import java.util.Comparator;

public class LNOrder implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getLastName().compareTo(o2.getFirstName());
    }
}
