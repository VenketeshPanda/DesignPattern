package Factory;

import Factory.Button.Button;
import Factory.Button.IOSButton;
import Factory.Dropdown.Dropdown;
import Factory.Dropdown.IOSDropdown;
import Factory.Menu.AndroidMenu;
import Factory.Menu.IOSMenu;
import Factory.Menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory {
    public IOSUIComponentFactory(){
        System.out.println("IOSUIComponentFactory object created");
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
