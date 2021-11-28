import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Values {

    private String money;
    private String stamp;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Values values = (Values) o;
        return Objects.equals(money, values.money) && Objects.equals(stamp, values.stamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(money, stamp);
    }
}
