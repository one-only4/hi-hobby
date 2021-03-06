package com.hi_hobby.inquiry;

import java.io.IOException;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import com.hi_hobby.action.Action;
import com.hi_hobby.action.ActionInfo;
import com.hi_hobby.domain.dao.InquiryDAO;
import com.hi_hobby.domain.vo.InquiryVO;
import com.sun.security.jgss.InquireType;

public class InquiryGoEdit implements Action{
	@Override
	public ActionInfo execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.setCharacterEncoding("UTF-8");
		
		int page = Integer.parseInt(req.getParameter("page"));
		int inquiryNum = Integer.parseInt(req.getParameter("inquiryNum"));
		ActionInfo actionInfo = new ActionInfo();
		
		InquiryDAO inquiryDAO = new InquiryDAO();
		
		// 회원의 번호로 게시글의 정보 뿐만 아니라 회원의 아이디까지 가져와주는 쿼리 실행
		req.setAttribute("inquiry", inquiryDAO.inquiryMyView(inquiryNum));
		req.setAttribute("page", page);
		
		actionInfo.setRedirect(false);
		actionInfo.setPath("/csEdit.jsp");
		
		return actionInfo;
	}
	

}