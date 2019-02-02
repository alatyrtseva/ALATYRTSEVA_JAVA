package ru.alatyrtseva;

public class Transport {
    protected String identity;

    public Transport(String identity) {
        this.identity = identity;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

}
