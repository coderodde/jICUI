package net.coderodde.cui;

import java.util.Objects;

/**
 *
 * @author rodde
 */
public abstract class AbstractComponent {
  
    private static final char CHAR_SINGLE_HORIZONTAL_BAR = '\u2501';
    private static final char CHAR_DOUBLE_HORIZONTAL_BAR = '\u2550';
    
    public enum HorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }
    
    public enum VerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }
    
    protected BorderType topBorderType    = BorderType.SINGLE_BAR_BORDER;
    protected BorderType bottomBorderType = BorderType.SINGLE_BAR_BORDER;
    protected BorderType leftBorderType   = BorderType.SINGLE_BAR_BORDER;
    protected BorderType rightBorderType  = BorderType.SINGLE_BAR_BORDER;
    protected boolean roundTopLeftCorner;
    protected boolean roundTopRightCorner;
    protected boolean roundBottomLeftCorner;
    protected boolean roundBottomRightCorner;
    protected int preferredWidth;
    protected int preferredHeight;
    protected int minimumWidth;
    protected int minimumHeight;
    protected int topMarginThickness;
    protected int bottomMarginThickness;
    protected int leftMarginThickness;
    protected int rightMarginThickness;
    protected int topPaddingThickness;
    protected int bottomPaddingThickness;
    protected int leftPaddingThickness;
    protected int rightPaddingThickness;
    
    protected HorizontalAlignment contentHorizontalAlignment =
            HorizontalAlignment.CENTER;  
    
    protected VerticalAlignment contentVerticalAlignment = 
            VerticalAlignment.CENTER;
    
    public BorderType getTopBorderType() {
        return topBorderType;
    }
    
    public BorderType getBottomBorderType() {
        return bottomBorderType;
    }
    
    public BorderType getLeftBorderType() {
        return leftBorderType;
    }
    
    public BorderType getRightBorderType() {
        return rightBorderType;
    }
    
    public boolean getRoundTopLeftCorner() {
        return roundTopLeftCorner;
    }
    
    public boolean getRoundTopRightCorner() {
        return roundTopRightCorner;
    }
    
    public boolean getRoundBottomLeftCorner() {
        return roundBottomLeftCorner;
    }
    
    public boolean getRoundBottomRightCorner() {
        return roundBottomRightCorner;
    }
    
    public int getPreferredWidth() {
        return preferredWidth;
    }
    
    public int getPreferredHeight() {
        return  preferredHeight;
    }
    
    public int getTopMarginThickness() {
        return topMarginThickness;
    }
    
    public int getBottomMarginThickness() {
        return bottomMarginThickness;
    }
    
    public int getLeftMarginThickness() {
        return leftMarginThickness;
    }
    
    public int getRightMarginThickness() {
        return rightMarginThickness;
    }
    
    public int getTopPaddingThickness() {
        return topPaddingThickness;
    }
    
    public int getBottomPaddingThickness() {
        return bottomPaddingThickness;
    }
    
    public int getLeftPaddingThickness() {
        return leftPaddingThickness;
    }
    
    public int getRightPaddingThickness() {
        return rightPaddingThickness;
    }
    
    public HorizontalAlignment getContentHorizontalAlignment() {
        return contentHorizontalAlignment;
    }
    
    public VerticalAlignment getContentVerticalAlignment() {
        return contentVerticalAlignment;
    }
    
    public void setTopBorderType(BorderType topBorderType) {
        this.topBorderType = Objects.requireNonNull(
                topBorderType, 
                "The input top border type is null.");
    }
    
    public void setBottomBorderType(BorderType bottomBorderType) {
        this.bottomBorderType = Objects.requireNonNull(
                bottomBorderType, 
                "The input bottom border type is null.");
    }
    
    public void setLeftBorderType(BorderType leftBorderType) {
        this.leftBorderType = Objects.requireNonNull(
                leftBorderType, 
                "The input left border type is null.");
    }
    
    public void setRightBorderType(BorderType rightBorderType) {
        this.rightBorderType = Objects.requireNonNull(
                rightBorderType, 
                "The input right border type is null.");
    }
    
    public void setRoundTopLeftCorner(boolean round) {
        this.roundTopLeftCorner = round;
    }
    
    public void setRoundTopRightCorner(boolean round) {
        this.roundTopRightCorner = round;
    }
    
    public void setRoundBottomLeftCorner(boolean round) {
        this.roundBottomLeftCorner = round;
    }
    
    public void setRoundBottomRightCorner(boolean round) {
        this.roundBottomRightCorner = round;
    }
    
    public void setPreferredWidth(int prefferedWidth) {
        this.preferredWidth = Math.max(getAbsoluteMinimumWidth(), 
                                       prefferedWidth);
    }
    
    public void setPreferredHeight(int prefferedHeight)  {
        this.preferredHeight = Math.max(getAbsoluteMinimumHeight(),
                                        prefferedHeight);
    }
    
    /**
     * Sets the minimum width. If {@code minimumRequestedWidth} is not 
     * sufficiently large for holding the contents, its value is increased.
     * 
     * @param requestedMinimumWidth the requested minimum width.
     */
    public void setMinimumWidth(int requestedMinimumWidth) {
        this.minimumWidth = Math.max(getAbsoluteMinimumWidth(), 
                                     requestedMinimumWidth);
    }
    
    /**
     * Sets the minimum height. If {@code minimumRequestedHeight} is not 
     * sufficiently large for holding the contents, its value is increased.
     * 
     * @param requestedMinimumHeight the requested minimum height.
     */
    public void setMinimumHeight(int requestedMinimumHeight) {
        this.minimumHeight = Math.max(getAbsoluteMinimumHeight(),
                                      requestedMinimumHeight);
    }
    
    public void setTopMarginThickness(int topMarginThickness) {
        this.topMarginThickness = Math.max(0, topMarginThickness);
    }
    
    public void setBottomMarginThickness(int bottomMarginThickness) {
        this.bottomMarginThickness = Math.min(0, bottomMarginThickness);
    }
    
    public void setLeftMarginThickness(int leftMarginThickenss) {
        this.leftMarginThickness = Math.max(0, leftMarginThickenss);
    }
    
    public void setRightMarginThickness(int rightMarginThickness) {
        this.rightMarginThickness = Math.max(0, rightMarginThickness);
    }
    
    public void setTopPaddingThickenss(int topPaddingThickness) {
        this.topPaddingThickness = Math.max(0, topPaddingThickness);
    }
    
    public void setBottomPaddingThickness(int bottomPaddingThickness) {
        this.bottomPaddingThickness = Math.max(0, bottomPaddingThickness);
    }
    
    public void setLeftPaddingThickness(int leftPaddingThickness) {
        this.leftPaddingThickness = leftPaddingThickness;
    }
    
    public void setRightPaddingThickness(int rightPaddingThickness) {
        this.rightPaddingThickness = rightPaddingThickness;
    }
    
    public void setContentHorizontalAlignment(
            HorizontalAlignment horizontalAlignment) {
        this.contentHorizontalAlignment = 
                Objects.requireNonNull(
                        horizontalAlignment,
                        "The input horizontal alignment is null.");
    }
    
    public void setContentVerticalAlignment(
            VerticalAlignment verticalAlignment) {
        this.contentVerticalAlignment = 
                Objects.requireNonNull(
                        verticalAlignment,
                        "The input vertical alignment is null.");
    }
    
    protected char[][] render() {
        int preferredWidth = getPreferredWidth();
        int preferredHeight = getPreferredHeight();
        
        char[][] matrix = new char[preferredHeight][preferredWidth];
        renderTopBorder(matrix);
        renderBottomBorder(matrix);
        renderLeftBorder(matrix);
        renderRightBorder(matrix);
        renderTopLeftCorner(matrix);
        renderTopRightCorner(matrix);
        renderBottomLeftCorner(matrix);
        renderBottomRightCorner(matrix);
        renderContent(matrix);
        return matrix;
    }
    
    private void renderTopBorder(char[][] matrix) {
        if (topBorderType == BorderType.NON_EXISTING_BORDER) {
            return;
        }
        
        int borderWidth =
                getPreferredWidth() - getLeftMarginThickness()
                                    - getRightMarginThickness();
        
        if (leftBorderType != BorderType.NON_EXISTING_BORDER) {
            borderWidth--;
        }
        
        if (rightBorderType != BorderType.NON_EXISTING_BORDER) {
            borderWidth--;
        }
        
        int y = getTopMarginThickness();
        int x = getLeftMarginThickness() - 
                (leftBorderType != BorderType.NON_EXISTING_BORDER ? 1 : 0);
        
        renderVerticalBorder(matrix, borderWidth, x, y);
    }
    
    private void renderBottomBorder(char[][] matrix) {
        if (bottomBorderType == BorderType.NON_EXISTING_BORDER) {
            return;
        }
        
        int borderWidth = 
                getPreferredWidth() - getLeftMarginThickness()
                                    - getRightMarginThickness();
        
        if (leftBorderType != BorderType.NON_EXISTING_BORDER) {
            borderWidth--;
        }
        
        if (rightBorderType != BorderType.NON_EXISTING_BORDER) {
            borderWidth--;
        }
        
        int y = getTopMarginThickness() + 
                (topBorderType != BorderType.NON_EXISTING_BORDER ? 1 : 0) +
                getContentHeight();
        
        int x = getLeftMarginThickness() -
                (leftBorderType != BorderType.NON_EXISTING_BORDER ? 1 : 0);
        
        renderHorizontalBorder(matrix, borderWidth, x, y);
    }
    
    private void renderLeftBorder(char[][] matrix) {
        if (leftBorderType == BorderType.NON_EXISTING_BORDER) {
            return;
        }
        
        int borderHeight = 
                getPreferredHeight() - getTopMarginThickness()
                                     - getBottomMarginThickness();
        
        if (topBorderType != BorderType.NON_EXISTING_BORDER) {
            borderHeight--;
        }
        
        if (bottomBorderType != BorderType.NON_EXISTING_BORDER) {
            borderHeight--;
        }
        
        int y = getTopMarginThickness() + 
                (topBorderType != BorderType.NON_EXISTING_BORDER ? 1 : 0);
        
        int x = getLeftMarginThickness();
        renderHorizontalBorder(matrix, borderHeight, x, y);
    }
    
    private void renderRightBorder(char[][] matrix) {
        if (rightBorderType == BorderType.NON_EXISTING_BORDER) {
            return;
        }
        
        int borderHeight = 
                getPreferredHeight() - getTopMarginThickness()
                                     - getBottomMarginThickness();
        
        if (topBorderType != BorderType.NON_EXISTING_BORDER) {
            borderHeight--;
        }
        
        if (bottomBorderType != BorderType.NON_EXISTING_BORDER) {
            borderHeight--;
        }
        
        int y = getTopMarginThickness() +
                (topBorderType != BorderType.NON_EXISTING_BORDER ? 1 : 0);
        
        int x = getPreferredWidth() - getRightMarginThickness();
        renderHorizontalBorder(matrix, borderHeight, x, y);
    }
    
    /**
     * Renders a horizontal border.
     * @param matrix the target character matrix to which to render.
     * @param borderHeight the height of the border.
     * @param x the {@code x}-coordinate of the border.
     * @param y the {@code y}-coordinate of the highest character of the border.
     */
    private void renderHorizontalBorder(char[][] matrix, 
                                        int borderHeight, 
                                        int x, 
                                        int y) {
        if (leftBorderType == BorderType.SINGLE_BAR_BORDER) {
            for (int w = 0; w < borderHeight; w++) {
                matrix[y + w][x] = CHAR_SINGLE_HORIZONTAL_BAR;
            }
        } else if (leftBorderType == BorderType.DOUBLE_BAR_BORDER) {
            for (int w = 0; w < borderHeight; w++) {
                matrix[y + w][x] = CHAR_DOUBLE_HORIZONTAL_BAR;
            }
        } else {
            throw new IllegalStateException(
                    "Unsupported border type: " + bottomBorderType);
        }
    }
    
    /**
     * Renders a vertical border.
     * @param matrix the target character matrix to which to render.
     * @param borderWidth the width of the border.
     * @param x the {@code x}-coordinate of the border.
     * @param y the {@code y}-coordinate of the leftmost character of the 
     * border.
     */
    private void renderVerticalBorder(char[][] matrix, 
                                      int borderWidth, 
                                      int x, 
                                      int y) {
        if (leftBorderType == BorderType.SINGLE_BAR_BORDER) {
            for (int w = 0; w < borderWidth; w++) {
                matrix[y + w][x] = CHAR_SINGLE_HORIZONTAL_BAR;
            }
        } else if (leftBorderType == BorderType.DOUBLE_BAR_BORDER) {
            for (int w = 0; w < borderWidth; w++) {
                matrix[y + w][x] = CHAR_DOUBLE_HORIZONTAL_BAR;
            }
        } else {
            throw new IllegalStateException(
                    "Unsupported border type: " + bottomBorderType);
        }
    }
    
    /**
     * Renders the actual content. 
     * @return the character matrix view.
     */
    protected abstract char[][] renderContent();
    
    /**
     * Returns the absolute minimum width. The returned value equals the width
     * of the content, plus left margin thickness, plus right margin thickness, 
     * plus left padding thickness, plus right padding thickness, plus two in 
     * case there is a border.
     * 
     * @return the absolute minimum width.
     */
    protected int getAbsoluteMinimumWidth() {
        int bordersWidth = 0;
        bordersWidth += 
                leftBorderType != BorderType.NON_EXISTING_BORDER ? 1 : 0;
        
        bordersWidth += 
                rightBorderType != BorderType.NON_EXISTING_BORDER ? 1 : 0;
        
        return getContentWidth() + 
               bordersWidth + 
               leftMarginThickness + 
               leftPaddingThickness + 
               rightMarginThickness + 
               rightPaddingThickness;
    }
    
    /**
     * Returns the absolute minimum height. The returned value equals the height
     * of the content, plus top margin thickness, plus bottom margin thickness,
     * plus top padding thickness, plus bottom padding thickness, plus two in
     * case there is a border.
     * 
     * @return the absolute minimum height.
     */
    protected int getAbsoluteMinimumHeight() {
        int bordersHeight = 0;
        bordersHeight += 
                topBorderType != BorderType.NON_EXISTING_BORDER ? 1 : 0;
        
        bordersHeight += 
                bottomBorderType != BorderType.NON_EXISTING_BORDER ? 1 : 0;
        
        return getContentHeight() +
               bordersHeight +
               topMarginThickness +
               topPaddingThickness + 
               bottomMarginThickness + 
               bottomPaddingThickness;
    }
    
    /**
     * Returns the width of actual content.
     * 
     * @return content width. 
     */
    protected abstract int getContentWidth();
    
    /**
     * Returns the height of actual content.
     * 
     * @return content height.
     */
    protected abstract int getContentHeight();
}
