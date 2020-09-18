package safeUnwrap;

public class Wrapper {
    private Model Wrapped;

    public Wrapper(Model wrapped) {
        Wrapped = wrapped;
    }

    public Model getWrapped() {
        return Wrapped;
    }
}
