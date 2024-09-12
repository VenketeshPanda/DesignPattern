package Factory;

public class IOS extends Platform {
    public IOS(){
        System.out.println("IOS object created");
    }

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
