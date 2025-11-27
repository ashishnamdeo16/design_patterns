package creational.builder;

public class Test {
    public static void main(String[] args) {
        StudentBuilder ashish = new StudentBuilder.Information()
                .setCls(11)
                .build();
    }
}
