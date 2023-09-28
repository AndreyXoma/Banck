package entity;

import entity.enums.EnumTransaction;

import java.util.Date;

public class Transaction {

    private User user;

    private EnumTransaction typeTransaction;
    private int sumTransaction;
    private Date date;

    private String numberTrans;


    public Transaction(User user, EnumTransaction typeTransaction, int sumTransaction,
                       Date date, String numberTrans) {
        this.user = user;
        this.typeTransaction = typeTransaction;
        this.sumTransaction = sumTransaction;
        this.date = date;
        this.numberTrans = numberTrans;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public EnumTransaction getTransaction() {
        return typeTransaction;
    }

    public void setTransaction(EnumTransaction transaction) {
        this.typeTransaction = transaction;
    }

    public int getSumTransaction() {
        return sumTransaction;
    }

    public void setSumTransaction(int sumTransaction) {
        if(sumTransaction > 0) {
            this.sumTransaction = sumTransaction;
        } else {
            System.out.println("Сумма транзакции не может быть меньше нуля");
        }

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNumberTrans() {
        return numberTrans;
    }

    public void setNumberTrans(String numberTrans) {
        if(numberTrans == null || numberTrans.equals(" ")) {
            System.out.println("Номер для перевода не может быть пустым!");
        } else if (numberTrans.length() < 12) {
            System.out.println("Номер для перевода должен содержать 12 символов \n" +
                    "Пример: +79009999999");
        } else if(numberTrans.charAt(0) != '+') {
            System.out.println("Номер начинается с символа +, смотрите пример!");
        } else {
            this.numberTrans = numberTrans;
        }

    }

    @Override
    public String toString() {
        return String.format("Пользователь %s, тип транзакции %s, " +
                "сумма транзакции %d, дата и время %t, номер перевода %s", user.getNameUser(), typeTransaction.toString(), sumTransaction, date, numberTrans);
    }
}
