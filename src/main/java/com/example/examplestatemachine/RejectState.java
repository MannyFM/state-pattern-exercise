package com.example.examplestatemachine;

public class RejectState extends State {

    RejectState(StateContext sc) {
        this.sc = sc;
    }

    @Override
    public void actionA() {
        if (sc.firstAction == 'A') {
            sc.setState(new AcceptState(sc));
        }
    }

    @Override
    public void actionB() {
        if (sc.firstAction == 'B') {
            sc.setState(new AcceptState(sc));
        }
    }

    @Override
    public boolean isAccept() {
        return false;
    }
}
