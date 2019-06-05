public class DataTypes2 {

    public static void main(String[] args){

        /*
            floating points
            float   32 bits
            double  64 bits
         */

        byte discount = 20;
        long phone = 9915721234l;
        //byte data = 20l;

        float pi = 3.14F;
        double pi = 3.14;

        // character type   16 bits
        char ch = 'A';
        char ch = 65; //ascii value of A
        char ch = '\u20b9'; //unicode value of Rupee Symbol
        System.out.println("Ch is: " +ch);

        // 8 bits -> 1 bit (1/0)
        boolean isInternetOn = true;
        isInternetOn = false;
        System.out.println(">>isInternetOn" +isInternetOn);

        //primitive types : Work on Values!! -- int, float, char, boolean
    }

}
