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
    
    private static final char CHAR_SINGLE_HORIZONTAL_BAR = '\u2501';
    private static final char CHAR_DOUBLE_HORIZONTAL_BAR = '\u2550';
    
    private String[] lines;
    
    public Label(String labelText) {
        setText(labelText);
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
}
