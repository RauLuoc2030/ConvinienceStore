package src.DTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HoaDonDTO {
    String maHDString;
    Date ngayMuaHangHDDate;
    String tenNVBanHangHDString, tenKhachHangHDString, hinhThucThanhToanHDString;

    /**
     * 
     */
    public HoaDonDTO() {
    }

    /**
     * @param maHDString
     * @param ngayMuaHangHDDate
     * @param tenNVBanHangHDString
     * @param tenKhachHangHDString
     * @param hinhThucThanhToanHDString
     */
    public HoaDonDTO(String maHDString, String ngayMuaHangHDDate, String tenNVBanHangHDString,
            String tenKhachHangHDString, String hinhThucThanhToanHDString) {
        this.maHDString = maHDString;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.ngayMuaHangHDDate = formatter.parse(ngayMuaHangHDDate);
        } catch (ParseException e) {
            System.out.println("Cannot convert String to Date");
            e.printStackTrace();
        }
        this.tenNVBanHangHDString = tenNVBanHangHDString;
        this.tenKhachHangHDString = tenKhachHangHDString;
        this.hinhThucThanhToanHDString = hinhThucThanhToanHDString;
    }

    /**
     * @return the maHDString
     */
    public String getMaHDString() {
        return maHDString;
    }

    /**
     * @param maHDString the maHDString to set
     */
    public void setMaHDString(String maHDString) {
        this.maHDString = maHDString;
    }

    /**
     * @return the ngayMuaHangHDDate
     */
    public Date getNgayMuaHangHDDate() {
        return ngayMuaHangHDDate;
    }

    /**
     * @param ngayMuaHangHDDate the ngayMuaHangHDDate to set
     */
    public void setNgayMuaHangHDDate(String ngayMuaHangHDDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.ngayMuaHangHDDate = formatter.parse(ngayMuaHangHDDate);
        } catch (ParseException e) {
            System.out.println("Cannot convert String to Date");
            e.printStackTrace();
        }
    }

    /**
     * @return the tenNVBanHangHDString
     */
    public String getTenNVBanHangHDString() {
        return tenNVBanHangHDString;
    }

    /**
     * @param tenNVBanHangHDString the tenNVBanHangHDString to set
     */
    public void setTenNVBanHangHDString(String tenNVBanHangHDString) {
        this.tenNVBanHangHDString = tenNVBanHangHDString;
    }

    /**
     * @return the tenKhachHangHDString
     */
    public String getTenKhachHangHDString() {
        return tenKhachHangHDString;
    }

    /**
     * @param tenKhachHangHDString the tenKhachHangHDString to set
     */
    public void setTenKhachHangHDString(String tenKhachHangHDString) {
        this.tenKhachHangHDString = tenKhachHangHDString;
    }

    /**
     * @return the hinhThucThanhToanHDString
     */
    public String getHinhThucThanhToanHDString() {
        return hinhThucThanhToanHDString;
    }

    /**
     * @param hinhThucThanhToanHDString the hinhThucThanhToanHDString to set
     */
    public void setHinhThucThanhToanHDString(String hinhThucThanhToanHDString) {
        this.hinhThucThanhToanHDString = hinhThucThanhToanHDString;
    }

    @Override
    public String toString() {
        return "HoaDonDTO [maHDString=" + maHDString + ", ngayMuaHangHDDate=" + ngayMuaHangHDDate
                + ", tenNVBanHangHDString=" + tenNVBanHangHDString + ", tenKhachHangHDString=" + tenKhachHangHDString
                + ", hinhThucThanhToanHDString=" + hinhThucThanhToanHDString + "]";
    }

    /**
     * @param ngayMuaHangHDDate the ngayMuaHangHDDate to set
     */
    public void setNgayMuaHangHDDate(Date ngayMuaHangHDDate) {
        this.ngayMuaHangHDDate = ngayMuaHangHDDate;
    }

}
