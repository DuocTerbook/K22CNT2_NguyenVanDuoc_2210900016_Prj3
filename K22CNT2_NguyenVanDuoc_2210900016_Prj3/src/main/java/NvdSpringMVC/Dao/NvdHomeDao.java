package NvdSpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import NvdSpringMVC.Entity.MapperNvdSanPham;
import NvdSpringMVC.Entity.NvdSanPham;

@Repository
public class NvdHomeDao {
	@Autowired
	JdbcTemplate template;
	public List<NvdSanPham> GetDataNvdSanPham(){
		List<NvdSanPham> list = new ArrayList<NvdSanPham>();
		String sql = "select * from NvdSanPham";
		list = template.query(sql, new MapperNvdSanPham());
		return list;
	}
}
