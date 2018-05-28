package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }


    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private String FileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;


        }

        @Override
        public String getFileContent() {
            return  FileContent;
        }

        @Override
        public void run() {

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fullFileName));
                String vvod;
                while((vvod = reader.readLine()) != null)
                    FileContent = FileContent+vvod+" ";
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface extends Runnable {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();


    }



}
