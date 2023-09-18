package designpatterns.chainofresponsibility;

public class NegativeProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(RequestNumber request) {
        if(request.number() < 0) {
            System.out.println("NegativeProcessor : " + request.number());
        }
        else {
            nextInChain.process(request);
        }
    }
}
