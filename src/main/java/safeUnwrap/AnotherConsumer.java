package safeUnwrap;

public class AnotherConsumer {

    public int getAmount(Model model){
        Wrapper wrapper = new Wrapper(model);

        return wrapper.getWrapped().getAmount();
    }
}
