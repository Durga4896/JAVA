public class TypeConversion {
    //how data types are converted from one type to another
    public static void main(String[] args) {
        byte b = 10; //-128 to 127
        short s = 500; //-32768 to 32767
        int i = 25; //-2147483648 to 2147483647
        float f = 25.1f; //-1.4E-45 to 3.4028235E38
        long l = 7895463; //-9223372036854775808 to 9223372036854775807
        double d = 123.456; //-1.7E-308 to 1.7E308

        char c = 'A'; //0 to 65535
        boolean bool = true; //incompatible with other data types

        //implicit type conversion (widening)
        f = b;
        System.out.println(f);

        //explicit type conversion (narrowing)
        b = (byte) i; 
        System.out.println(b);

        System.out.println('A'+'A'); //char is converted to int and then added

    }
}
