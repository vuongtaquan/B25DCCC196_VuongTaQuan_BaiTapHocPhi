import java.util.*;

class SinhVien {
    String maSV, hoTen, ngaySinh;

    SinhVien(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = chuanHoaTen(hoTen);
        this.ngaySinh = chuanHoaNgay(ngaySinh);
    }

    String chuanHoaTen(String s) {
        String[] a = s.trim().toLowerCase().split("\\s+");
        StringBuilder kq = new StringBuilder();

        for (String x : a) {
            if (!x.isEmpty()) {
                kq.append(x.substring(0, 1).toUpperCase())
                  .append(x.substring(1)).append(" ");
            }
        }
        return kq.toString().trim();
    }

    String chuanHoaNgay(String s) {
        String[] a = s.trim().split("/");
        return String.format("%02d/%02d/%s",
                Integer.parseInt(a[0].trim()),
                Integer.parseInt(a[1].trim()),
                a[2].trim());
    }

    public String toString() {
        return maSV + " " + hoTen + " " + ngaySinh;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) {
            return;
        }
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine();
            String ns = sc.nextLine().trim();

            SinhVien sv = new SinhVien(ma, ten, ns);
            System.out.println(sv);
        }
    }
}
