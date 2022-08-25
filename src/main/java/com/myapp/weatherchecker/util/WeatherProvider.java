package com.myapp.weatherchecker.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * Generates array of 24 elements that represents temperature per hour.
 */
public final class WeatherProvider {
    private static final Logger logger = LoggerFactory.getLogger(WeatherProvider.class.getName());

    private static final int[] TEMPERATURES_PER_HOUR;
    private static final int MIN_TEMPERATURE_VALUE = -10;
    private static final int MAX_TEMPERATURE_VALUE = 10;

    static {
        TEMPERATURES_PER_HOUR = new int[24];
        for (int i = 0; i < TEMPERATURES_PER_HOUR.length; i++) {
            TEMPERATURES_PER_HOUR[i] = (int) ((Math.random() * (MAX_TEMPERATURE_VALUE - MIN_TEMPERATURE_VALUE)) + MIN_TEMPERATURE_VALUE);
        }
        logger.info("Weather forecast for today: {}", TEMPERATURES_PER_HOUR);
    }

    /**
     * Get temperature based on current hour.
     */
    public static int getCurrentTemperature() {
        int currentTemperature = TEMPERATURES_PER_HOUR[LocalDateTime.now().getHour()];
        logger.info("Current temperature: {}", currentTemperature);
        return currentTemperature;
    }
}
