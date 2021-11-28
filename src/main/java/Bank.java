import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Bank {

    private String name;

    private Set<Values> values;

    public Bank() {
        this.name = name;
        this.values = new HashSet<>();
    }

    public void addValues(Values values) {
        this.values.add(values);

    }

    public void removeValues(Values values) {
        this.values.remove(values);
    }

}
