package uaslp.ingenieria.labs.list;

public interface List <G> {
    void add(G data);
    G get(int index);
    void delete(int index);
    int getSize();
    Iterator<G> getIterator();
    Iterator<G> getReverseIterator();
    void insert(G data, Position position, Iterator<G> it);
}
