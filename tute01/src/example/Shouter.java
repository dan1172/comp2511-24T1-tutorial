package example;

public class Shouter {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Shouter(String msg) {
        this.msg = msg;
    }


    public void shout() {
        System.out.println(msg.toUpperCase());
    }
    public static void main(String[] args) {
        Shouter jam = new Shouter("hi");
        jam.shout();
    }
}
