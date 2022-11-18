package DAO;

public class IteratorFunc implements Iteratorr {

    private Addfunc a;
    private int current;

    IteratorFunc(Addfunc a) {
        this.a = a;
        current = 0;
    }

    @Override
    public Object currentItem() {
        Object obj = null;
        if( this.current < this.a.aDatos.size() )
        {
            obj = this.a.aDatos.elementAt( this.current );
        }
        return obj;
    }

    @Override
    public Object first() {
        Object obj = null;
        if (this.a.aDatos.isEmpty() == false) {
            this.current = 0;
            obj = this.a.aDatos.firstElement();
        }
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if ((this.current) < this.a.aDatos.size()) {
            obj = this.a.aDatos.elementAt(this.current);
            this.current++;
        }
        return obj;
    }

    @Override
    public boolean isDone() {

        boolean ret = false;
        if( this.current < (this.a.aDatos.size() ) )
        {
            ret = true;
        }
        return ret;
    }

}
