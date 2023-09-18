package designpatterns.builder;

public class Main {

    public static void main(String[] args) {
        User user = User.builder()
                .name("Dev")
                .age(35)
                .email("dev@email.com")
                .phone("010-1234-5678")
                .build();

        System.out.println(user.toString());
    }

}