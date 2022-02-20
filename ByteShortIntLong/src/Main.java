public class Main {
    public  static  void main(String[] args){
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);

        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Interger maximum value = " + myMaxIntValue);

        System.out.println("Busted minimum value = " + (myMinIntValue-1));

        System.out.println("Busted maximum value = " + (myMaxIntValue +1));

        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte minimum value = " + myMinByteValue);

        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte maximum value =" + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);

        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short maximum value =" + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long minimum value = " + myMinLongValue);

        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long maximum value =" + myMaxLongValue);

        byte newByteValue = (byte) (myMaxByteValue/2);
        System.out.println("new byte value using type casting = "  + newByteValue);

        //challenge

        int intVariable =20;
        byte byteVariable = 12;
        short shortVariable = 324;
        long heyLong =( long)(50000 + 10*(intVariable+byteVariable+shortVariable));
        System.out.println("long variable = " +heyLong);
    }

}
