package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int bound = scanner.nextInt();

        System.out.println("Введите данные для первого списка: ");
        ArrayList<String> A = new ArrayList<>(bound);
        for (int i = 0; i < bound; i++) {
            A.add(scanner.next());
            Collections.sort(A);
        }
        print(A);

        System.out.println("Введите данные для второго списка: ");
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < bound; i++) {
            B.add(scanner.next());
            Collections.sort(B);
            Collections.reverse(B);
        }
        print(B);

        System.out.println("______________________________");

        ArrayList<String> C = new ArrayList<>();
        int zero = 0;
        while (C.size() < A.size()+ B.size()) {
            C.add(A.get(zero));
            C.add(B.get(zero));
            zero++;
        }
        print(C);

        System.out.println("______________________________");


        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        print(C);


      /* Collections.addAll(words);
        Iterator<String> printWords = words.iterator();
        while (printWords.hasNext()){
            words.add(inputWords);
            System.out.println(printWords.next());
        }*/
    }

    static void print(ArrayList list) {
        Iterator<String> all = list.iterator();
        while (all.hasNext()) {
            System.out.println(all.next());
        }
    }
}
// this List of lists will need to contain

/*
a)  В задании нельзя использовать циклы for и for each. Только while и Iterator
b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
c)  Затем программа должна отобразить этот список
d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б.
После также отображает его в консоли

e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,Б5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
f)  После объединения отобразить в консоли список С
g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов,
 и распечатать отсортированный список С. (Comparator)
 */