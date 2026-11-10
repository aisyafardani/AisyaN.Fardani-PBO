package Praktikum10.Interface;

public class Document implements Printable {
    public String fileName;
    public String content;

    public String getPrintableContent() {
        return content;
    }
}
