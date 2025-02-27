package NvdSpringMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import NvdSpringMVC.Dao.NvdHomeDao;

@Controller
public class NvdHomeController {
	@Autowired
	NvdHomeDao nvdHomeDao;

	@RequestMapping(value = { "/", "/trang-chu" })
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("sp",nvdHomeDao.GetDataNvdSanPham());
		return mv;
	}

	@RequestMapping(value = "/product")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
}
