package net.coderodde.cui.impl;

import java.util.Objects;
import net.coderodde.cui.AbstractComponent;

/**
 * This class implements a simple label component.
 * 
 * @author Rodion "rodde" Efremov
 * @version 1.6 (May 28, 2019)
 */
public final class Label extends AbstractComponent {
    
    private static final int MINIMUM_WIDTH = 1;
    private static final int MINIMUM_HEIGHT = 1;
    
    private String[] lines;
    private int width;
    private int height;
    
    public Label(String labelText) {
        setText(labelText);   
        setMinimumDimensions();
    }
    
    public Label(String labelText, int width, int height) {
        setText(labelText);
        this.width = Math.max(width, MINIMUM_WIDTH);
        this.height = Math.max(height, MINIMUM_HEIGHT);
    }
    
    private void setMinimumDimensions() {
        this.height = lines.length;
        int maximumWidth = 0;
        
        for (String line : lines) {
            maximumWidth = Math.max(maximumWidth, line.length());
        }
        
        this.width = maximumWidth;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setWidth(int width) {
        this.width = Math.max(MINIMUM_WIDTH, width);
    }
    
    public void setHeight(int height) {
        this.height = Math.max(MINIMUM_HEIGHT, width);
    }
    
    public String[] getText() {
        return lines;
    }
    
    public void setText(String text) {
        this.lines = Objects.requireNonNull(text, "The label text is null.")
                            .trim()
                            .split("\n+");
    }

    @Override
    protected int getContentWidth() {
        int maximumLineWidth = 0;
        
        for (String line : lines) {
            maximumLineWidth = Math.max(maximumLineWidth, line.length());
        }
        
        return maximumLineWidth;
    }

    @Override
    protected int getContentHeight() {
        return lines.length;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    protected char[][] renderContent() {
        char[][] matrix = new char[getContentHeight()][getContentWidth()];
        
        for (int y = 0; y < getContentHeight(); y++) {
            for (int x = 0; x < lines[y].length(); x++) {
                matrix[y][x] = lines[y].charAt(x);
            }
        }
        
        return matrix;
    }
}
