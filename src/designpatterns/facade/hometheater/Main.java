package designpatterns.facade.hometheater;

public class Main {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie("Train To Busan");
        homeTheater.endMovie();

    }
}
