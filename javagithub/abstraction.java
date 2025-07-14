package javaprograms;
abstract class Geeks {
    abstract void turnOn();
    abstract void turnOff();
}


class TVRemote extends Geeks {
    void turnOn() {
        System.out.println("TV is turned ON.");
    }
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
public class abstraction {

    public static void main(String[] args) {
    	Geeks remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }
}

