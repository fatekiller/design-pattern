package org.example.build.pattern.struct.adaptor;

public class MultiAdaptor implements Target{

    private Adder adder;

    public MultiAdaptor(Adder adder) {
        this.adder = adder;
    }

    @Override
    public int multi(int a, int b) {
        int rst = 0;
        for (int i = 0; i < b; i++) {
            rst = adder.add(rst, a);
        }
        return rst;
    }
}
