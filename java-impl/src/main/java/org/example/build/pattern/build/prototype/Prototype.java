package org.example.build.pattern.build.prototype;

public class Prototype {

    private Integer field1;

    private String field2;

    private Float field3;

    public Prototype(Integer field1, String field2, Float field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public Prototype clone() {
        return new Prototype(this.field1, this.field2, this.field3);
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                ", field3=" + field3 +
                '}';
    }
}
