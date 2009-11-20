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

		// 1. 요청정보 추출
		
		
		// 2. 비즈니스 로직 호출
		List magazineList = magazineService.getAllMagazine();
				
		// 3. 결과 세팅 및 뷰 지정
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("count", magazineList.size());
		model.put("magazineList", magazineList);
		
		// (뷰이름, 모델이름, 모델객체)
		ModelAndView mv = new ModelAndView("listMagazine", "model", model);
		
		return mv;
	}

}














