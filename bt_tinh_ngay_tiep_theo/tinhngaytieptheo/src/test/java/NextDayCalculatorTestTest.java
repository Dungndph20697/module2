import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTestTest {

    @Test
    void nextDayCalculator() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayNhap = LocalDate.parse("22/04/2003", formatter);
        LocalDate ngayHomSau = ngayNhap.plusDays(1);
        System.out.println("Ngay tiep theo la: " + ngayHomSau.format(formatter));

    }
}