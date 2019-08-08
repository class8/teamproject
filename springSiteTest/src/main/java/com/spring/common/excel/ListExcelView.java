package com.spring.common.excel;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import javax.print.Doc;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class ListExcelView extends AbstractXlsView {

	private static Logger log = LoggerFactory.getLogger(ListExcelView.class); // 매개변수는 클래스명과 동일하게
	// 참고 : 브라우저 인식 파일, 확장자를 포함하여 모든 확장자를 포함하여 모든 확장자의 파일들에 대해,
	// 다운로드시 무조건 "파일 다운로드" 대화상자를 보여주도록 헤더 속성이라고 할 수 있다.

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		response.setHeader("Content-Disposition", "attachment;fileName=\"" + model.get("file_name") + "_"
				+ new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".xlsx" + "\"");
		response.setContentType("application/x-msexcel; charset=EUC-KR");

		// 참고 : jxls는 엑섹 파일 포멧의 템플릿을 이용하여 엑셀 파일을 손 쉽게 생성하기 위한 패키지
		// jxml은 템플릿을 기반으로 최종 엑셀 파일을 생성한다

		String docRoot = request.getSession().getServletContext().getRealPath("/WEB-INF/excel/");
		log.info("경로를 체크(docRoot : " + docRoot);

		InputStream is = new BufferedInputStream(new FileInputStream(docRoot + model.get("template")));

		XLSTransformer trans = new XLSTransformer();
		workbook = trans.transformXLS(is, model);
		is.close();

		workbook.write(response.getOutputStream());

	}

}
