package adapter;

public class StandardImpl implements Standard {
    @Override
    public void operation(double nb1, double nb2) {
        System.out.println("Standard Impl result="+ nb1*nb2);
    }
}
