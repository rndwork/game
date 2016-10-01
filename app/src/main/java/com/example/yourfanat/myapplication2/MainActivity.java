package com.example.yourfanat.myapplication2;

import java.io.*;

class FilesApp {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("D:\\my.txt", false))
        {
            // запись всей строки
            String text = "Мама мыла раму, раму мыла мама";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}