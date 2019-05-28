// Copyright @ SanKir Technologies, 2018 - Java Programming - Control Operations
package controloperations;

public class ControlOperations {

    String name1 = "Kiran";
    int n1 = 2, n2 = 3;

    static final int n3=10;

    static String name2 = "sankir";

    public static void main(String args[]) {

        for (int i = 0; i < 3; i++)
            System.out.println("Printing I time - " + i);
        System.out.println();


        int j = 0;
        while (j < 3) {
            System.out.println("Printing J time - " + j);
            j++;
        }
        System.out.println();

        int k = 0;
        do {
            System.out.println("Printing K time - " + k);
            k++;
        } while (k < 3);
        System.out.println();


        /*ControlOperations co = new ControlOperations();
        System.out.println(co.name1);

        System.out.println(co.n1 + co.n2);
        System.out.println(n3);

        System.out.println(name2);*/


    }
}


