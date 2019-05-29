package net.coderodde.cui;

/**
 *
 * @author rodde
 */
public abstract class AbstractContainer extends AbstractComponent {

    @Override
    protected abstract char[][] renderContent();

    @Override
    protected abstract int getContentWidth();

    @Override
    protected abstract int getContentHeight();
    
}
