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

    }

}
