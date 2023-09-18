package designpatterns.chainofresponsibility;

public class ZeroProcessor implements Chain {
    private Chain nextChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void process(RequestNumber request) {
        if(request.number() == 0) {
            System.out.println("ZeroProcessor : " + request.number());
        }
        else {
            nextChain.process(request);
        }
    }
}
