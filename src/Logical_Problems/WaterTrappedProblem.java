/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logical_Problems;

import java.util.Arrays;

/**
 * Given an array of integers representing heights of bars, compute how much water can be trapped between them after it rains.
 * Input:  height = [3,0,2,0,4]
 * Output: 7
 * Explanation: Water trapped = 3 + 1 + 3 = 7
 * @author krishna
 */
public class WaterTrappedProblem {
    public static void main(String[] args) {
        /**
         * Methametical solution
         * 
         * Index:   0  1  2  3  4
         * Height:  3  0  2  0  4
         * leftMax: 3  3  3  3  4
         * rightMax:4  4  4  4  4
         * Water:   0  3  1  3  0
         */
        
        int[] height = {3,0,2,0,4};
        calculateWaterTrapped(height);
        
    }
    
    private static void calculateWaterTrapped(int[] height){
        
        int n = height.length;
        
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        
        System.out.print("leftMax = ");
        Arrays.stream(leftMax).forEach(System.out :: print);
        
        System.out.println("");
        
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        System.out.print("rightMax = ");
        Arrays.stream(rightMax).forEach(System.out :: print);
        
        System.out.println("");
        
        int[] water = new int[n];
        for (int i = 0; i < n; i++) {
            water[i] = Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        System.out.print("water = ");
        Arrays.stream(water).forEach(System.out :: print);
        
        
        System.out.println("");
        int totalWaterTrap = Arrays.stream(water).sum();
        
        System.out.println("totalWaterTrap = "+totalWaterTrap);
    }
}
