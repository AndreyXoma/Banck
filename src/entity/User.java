package entity;

import java.util.List;

public class User {

    private String nameUser;
    private String login;
    private String password;
    private int balance;
    private List<Transaction> transactionList;

    public User(String nameUser, String login, String password,
                int balance, List<Transaction> transactionList) {
        this.nameUser = nameUser;
        this.login = login;
        this.password = password;
        this.balance = balance;
        this.transactionList = transactionList;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        if(nameUser == null || nameUser.equals(" ")) {
            System.out.println("Некорректное имя пользователя!");
        } else {
            this.nameUser = nameUser;
        }

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if(login == null) {
            System.out.println("Ошибка: логин не может быть пустым");
        } else {
            this.login = login;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null || password.equals(" ")) {
            System.out.println("Ошибка: пароль не может быть пустым");
        } else {
            this.password = password;
        }

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance < 0) {
            System.out.println("Ошибка: баланс не может быть меньше нуля!");
        } else {
            this.balance = balance;
        }

    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public String toString() {
        return String.format("Пользователь: %s, логин: %s, пароль: %s, баланс: %d", nameUser, login, password, balance);
    }
}
