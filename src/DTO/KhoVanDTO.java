package DTO;

import java.util.Date;

public class KhoVanDTO {
    SanPhamDTO danhSachSP;
    Date ngayNhapKhoDate, ngayXuatKhoDate;
    /**
     * Tên cửa hàng xuất kho (Tên của cửa hàng nhận sản phẩm)
     */
    String tenCHXuatKhoString;

    /**
     * 
     */
    public KhoVanDTO() {
    }

    /**
     * @param danhSachSP
     * @param ngayNhapKhoDate
     * @param ngayXuatKhoDate
     * @param tenCHXuatKhoString
     */
    public KhoVanDTO(SanPhamDTO danhSachSP, Date ngayNhapKhoDate, Date ngayXuatKhoDate, String tenCHXuatKhoString) {
        this.danhSachSP = danhSachSP;
        this.ngayNhapKhoDate = ngayNhapKhoDate;
        this.ngayXuatKhoDate = ngayXuatKhoDate;
        this.tenCHXuatKhoString = tenCHXuatKhoString;
    }

    /**
     * @return the tenCHXuatKhoString
     */
    public String getTenCHXuatKhoString() {
        return tenCHXuatKhoString;
    }

    /**
     * @param tenCHXuatKhoString the tenCHXuatKhoString to set
     */
    public void setTenCHXuatKhoString(String tenCHXuatKhoString) {
        this.tenCHXuatKhoString = tenCHXuatKhoString;
    }

    /**
     * @return the danhSachSP
     */
    public SanPhamDTO getDanhSachSP() {
        return danhSachSP;
    }

    /**
     * @param danhSachSP the danhSachSP to set
     */
    public void setDanhSachSP(SanPhamDTO danhSachSP) {
        this.danhSachSP = danhSachSP;
    }

    /**
     * @return the ngayNhapKhoDate
     */
    public Date getNgayNhapKhoDate() {
        return ngayNhapKhoDate;
    }

    /**
     * @param ngayNhapKhoDate the ngayNhapKhoDate to set
     */
    public void setNgayNhapKhoDate(Date ngayNhapKhoDate) {
        this.ngayNhapKhoDate = ngayNhapKhoDate;
    }

    /**
     * @return the ngayXuatKhoDate
     */
    public Date getNgayXuatKhoDate() {
        return ngayXuatKhoDate;
    }

    /**
     * @param ngayXuatKhoDate the ngayXuatKhoDate to set
     */
    public void setNgayXuatKhoDate(Date ngayXuatKhoDate) {
        this.ngayXuatKhoDate = ngayXuatKhoDate;
    }

    @Override
    public String toString() {
        return "KhoVanDTO [danhSachSP=" + danhSachSP + ", ngayNhapKhoDate=" + ngayNhapKhoDate + ", ngayXuatKhoDate="
                + ngayXuatKhoDate + ", tenCHXuatKhoString=" + tenCHXuatKhoString + "]";
    }
}
