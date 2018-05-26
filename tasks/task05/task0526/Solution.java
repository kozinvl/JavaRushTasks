package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Alexos", 24, "LAL street");
        Man man2 = new Man("Eugeniyyenniy", 25, "lalochnaya");
        Woman woman1 = new Woman("Oksanella", 20, "pzdc street");
        Woman woman2 = new Woman("Irapipka", 22, "wat street");
        man1.getOutPut();
        man2.getOutPut();
        woman1.getOutPut();
        woman2.getOutPut();
    }

    public static class Man {
        String name;
        int age;
        String address;
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void getOutPut(){
            System.out.println(name+" "+age+" "+address);
        }
    }

        public static class Woman {
            String name;
            int age;
            String address;
            public Woman(String name, int age, String address) {
                this.name = name;
                this.age= age;
                this.address=address;
            }
            public void getOutPut(){
                System.out.println(name+" "+age+" "+address);
            }
        }
    }

