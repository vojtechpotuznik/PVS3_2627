package vyuka.oop.adts;

public interface MyStack {

    void push(String item);
    // TODO: Chtělo by nějak mít možnost vracet různé datové typy
    String pop();
    String peek();
    boolean isEmpty();

}
