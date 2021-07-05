package behavioral.chainofresponsibility;

public abstract class FireLink {
    protected FireLink next;

    public void setNext(FireLink next) {
        this.next = next;
    }

    public abstract void handle(int flameHeight);
}
