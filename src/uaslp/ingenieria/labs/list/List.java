package uaslp.ingenieria.labs.list;

public interface List <G> {
    void add(G data);
    G get(int index) throws Exception;
    void delete(int index) throws Exception;
    int getSize();
    Iterator<G> getIterator();
    Iterator<G> getReverseIterator();
}
