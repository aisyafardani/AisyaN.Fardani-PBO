package Praktikum10.Interface;

public class Webpage implements Printable {
    public String URL;
    public String title;
    public String content;

    public String getPrintableContent() {
        String temp = "URL  : " +URL;
        temp += "Title      : " +title;

        temp = content.replaceAll("<[^>]*>", "");
        return temp;
    }
}
