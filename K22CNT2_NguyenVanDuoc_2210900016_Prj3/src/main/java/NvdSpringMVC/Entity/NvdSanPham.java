package NvdSpringMVC.Entity;

import java.sql.Date;

public class NvdSanPham {
	private int NvdMaSP;
	private String NvdTenSP;
	private int NvdSoLuong;
	private Date NvdNgayNhap;
	private String NvdDVT;
	private Float NvdDonGia;
	
	
	/**
	 * @param nvdTenSP
	 * @param nvdSoLuong
	 * @param nvdNgayNhap
	 * @param nvdDVT
	 * @param nvdDonGia
	 */
	public NvdSanPham(String nvdTenSP, int nvdSoLuong, Date nvdNgayNhap, String nvdDVT, Float nvdDonGia) {
		super();
		NvdTenSP = nvdTenSP;
		NvdSoLuong = nvdSoLuong;
		NvdNgayNhap = nvdNgayNhap;
		NvdDVT = nvdDVT;
		NvdDonGia = nvdDonGia;
		
		
	}
	/**
	 * 
	 */
	public NvdSanPham() {
		super();
	}
	/**
	 * @return the nvdMaSP
	 */
	public int getNvdMaSP() {
		return NvdMaSP;
	}
	/**
	 * @param nvdMaSP the nvdMaSP to set
	 */
	public void setNvdMaSP(int nvdMaSP) {
		NvdMaSP = nvdMaSP;
	}
	/**
	 * @return the nvdTenSP
	 */
	public String getNvdTenSP() {
		return NvdTenSP;
	}
	/**
	 * @param nvdTenSP the nvdTenSP to set
	 */
	public void setNvdTenSP(String nvdTenSP) {
		NvdTenSP = nvdTenSP;
	}
	/**
	 * @return the nvdSoLuong
	 */
	public int getNvdSoLuong() {
		return NvdSoLuong;
	}
	/**
	 * @param nvdSoLuong the nvdSoLuong to set
	 */
	public void setNvdSoLuong(int nvdSoLuong) {
		NvdSoLuong = nvdSoLuong;
	}
	/**
	 * @return the nvdNgayNhap
	 */
	public Date getNvdNgayNhap() {
		return NvdNgayNhap;
	}
	/**
	 * @param nvdNgayNhap the nvdNgayNhap to set
	 */
	public void setNvdNgayNhap(Date nvdNgayNhap) {
		NvdNgayNhap = nvdNgayNhap;
	}
	/**
	 * @return the nvdDVT
	 */
	public String getNvdDVT() {
		return NvdDVT;
	}
	/**
	 * @param nvdDVT the nvdDVT to set
	 */
	public void setNvdDVT(String nvdDVT) {
		NvdDVT = nvdDVT;
	}
	/**
	 * @return the nvdDonGia
	 */
	public Float getNvdDonGia() {
		return NvdDonGia;
	}
	/**
	 * @param nvdDonGia the nvdDonGia to set
	 */
	public void setNvdDonGia(Float nvdDonGia) {
		NvdDonGia = nvdDonGia;
	}
	
	
}
