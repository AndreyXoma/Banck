package utils;

import entity.ListUser;
import entity.User;

import java.io.*;
import java.util.List;

public class FileUtils {

    private static String[] getPartsOfLine(String line) {
        return line.split(",");
    }

    public static void readFile(ListUser listUser, String fileName) {
        try(FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {

            bufferedReader.readLine();

            String line;

            while((line = bufferedReader.readLine()) != null) {
                String[] parseOfLine = getPartsOfLine(line);

                User user = new User(parseOfLine[0], parseOfLine[1], parseOfLine[2], Integer.parseInt(parseOfLine[3]), null);
                listUser.insertUser(user);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Такой файл не найден");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(ListUser listUser, String fileName) {

        try (FileWriter writer = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            List<User> list = listUser.getUserList();

            for (int i = 0; i < listUser.getSize(); i++) {
                bufferedWriter.write(list.get(i) + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
