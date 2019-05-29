package net.coderodde.cui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodde
 */
public class Demo {
    
    public static void main(String[] args) {
        String s = "\n\na\n\nb\n";
        System.out.println(s.trim().split("\n+").length);
    }
}
