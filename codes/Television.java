import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Television {
    String maker;
    int sizeOfScreen;
    Calendar purchaseDate;
    boolean isColorTV;

    Television(String maker, int sizeOfScreen, Calendar purchaseDate, boolean isColorTV) {
        this.maker = maker;
        this.sizeOfScreen = sizeOfScreen;
        this.purchaseDate = purchaseDate;
        this.isColorTV = isColorTV;
    }

    String print() {
        return ("Company: " + this.maker + " Size: " + this.sizeOfScreen + " PurchaseDate: "
                + this.purchaseDate.get(Calendar.DATE) + "/" + this.purchaseDate.get(Calendar.MONTH) + "/"
                + this.purchaseDate.get(Calendar.YEAR));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String maker;
        int sizeOfScreen;
        Calendar date = new GregorianCalendar(2020, 9, 23, 00, 00, 00);
        System.out.println("Maker: ");
        maker = buf.readLine();
        System.out.println("Size Of Screen: ");
        sizeOfScreen = Integer.parseInt(buf.readLine());
        Television obj = new Television(maker, sizeOfScreen, date, true);
        System.out.println("Television: " + obj.print());
    }
}