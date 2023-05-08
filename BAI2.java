import java.sql.Date;

class KhoSieuThi{
    private String maHang;
    private String tenHang;
    private int soLuongTon;
    
    public KhoSieuThi(String maHang, String tenHang, int soLuongTon) {
        super();
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
}
class HangThucPham extends KhoSieuThi{
    private String ngaySX;
    private String ngayHH;
    private String NSX;
    public HangThucPham(String maHang, String tenHang, int soLuongTon, String ngaySX, String ngayHH, String nSX) {
       super(maHang, tenHang, soLuongTon);
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
        this.NSX = nSX;
    }
    public String getNgaySX() {
        return ngaySX;
    }
    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }
    public String getNgayHH() {
        return ngayHH;
    }
    public void setNgayHH(String ngayHH) {
        this.ngayHH = ngayHH;
    }
    public String getNSX() {
        return NSX;
    }
    public void setNSX(String nSX) {
        NSX = nSX;
    }

    
}
class HangDienMay extends KhoSieuThi{
    private String ThoigianBH;
    private String congSuat;

    public HangDienMay(String maHang, String tenHang, int soLuongTon, String thoigianBH, String congSuat) {
        super(maHang, tenHang, soLuongTon);
        this.ThoigianBH = thoigianBH;
        this.congSuat = congSuat;
    }

    public String getThoigianBH() {
        return ThoigianBH;
    }

    public void setThoigianBH(String thoigianBH) {
        ThoigianBH = thoigianBH;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }
}

class HangSanhSu extends KhoSieuThi{
    private String NSX;
    private String ngaynhapKho;
    
    public HangSanhSu(String maHang, String tenHang, int soLuongTon, String nSX, String ngaynhapKho) {
        super(maHang, tenHang, soLuongTon);
        this.NSX = nSX;
        this.ngaynhapKho = ngaynhapKho;
    }

    public String getNSX() {
        return NSX;
    }
    public void setNSX(String nSX) {
        NSX = nSX;
    }
    public String getNgaynhapKho() {
        return ngaynhapKho;
    }
    public void setNgaynhapKho(String ngaynhapKho) {
        this.ngaynhapKho = ngaynhapKho;
    }

    
}
public class BAI2{
    public static void main(String[] args) {
        KhoSieuThi kht= new KhoSieuThi();
        HangThucPham tp=new HangThucPham();
        HangDienMay dm=new HangDienMay();
        HangSanhSu ss=new HangSanhSu();
    }
}