import adapter.AdapterImpl;
import adapter.AdapterImpl2;
import adapter.StandardImpl;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        client.setStandard(new StandardImpl());
        client.traitement(7,4);

        client.setStandard(new AdapterImpl());
        client.traitement(7,4);

        client.setStandard(new AdapterImpl2());
        client.traitement(7,4);
    }
}
