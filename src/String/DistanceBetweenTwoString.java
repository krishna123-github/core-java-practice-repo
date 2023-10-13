/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.io.*;

import java.util.*;

/**
 *
 * @author krishna
 */
class DistanceBetweenTwoString {

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        String[] words = br.readLine().split(" ");
//
//        int out_ = distance(words[0], words[1]);
//        System.out.println(out_);
//
//        wr.close();
//        br.close();

        int out_ = distance("krishna", "Patel");
        System.out.println(out_);
    }

    static int distance(String a, String b) {
        //IMPLEMENT THIS FUNCTION

        if (a.length() == 0) {
            return b.length();
        }

        if (b.length() == 0) {
            return a.length();
        } else if (a.charAt(0) == b.charAt(0)) {
            return distance(a.substring(1), b.substring(1));
        } else {
            int rep = distance(a.substring(1), b);
            int ins = distance(a, b.substring(1));
            int del = distance(a.substring(1), b.substring(1));
           
            System.out.println("rep int del " + rep + " " + ins + " " + del);
            int temp = Math.min(rep, ins);
            System.out.println("temp " + temp);
            int result = Math.min(temp, del) + 1;
            System.out.println("result " + result);
            return result;

        }
    }
}
