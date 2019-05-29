package net.coderodde.cui;

import net.coderodde.cui.impl.Label;

/**
 *
 * @author rodde
 */
public class Demo {
    
    public static void main(String[] args) {
        Window window = new Window(new Label("\n\nHello\nworld\n!\n"));
        System.out.println(window.toString());
    }
}
