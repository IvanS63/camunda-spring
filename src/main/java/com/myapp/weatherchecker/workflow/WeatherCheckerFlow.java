package com.myapp.weatherchecker.workflow;

import com.myapp.weatherchecker.util.WorkflowLogger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeatherCheckerFlow implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        WorkflowLogger.info(logger, "WEATHER_CHECK", "Check weather outside");
    }
}
