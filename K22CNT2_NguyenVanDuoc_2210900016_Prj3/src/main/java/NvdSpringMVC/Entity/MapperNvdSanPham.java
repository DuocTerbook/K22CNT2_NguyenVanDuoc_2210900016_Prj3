package NvdSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperNvdSanPham implements RowMapper<NvdSanPham>{

	@Override
	public NvdSanPham mapRow(ResultSet rs, int rowNum) throws SQLException {
		NvdSanPham sp = new NvdSanPham();
		sp.setNvdMaSP(rs.getInt("1"));
		sp.setNvdTenSP(rs.getString("2"));
		sp.setNvdSoLuong(rs.getInt("3"));
		sp.setNvdNgayNhap(rs.getDate("4"));
		sp.setNvdDVT(rs.getString("5"));
		sp.setNvdDonGia(rs.getFloat("6"));
		return sp;
	}

}
