package ch05.magazine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import ch05.magazine.model.MagazineService;

public class ListMagazineController extends AbstractController {
	
	private MagazineService magazineService;
	
	public void setMagazineService(MagazineService magazineService){
		this.magazineService = magazineService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// 1. ��û���� ����
		
		
		// 2. ����Ͻ� ���� ȣ��
		List magazineList = magazineService.getAllMagazine();
				
		// 3. ��� ���� �� �� ����
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("count", magazineList.size());
		model.put("magazineList", magazineList);
		
		// (���̸�, ���̸�, �𵨰�ü)
		ModelAndView mv = new ModelAndView("listMagazine", "model", model);
		
		return mv;
	}

}














