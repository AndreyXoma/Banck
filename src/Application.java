import entity.ListUser;
import entity.User;
import service.Authorization;
import utils.FileUtils;
import utils.Menu;

import java.util.Scanner;

public class Application {

    private static ListUser listUser = new ListUser();
    private static Authorization authorization = new Authorization(listUser);

    public static void run() {

        Menu menu;

        FileUtils.readFile(listUser, "src/users.csv");

        String login;
        String password;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш логин:");
        login = scanner.nextLine();
        System.out.println("Введите ваш пароль:");
        password = scanner.nextLine();

        User authUser = authorization.auth(login, password);

        if(authUser == null) {
            System.out.println("Error: Неверный логин и пароль!");
        }
        printMenu(authUser);

        FileUtils.writeFile(listUser, "src/parserUser.txt");

    }

    private static void printMenu(User user) {
        System.out.println("Здравствуйте " + user.getNameUser());
        System.out.print("Команды:\n" +
                "1. Просмотреть баланс\n" +
                "2. Перевести деньги\n" +
                "3. История переводов\n" +
                "4. Данные о вас\n");
    }

}
