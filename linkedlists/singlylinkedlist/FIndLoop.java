package dsa.linkedlists.singlylinkedlist;

public class FIndLoop {

    boolean detectLoop(LinkedList.Node h){
        int flag = 0;
        while (h!=null){
            if (flag==1)
                return true;
            flag=1;
            h=h.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList lwl= new LinkedList();
        lwl.add(5);
        lwl.add(6);
        lwl.add(3);
        lwl.add(1);
//      creating a loop in LinkedList to test
//      lwl.head.next.next.next= lwl.head;
//        lwl.createLoop();
        FIndLoop fl= new FIndLoop();
        System.out.println(fl.detectLoop(lwl.head));
    }
}
