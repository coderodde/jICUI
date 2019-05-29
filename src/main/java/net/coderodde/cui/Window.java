package net.coderodde.cui;

import net.coderodde.cui.impl.VerticalBox;

/**
 * This class implements the actual window that is printed to the console.
 * 
 * @author Rodion "rodde" Efremov
 * @version 1.6 (May 29, 2019)
 */
public class Window {
   
    /**
     * The root component. Usually should be a {@link VerticalBox} or 
     * {@code HorizontalBox}.
     */
    private AbstractComponent root;
    
    public Window() {
        
    }
    
    public Window(AbstractComponent root) {
        this.root = root;
    }
    
    public AbstractComponent getRoot() {
        return root;
    }
    
    public void setRoot(AbstractComponent root) {
        this.root = root;
    }
    
    @Override
    public String toString() {
        if (root == null) {
            return null;
        }
        
        char[][] matrix = root.render();
        return changeZeroCharsToSpaces(matrix);
    }
    
    private static String changeZeroCharsToSpaces(char[][] matrix) {
        StringBuilder stringBuilder = 
                new StringBuilder(
                        matrix.length * (matrix[0].length + 1) - 1);
        
        String lineSeparator = "";
        
        for (int y = 0; y < matrix.length; y++) {
            stringBuilder.append(lineSeparator);
            lineSeparator = "\n";
            
            for (int x = 0; x < matrix[y].length; x++) {
                stringBuilder.append(convertZeroCharToSpace(matrix[y][x]));
            }
        }
        
        return stringBuilder.toString();
    }
    
    private static char convertZeroCharToSpace(char c) {
        return c == '\u0000' ? ' ' : c;
    }
}
