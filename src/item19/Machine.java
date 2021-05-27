package item19;

public abstract class Machine {

    protected boolean isOn = false;

    /**
     * @implSpec
     * isOn 필드를 true로 반드시 변경한다. 그렇지 않으면 isON()이 false를 반환한다.
     * 이미 true인 경우 예외를 던져야 한다.
     */
    protected void on() throws Exception {
        if(!isOn) {
            System.out.println("Turn ON!");
            isOn = true;
        }

        else throw new RuntimeException("already on");
    }

    protected boolean isOn() {
        return this.isOn;
    }
}
