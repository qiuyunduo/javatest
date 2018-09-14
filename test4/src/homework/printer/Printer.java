package homework.printer;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:27 18-5-30
 * @Modified: null
 */
public class Printer {
    private Paper paper;
    private Ink ink;

    public Printer(Paper paper, Ink ink) {
        this.paper = paper;
        this.ink = ink;
    }

    protected void startPrint()
    {
        this.ink.setColor();
        this.paper.setSize();
    }

    public static void main(String[] args) {
        RedInk redInk = new RedInk();
        A3 a3 = new A3();
        Printer printer = new Printer(a3,redInk);
        printer.startPrint();

        BlackInk blackInk = new BlackInk();
        A4 a4 = new A4();
        printer = new Printer(a4,blackInk);
        printer.startPrint();
    }
}
