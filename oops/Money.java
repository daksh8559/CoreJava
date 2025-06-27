public class Money {
    private int rs;
    private int paisa; //instance variable

    public void set(int r, int p) {
        rs = r;
        paisa = p;
    }

    public void show() {
        System.out.println(rs+"."+paisa);
    }

}