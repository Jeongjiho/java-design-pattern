package designpatterns.chainofresponsibility;

public interface Chain {
    void setNext(Chain nextChain);
    void process(RequestNumber request);
}
