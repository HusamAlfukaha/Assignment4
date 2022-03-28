package Assignment4;


@FunctionalInterface
public interface ComposBoth<T,U> {

    public U apply(T t);
    /** d -> t -> u */
    default <D> ComposBoth <D,U> compos(ComposBoth <D,T> g){
        return x -> apply(g.apply(x));
    }
}