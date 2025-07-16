import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifiereTest {

    @Test
    void phanBietTamGiac() {
        float canhA = 2;
        float canhB = 2;
        float canhC = 2;

        if (canhA + canhB > canhC && canhA + canhC > canhB && canhB + canhC > canhA) {
            if (canhA == canhB && canhB == canhC) {
                System.out.println("day la tam giac deu");
            } else if (canhA == canhB || canhB == canhC || canhA == canhC) {
                System.out.println("day la tam giac can");
            } else {
                System.out.println("day la tam giac thuong");
            }
        } else {
            System.out.println("day khong phai tam giac");
        }
    }
}