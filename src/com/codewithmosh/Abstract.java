package com.codewithmosh;

public abstract class Abstract{

    private int cod;

    public Abstract(int cod) {
        this.cod = cod;
    }

    public int getCod(int cod) {
        return this.cod;
    }

    public abstract String getName();

}
