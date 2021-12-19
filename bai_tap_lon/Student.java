
package bai_tap_lon;

public class Student {
    private String MaSinhVien;
    private String HoVaTen;
    private String GioiTinh;
    private String NgaySinh;
    private String CMND;
    private String SoDienThoai;
    private String Email;
    private String QueQuan;
    private String MonHoc;
    private double Diem; 

    public Student() {
    }

    public Student(String MaSinhVien, String HoVaTen, String GioiTinh, String NgaySinh, String CMND, String SoDienThoai, String Email, String QueQuan, String MonHoc, double Diem) {
        this.MaSinhVien = MaSinhVien;
        this.HoVaTen = HoVaTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.CMND = CMND;
        this.SoDienThoai = SoDienThoai;
        this.Email = Email;
        this.QueQuan = QueQuan;
        this.Diem = Diem;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getMonHoc() {
        return MonHoc;
    }

    public void setMonHoc(String MonHoc) {
        this.MonHoc = MonHoc;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }
    
}
