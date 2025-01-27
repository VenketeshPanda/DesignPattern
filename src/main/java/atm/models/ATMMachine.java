package atm.models;

import atm.state.IdleState;
import atm.state.State;

public class ATMMachine {
    int totalBalance;
    int noOf2000s;
    int noOf500s;
    int noOf100s;
    State state;

    public ATMMachine(int totalBalance,int noOf2000s,int noOf500s, int noOf100s){
        this.totalBalance=totalBalance;
        this.noOf2000s=noOf2000s;
        this.noOf500s=noOf500s;
        this.noOf100s=noOf100s;
        this.state = new IdleState();
    }

    public void withdrawAmount(int amount){
        this.totalBalance-=totalBalance;
    }

    public void reduceNoOf2000s(int count){
        this.noOf2000s-=count;
    }

    public void reduceNoOf500s(int count){
        this.noOf500s-=count;
    }

    public void reduceNoOf100s(int count){
        this.noOf100s-=count;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }

    public int getNoOf2000s() {
        return noOf2000s;
    }

    public void setNoOf2000s(int noOf2000s) {
        this.noOf2000s = noOf2000s;
    }

    public int getNoOf500s() {
        return noOf500s;
    }

    public void setNoOf500s(int noOf500s) {
        this.noOf500s = noOf500s;
    }

    public int getNoOf100s() {
        return noOf100s;
    }

    public void setNoOf100s(int noOf100s) {
        this.noOf100s = noOf100s;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
