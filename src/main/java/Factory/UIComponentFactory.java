package Factory;

import Factory.Button.Button;
import Factory.Dropdown.Dropdown;
import Factory.Menu.AndroidMenu;
import Factory.Menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
