package designpatterns.chainofresponsibility;

public class PositiveProcessor implements Chain {
    private Chain nextChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void process(RequestNumber request) {
        if(request.number() > 0) {
            System.out.println("PositiveProcessor : " + request.number());
        }
        else {
            nextChain.process(request);
        }
    }
}
