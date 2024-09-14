package Factory;

import Factory.Button.Button;

public abstract class Platform {
    public Platform(){
        System.out.println("Platform object created");
    }

    public void setRefreshRate(){

    }

    public void setTheme(){

    }

    public abstract UIComponentFactory createUIComponentFactory();
}
