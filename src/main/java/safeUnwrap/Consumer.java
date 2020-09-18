package safeUnwrap;

public class Consumer {

    public String getColor(Model model){
        Wrapper wrapper = new Wrapper(model);

        return wrapper.getWrapped().getColor();
    }
}
