package DTO;

import java.util.Date;

public class SanPhamDTO {
    private String maSPString, tenSPString, phanLoaiString, moTaString, thongTinChiTietString, maLoHangString;
    int giaInt, giaGiamInt, soLuongSPInt;
    Date NSXDate, HSDDate;
    double phanTramGiamDouble;
    /**
     * @param maSPString
     * @param tenSPString
     * @param phanLoaiString
     * @param moTaString
     * @param thongTinChiTietString
     * @param maLoHangString
     * @param giaInt
     * @param giaGiamInt
     * @param soLuongSPInt
     * @param nSXDate
     * @param hSDDate
     * @param phanTramGiamDouble
     */
    public SanPhamDTO(String maSPString, String tenSPString, String phanLoaiString, String moTaString,
            String thongTinChiTietString, String maLoHangString, int giaInt, int giaGiamInt, int soLuongSPInt,
            Date nSXDate, Date hSDDate, double phanTramGiamDouble) {
        this.maSPString = maSPString;
        this.tenSPString = tenSPString;
        this.phanLoaiString = phanLoaiString;
        this.moTaString = moTaString;
        this.thongTinChiTietString = thongTinChiTietString;
        this.maLoHangString = maLoHangString;
        this.giaInt = giaInt;
        this.giaGiamInt = giaGiamInt;
        this.soLuongSPInt = soLuongSPInt;
        NSXDate = nSXDate;
        HSDDate = hSDDate;
        this.phanTramGiamDouble = phanTramGiamDouble;
    }
    /**
     * 
     */
    public SanPhamDTO() {
    }
    /**
     * @return the soLuongSPInt
     */
    public int getSoLuongSPInt() {
        return soLuongSPInt;
    }
    /**
     * @param soLuongSPInt the soLuongSPInt to set
     */
    public void setSoLuongSPInt(int soLuongSPInt) {
        this.soLuongSPInt = soLuongSPInt;
    }
    /**
     * @return the maSPString
     */
    public String getMaSPString() {
        return maSPString;
    }
    /**
     * @param maSPString the maSPString to set
     */
    public void setMaSPString(String maSPString) {
        this.maSPString = maSPString;
    }
    /**
     * @return the tenSPString
     */
    public String getTenSPString() {
        return tenSPString;
    }
    /**
     * @param tenSPString the tenSPString to set
     */
    public void setTenSPString(String tenSPString) {
        this.tenSPString = tenSPString;
    }
    /**
     * @return the phanLoaiString
     */
    public String getPhanLoaiString() {
        return phanLoaiString;
    }
    /**
     * @param phanLoaiString the phanLoaiString to set
     */
    public void setPhanLoaiString(String phanLoaiString) {
        this.phanLoaiString = phanLoaiString;
    }
    /**
     * @return the moTaString
     */
    public String getMoTaString() {
        return moTaString;
    }
    /**
     * @param moTaString the moTaString to set
     */
    public void setMoTaString(String moTaString) {
        this.moTaString = moTaString;
    }
    /**
     * @return the thongTinChiTietString
     */
    public String getThongTinChiTietString() {
        return thongTinChiTietString;
    }
    /**
     * @param thongTinChiTietString the thongTinChiTietString to set
     */
    public void setThongTinChiTietString(String thongTinChiTietString) {
        this.thongTinChiTietString = thongTinChiTietString;
    }
    /**
     * @return the maLoHangString
     */
    public String getMaLoHangString() {
        return maLoHangString;
    }
    /**
     * @param maLoHangString the maLoHangString to set
     */
    public void setMaLoHangString(String maLoHangString) {
        this.maLoHangString = maLoHangString;
    }
    /**
     * @return the giaInt
     */
    public int getGiaInt() {
        return giaInt;
    }
    /**
     * @param giaInt the giaInt to set
     */
    public void setGiaInt(int giaInt) {
        this.giaInt = giaInt;
    }
    /**
     * @return the giaGiamInt
     */
    public int getGiaGiamInt() {
        return giaGiamInt;
    }
    /**
     * @param giaGiamInt the giaGiamInt to set
     */
    public void setGiaGiamInt(int giaGiamInt) {
        this.giaGiamInt = giaGiamInt;
    }
    /**
     * @return the nSXDate
     */
    public Date getNSXDate() {
        return NSXDate;
    }
    /**
     * @param nSXDate the nSXDate to set
     */
    public void setNSXDate(Date nSXDate) {
        NSXDate = nSXDate;
    }
    /**
     * @return the hSDDate
     */
    public Date getHSDDate() {
        return HSDDate;
    }
    /**
     * @param hSDDate the hSDDate to set
     */
    public void setHSDDate(Date hSDDate) {
        HSDDate = hSDDate;
    }
    /**
     * @return the phanTramGiamDouble
     */
    public double getPhanTramGiamDouble() {
        return phanTramGiamDouble;
    }
    /**
     * @param phanTramGiamDouble the phanTramGiamDouble to set
     */
    public void setPhanTramGiamDouble(double phanTramGiamDouble) {
        this.phanTramGiamDouble = phanTramGiamDouble;
    }
    @Override
    public String toString() {
        return "SanPhamDTO [maSPString=" + maSPString + ", tenSPString=" + tenSPString + ", phanLoaiString="
                + phanLoaiString + ", moTaString=" + moTaString + ", thongTinChiTietString=" + thongTinChiTietString
                + ", maLoHangString=" + maLoHangString + ", giaInt=" + giaInt + ", giaGiamInt=" + giaGiamInt
                + ", soLuongSPInt=" + soLuongSPInt + ", NSXDate=" + NSXDate + ", HSDDate=" + HSDDate
                + ", phanTramGiamDouble=" + phanTramGiamDouble + "]";
    }

}
