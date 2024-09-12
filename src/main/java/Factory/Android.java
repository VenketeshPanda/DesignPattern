package Factory;

public class Android extends Platform {
    public Android(){
        System.out.println("Android object created");
    }

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
