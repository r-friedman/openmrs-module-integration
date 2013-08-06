package org.openmrs.module.integration.web.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openmrs.api.context.Context;
import org.openmrs.module.integration.CategoryOption;
import org.openmrs.module.integration.DataElement;
import org.openmrs.module.integration.Option;
import org.openmrs.module.integration.ReportTemplate;
import org.openmrs.module.integration.api.DhisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShowOptionsController {
	@RequestMapping(value = "/module/integration/showOptions", method = RequestMethod.GET)
	public void showDataElementsAndOptions(@RequestParam(required=false, value="reportTemplateId") int reportTemplateId,
			ModelMap model) {
		DhisService dhisService = Context.getService(DhisService.class);
		ReportTemplate reportTemplate=dhisService.getReportTemplateById(reportTemplateId);
		model.addAttribute("reportTemplate",reportTemplate);
	/*	Map<DataElement,List<CategoryOption>> DataElementToCategoryOptionDictionary= dhisService.getDataElementToCategoryOptionDictionaryByReportTemplate(reportTemplate);
		model.addAttribute("DataElementToCategoryOptionDictionary",DataElementToCategoryOptionDictionary);*/
		
		Set<Option> OptionList= dhisService.getOptionToCategoryOptionDictionaryByReportTemplate(reportTemplate);
		model.addAttribute("OptionList",OptionList);
	}

}
