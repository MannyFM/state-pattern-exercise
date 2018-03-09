package com.example.examplestatemachine;

public class StateContext {
    private State state;
    protected char firstAction = 0;

    StateContext() {
        this.setState(new RejectState(this));
    }

    public void actionA() {
        if (firstAction == 0)
            firstAction = 'A';
        state.actionA();
    }

    public void actionB() {
        if (firstAction == 0)
            firstAction = 'B';
        state.actionB();
    }

    public boolean isAccept() {
        return state.isAccept();
    }

    protected void setState(State st) {
        this.state = st;
    }
}
