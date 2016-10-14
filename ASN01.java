/*
 * This java code reads a file from the local directory and prints out its contents.
 */
package edu.frostburg.cosc310.POLKABLA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This code is uploaded on github
 * @author Sarah
 */
public class ASN01 {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {

            String currentLine;

            br = new BufferedReader(new FileReader("C:\\testing.txt"));

            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
            }

        } catch (IOException e) {
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
            }
        }

    }
}

