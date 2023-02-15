package be.intecbrussel;

public class ScopesInJava { // begin class scop
    public static void main(String[] args) { // begin method scope

        int i;

        for (i = 0; i < 10; i++) { // begin for loop
            System.out.println(i);
        } // end for loop

        System.out.println(i);

        int x;

        { // begin block scope

            x = 10;
            System.out.println(x);

        } // end block scope

        System.out.println(x);

    } // end method scope

    System.out.println(x);

} // end class scope
