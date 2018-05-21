public class main {

    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 5, 8, 13};

        //        stack s = new stack();
        //
        //        for(int i = 0; i < ar.length; i++) {
        //            s.push(ar[i]);
        //        }
        //
        //        while(s.peek().m != null){
        //           System.out.println(s.pop().n);
        //        }


        Llist LL = new Llist();


        for (int i = 0; i < ar.length; i++) {

            LL.insertll(ar[i]);


        }

        node temp = LL.begin;

        for (int i = 0; i < 4; i++) {
            temp = temp.m;
        }

        LL.del(temp);
        LL.printll();
        LL.del(temp);
        LL.printll();

    }

}

