package ex1;
import java.util.ArrayList;

public class BorrowInfo extends Student {
    int borrowid; int bookid;
    String borrowdate; String returndate;

    public BorrowInfo(String name, int age, String inclass,
                      int borrowid, int bookid, String borrowdate, String returndate) {
        super(name, age, inclass);
        this.borrowid = borrowid;
        this.bookid = bookid;
        this.borrowdate = borrowdate;
        this.returndate = returndate;
    }

    public int getBorrowid() {
        return borrowid;
    }

    public void setBorrowid(int borrowid) {
        this.borrowid = borrowid;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBorrowdate() {
        return borrowdate;
    }

    public void setBorrowdate(String borrowdate) {
        this.borrowdate = borrowdate;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    @Override
    public String toString() {
        return "BorrowInfo{" +
                "borrowid=" + borrowid +
                ", bookid=" + bookid +
                ", borrowdate='" + borrowdate + '\'' +
                ", returndate='" + returndate + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", inclass='" + inclass + '\'' +
                '}';
    }
}
