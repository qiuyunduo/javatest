package genericity;

/**
 * @Author qyd
 * @Date 19-5-31 上午11:41
 **/
public class TestDemo<E, T, F> {
    private E params1;

    private T params2;

    private F params3;

    public E getParams1() {
        return params1;
    }

    public void setParams1(E params1) {
        this.params1 = params1;
    }

    public T getParams2() {
        return params2;
    }

    public void setParams2(T params2) {
        this.params2 = params2;
    }

    public F getParams3() {
        return params3;
    }

    public void setParams3(F params3) {
        this.params3 = params3;
    }

    @Override
    public String toString() {
        return "TestDemo{" +
                "params1=" + params1 +
                ", params2=" + params2 +
                ", params3=" + params3 +
                '}';
    }
}
