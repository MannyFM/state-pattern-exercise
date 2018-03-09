package com.example.examplestatemachine;

public class AcceptState extends State {

    protected AcceptState(StateContext sc) {
        this.sc = sc;
    }

    @Override
    public void actionA() {
        if (sc.firstAction != 'A') {
            sc.setState(new RejectState(sc));
        }
    }

    @Override
    public void actionB() {
        if (sc.firstAction != 'B') {
            sc.setState(new RejectState(sc));
        }
    }

    @Override
    public boolean isAccept() {
        return true;
    }
}
