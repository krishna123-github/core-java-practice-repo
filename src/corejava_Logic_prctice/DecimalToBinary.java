/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corejava_Logic_prctice;

/**
 *
 * @author krishna
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        decimalToBinary(453535);
    }

    private static void decimalToBinary(int decimal) {
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }

        for (int i : binary) {
            System.out.println(i);

        }
    }
}
