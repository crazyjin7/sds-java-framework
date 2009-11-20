package ch05.magazine.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import ch05.magazine.model.Magazine;
import ch05.magazine.model.MagazineService;

public class ConfirmMagazineController extends SimpleFormController {

	private MagazineService magazineService;
	
	public void setMagazineService(MagazineService magazineService){
		this.magazineService = magazineService;
	}
	
	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		// 1. 파라미터 추출
		Magazine magazine = (Magazine)command;
		
		// 2. 비즈니스 로직 호출		
		magazineService.insertMagazine(magazine);

		// 3. ModelAndView 반환
		return new ModelAndView(getSuccessView());		
	}

	@Override
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
	}
	
	
	
	

}













