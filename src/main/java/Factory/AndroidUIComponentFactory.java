package Factory;

import Factory.Button.AndroidButton;
import Factory.Button.Button;
import Factory.Dropdown.AndroidDropdown;
import Factory.Dropdown.Dropdown;
import Factory.Menu.AndroidMenu;
import Factory.Menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    public AndroidUIComponentFactory(){
        System.out.println("AndroidUIComponentFactory object created");
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
