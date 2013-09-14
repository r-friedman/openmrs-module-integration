package org.openmrs.module.integration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.openmrs.User;
import org.openmrs.api.context.Context;
import org.openmrs.module.reporting.cohort.definition.BaseCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.StaticCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.service.CohortDefinitionService;
import org.openmrs.module.reporting.cohort.definition.EncounterCohortDefinition;
import org.openmrs.module.reporting.common.TimeQualifier;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.Location;

/**
 * The service location cohort definition is a singleton encounter cohort definition with a
 * parameterized list of locations called and startDate and endDate
 * It is used by the DHIS2 Integration module as its primary selector
 * The cohort definition is called INSTANCE_NAME
 */
public class ServiceLocationCohortDefinition extends EncounterCohortDefinition {

	private static String MODULE_NAME = "Integration";
	private static String INSTANCE_NAME = "Patients Served at Location during Time Period";
	private static String INSTANCE_DESC = "For use by " + MODULE_NAME;
	private static String LOC_PARAM_NAME = "Location List";
	private static String LOC_PARAM_LABEL = "location";
	private static String START_PARAM_NAME = "Start Date";
	private static String START_PARAM_LABEL = "startDate";
	private static String END_PARAM_NAME = "End Date";
	private static String END_PARAM_LABEL = "endDate";
	
	public ServiceLocationCohortDefinition() {
		super();
		super.setName(INSTANCE_NAME);
		super.setDescription(INSTANCE_DESC);
		Parameter p = new Parameter();
		p.setName(LOC_PARAM_NAME);
		p.setLabel(LOC_PARAM_LABEL);
		p.setCollectionType(java.util.List.class);
		p.setType(org.openmrs.Location.class);
		List<Parameter> pp=new ArrayList<Parameter>();
		pp.add(p);
		super.setParameters(pp);
		super.setTimeQualifier(TimeQualifier.ANY);
		super.setReturnInverse(false);
	}

}
