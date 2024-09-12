package Factory;

public class ClientFactory {
    public static void main(String[] args) {
        Platform p = new Android();
        UIComponentFactory uiComponentFactory = p.createUIComponentFactory();
        uiComponentFactory.createMenu();
        uiComponentFactory.createDropdown();
        uiComponentFactory.createButton();
    }
}
