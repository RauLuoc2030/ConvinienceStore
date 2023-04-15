package src.DTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVienDTO {
    String maNVString, hoTenNVString, SDTNVString, CCCDNVString, diaChiNVString, chucVuNVString;
    Date ngaySinhNVDate;
    double heSoLuongNVDouble;
    int luongNVInt;

    /**
     * 
     */
    public NhanVienDTO() {
    }

    /**
     * @param maNVString
     * @param hoTenNVString
     * @param sDTNVString
     * @param cCCDNVString
     * @param diaChiNVString
     * @param chucVuNVString
     * @param ngaySinhNVDate
     * @param heSoLuongNVDouble
     * @param luongNVInt
     */
    public NhanVienDTO(String maNVString, String hoTenNVString, String sDTNVString, String cCCDNVString,
            String diaChiNVString, String chucVuNVString, String ngaySinhNVDate, double heSoLuongNVDouble,
            int luongNVInt) {
        this.maNVString = maNVString;
        this.hoTenNVString = hoTenNVString;
        SDTNVString = sDTNVString;
        CCCDNVString = cCCDNVString;
        this.diaChiNVString = diaChiNVString;
        this.chucVuNVString = chucVuNVString;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.ngaySinhNVDate = formatter.parse(ngaySinhNVDate);
        } catch (ParseException e) {
            System.out.println("Cannot convert String to Date");
            e.printStackTrace();
        }
        this.heSoLuongNVDouble = heSoLuongNVDouble;
        this.luongNVInt = luongNVInt;
    }

    @Override
    public String toString() {
        return "NhanVienDTO [maNVString=" + maNVString + ", hoTenNVString=" + hoTenNVString + ", SDTNVString="
                + SDTNVString + ", CCCDNVString=" + CCCDNVString + ", diaChiNVString=" + diaChiNVString
                + ", chucVuNVString=" + chucVuNVString + ", ngaySinhNVDate=" + ngaySinhNVDate + ", heSoLuongNVDouble="
                + heSoLuongNVDouble + ", luongNVInt=" + luongNVInt + "]";
    }

    /**
     * @return the maNVString
     */
    public String getMaNVString() {
        return maNVString;
    }

    /**
     * @param maNVString the maNVString to set
     */
    public void setMaNVString(String maNVString) {
        this.maNVString = maNVString;
    }

    /**
     * @return the hoTenNVString
     */
    public String getHoTenNVString() {
        return hoTenNVString;
    }

    /**
     * @param hoTenNVString the hoTenNVString to set
     */
    public void setHoTenNVString(String hoTenNVString) {
        this.hoTenNVString = hoTenNVString;
    }

    /**
     * @return the sDTNVString
     */
    public String getSDTNVString() {
        return SDTNVString;
    }

    /**
     * @param sDTNVString the sDTNVString to set
     */
    public void setSDTNVString(String sDTNVString) {
        SDTNVString = sDTNVString;
    }

    /**
     * @return the cCCDNVString
     */
    public String getCCCDNVString() {
        return CCCDNVString;
    }

    /**
     * @param cCCDNVString the cCCDNVString to set
     */
    public void setCCCDNVString(String cCCDNVString) {
        CCCDNVString = cCCDNVString;
    }

    /**
     * @return the diaChiNVString
     */
    public String getDiaChiNVString() {
        return diaChiNVString;
    }

    /**
     * @param diaChiNVString the diaChiNVString to set
     */
    public void setDiaChiNVString(String diaChiNVString) {
        this.diaChiNVString = diaChiNVString;
    }

    /**
     * @return the chucVuNVString
     */
    public String getChucVuNVString() {
        return chucVuNVString;
    }

    /**
     * @param chucVuNVString the chucVuNVString to set
     */
    public void setChucVuNVString(String chucVuNVString) {
        this.chucVuNVString = chucVuNVString;
    }

    /**
     * @return the ngaySinhNVDate
     */
    public Date getNgaySinhNVDate() {
        return ngaySinhNVDate;
    }

    /**
     * @param ngaySinhNVDate "dd/MM/yyyy" the ngaySinhNVDate to set
     */
    public void setNgaySinhNVDate(String ngaySinhNVDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.ngaySinhNVDate = formatter.parse(ngaySinhNVDate);
        } catch (ParseException e) {
            System.out.println("Cannot convert String to Date");
            e.printStackTrace();
        }
    }

    public void setNgaySinhNVDate(Date ngaySinhNVDate){
        this.ngaySinhNVDate = ngaySinhNVDate;
    }

    /**
     * @return the heSoLuongNVDouble
     */
    public double getHeSoLuongNVDouble() {
        return heSoLuongNVDouble;
    }

    /**
     * @param heSoLuongNVDouble the heSoLuongNVDouble to set
     */
    public void setHeSoLuongNVDouble(double heSoLuongNVDouble) {
        this.heSoLuongNVDouble = heSoLuongNVDouble;
    }

    /**
     * @return the luongNVInt
     */
    public int getLuongNVInt() {
        return luongNVInt;
    }

    /**
     * @param luongNVInt the luongNVInt to set
     */
    public void setLuongNVInt(int luongNVInt) {
        this.luongNVInt = luongNVInt;
    }
}
