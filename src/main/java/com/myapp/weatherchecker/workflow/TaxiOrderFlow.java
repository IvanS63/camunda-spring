package com.myapp.weatherchecker.workflow;

import com.myapp.weatherchecker.util.WorkflowLogger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Named("taxiOrderFlow")
public class TaxiOrderFlow implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        WorkflowLogger.info(logger, "TAXI_ORDER", "Sending request for ordering taxi");
        Thread.sleep(1000);
        WorkflowLogger.info(logger, "TAXI_ORDER", "Driver accepted the request");
    }
}
