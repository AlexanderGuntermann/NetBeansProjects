/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteaddition;

import java.util.Arrays;

/**
 *
 * @author alexguntermann
 */
public class Byte {

    private char[] bits;
    private char[] temp;

    public Byte() {
        this.bits = new char[8];

    }

    public Byte(char[] bits) {
        // deep copy plz
        this.bits = new char[8];
        for (int i = 0; i < bits.length; i++) {
            this.bits[i] = bits[i];
        }

//        
//        this.bits = bits;
    }

    public Byte(Byte b) {
        this.bits = new char[8];
        for (int i = 0; i < bits.length; i++) {
            this.bits[i] = b.bits[i];
        }
    }

    public char[] getBits() {

        return bits;

    }

    public void setBits(char[] bits) {
        this.bits = bits;
    }

    public Byte add(Byte g) {

        char a;
        char b;
        char carry = '0';
        Byte answer = new Byte();
        char[] sum = new char[8];
        for (int i = 7; i >= 0; i--) {

            a = bits[i];
            b = g.getBits()[i];

//            addOneBit(a, b, carry);
            sum[i] = addOneBit(a, b, carry);

            carry = getCarry(a, b, carry);

        }
//        System.out.println(sum);
        answer.setBits(sum);
//        System.out.println(answer.getBits());
        return answer;
    }

    // determining one bit calculations (1+1, 1+0, 0+0, 1+1)
    public char addOneBit(char a, char b, char carry) {

        if (a == '1' && b == '0' && carry == '0') { // no carry
            return '1';
        } else if (a == '0' && b == '1' && carry == '0') { // no carry
            return '1';
        } else if (a == '0' && b == '0' && carry == '0') { // no carry
            return '0';
        } else if (a == '1' && b == '1' && carry == '0') { // no carry

            return '0';

        } else if (a == '0' && b == '1' && carry == '1') {
            return '0';
        } else if (a == '0' && b == '0' && carry == '1') {
            return '1';
        } else if (a == '1' && b == '1' && carry == '1') {
            return '1';
        } else if(a == '1' && b == '0' && carry == '1') {
            return '0';
        } 
            return 's';
        }
 

    public char getCarry(char a, char b, char carry) {

        if (a == '0' && b == '0' && carry == '0') { //1
            return '0';

        } else if (a == '0' && b == '0' && carry == '1') { //2 
            return '0';

        } else if (a == '0' && b == '1' && carry == '0') { // 3
            return '0';

        } else if (a == '0' && b == '1' && carry == '1') { // 4
            return '1';

        } else if (a == '1' && b == '0' && carry == '0') { //5 
            return '0';

        } else if (a == '1' && b == '0' && carry == '1') { //6
            return '1';

        } else if (a == '1' && b == '1' && carry == '0') { //7
            return '1';

        } else if (a == '1' && b == '1' && carry == '1') { //8
            return '1';

        }
        return 'g';
    }

    public Byte to2sComplement() {

        if (bits[0] == '1') {

            Byte complement = new Byte();
            char[] one = {'0', '0', '0', '0', '0', '0', '0', '1'};
            Byte addOne = new Byte(one);

            for (int i = 0; i < bits.length; i++) {

                if (bits[i] == '1') {
                    complement.getBits()[i] = '0';

                } else if (bits[i] == '0') {
                    complement.getBits()[i] = '1';
                }
            }

            complement = complement.add(addOne);

//            if()
            return complement;
        } else {
            return this;
        }
    }

    public Byte biasTo2sComplement() {
        Byte temp = new Byte(bits);
        char[] bits = temp.getBits();

        if (bits[0] == '1') {
            bits[0] = '0';
        } else if (bits[0] == '0') {
            bits[0] = '1';

        }
        return temp;
    }

    public int magnitude() {

        int totalNum = 0;
        if (bits[0] == '1') {
//            magnitudeNegative();
            totalNum = magnitudeNegative();
        } else if (bits[0] == '0') {
//            magnitudePositive();
            totalNum = magnitudePositive();
        }

        return totalNum;
    }

    public int magnitudePositive() {
        double result = 0;

        for (int i = 0; i < bits.length; i++) {
            int bit = 0;

            if (bits[i] == '1') {
                bit = 1;
            }
            result = result + (Math.pow(2, 8 - (i + 1)) * (bit));

        }
        return (int) result;

    }

    public int magnitudeNegative() {
        // 2scomplement
        // return magnitudePositive(2scomplement) * -1;
        Byte twosComp = to2sComplement();
        char[] bits = twosComp.getBits();

        double result = 0;

        for (int i = 0; i < bits.length; i++) {
            int bit = 0;
            if (bits[i] == '1') {
                bit = 1;
            }
            result = result + (Math.pow(2, 8 - (i + 1)) * (bit));
        }
        return (int) result * -1;
    }

   
    public String toString() {
        String result = "";
        for (int i = 0; i < bits.length; i++) {
            result += Character.toString(bits[i]);
        }
        return result;

    }
}
