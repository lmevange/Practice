public class stack {

    Llist lstack =  new Llist();

    public node pop(){

        node tbegin = lstack.begin;

        lstack.begin = lstack.begin.m;

        return tbegin;


    }


    public node peek(){

        return lstack.begin;

    }

    public void push(int x){

        lstack.insertll(x);

    }
}

