public class Llist {


    node begin = new node(0, null);

    public void insertll(int x) {

        node ins = new node(x, begin);
        begin = ins;

    }

    public void printll() {
        node printb = begin;


        while (printb.m != null) {


            System.out.println(printb.n);
            printb = printb.m;

        }

    }

    public void del(node x) {


        node r = begin;
        boolean inList = true;

        if(r == x){
            begin = r.m;

        }

        else {
            while (r.m != x) {

                if (r.n == 0 && r.m == null){
                    inList = false;
                    System.out.println("number not in list");
                    break;

                }


                r = r.m;



            }
// if item is not in list dont do this
            if(inList) {
                r.m = x.m;
            }
        }


    }


}















//
//        node next = new node(0, null);
//        node now = new node(0, null);
//        node start  = new node(ar[0], next);
//
//
//        for(int i =0; i < ar.length-1; i++) {
//
//            next =  new node(ar[i+1], null);
//            now.m = next;
//            now = next;
//            if (i == 0){
//                start.m = now;
//            }
//
//
//
//        }
//        for(int j = 0; j<ar.length; j++){
//
//            System.out.println(start.n);
//            start = start.m;

