package net.coderodde.cui.impl;

import java.util.ArrayList;
import java.util.List;
import net.coderodde.cui.AbstractComponent;
import net.coderodde.cui.BorderType;

/**
 * 
 * @author Rodion "rodde" Efremov
 * @version 1.6 (May 29, 2019)
 */
public class VerticalBox extends AbstractComponent {

    
    public VerticalBox(List<BorderType> borderTypes) {
        if (borderTypes != null) {
            for (BorderType borderType : borderTypes) {
                if (borderType != null) {
                    this.borderTypes.add(borderType);
                }
            }
        }
    }
    
    protected char[][] render() {
//        renderTopBorder
        return null;
    }
    
    @Override
    protected char[][] renderContent() {
        throw new UnsupportedOperationException(
                "Cannot print this VerticalBox since it modifies the borders.");
    }

    @Override
    protected int getContentWidth() {
        int maximumWidth = 0;
        
        for (AbstractComponent component : this.components) {
            maximumWidth = Math.max(maximumWidth, 
                                    component.getPreferredWidth());
        }
        
        return maximumWidth;
    }
    

    @Override
    protected int getContentHeight() {
        int lines = 0;
        
        for (AbstractComponent component : this.components) {
            lines += component.getPreferredHeight();
        }
        
        return lines + Math.min(this.components.size() - 1,
                                this.borderTypes.size());
    }
}
