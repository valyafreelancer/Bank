import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setName("Сбербанк");

        Values values1 = new Values("Деньги", "Марки");
        bank.addValues(values1);

        Map<String, Values> values = new HashMap<>();
        values.put("key1", values1);
        System.out.println(values.get("key1"));

    }
}
