package com.global;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogUtility {
	Logger logger=Logger.getLogger(LogUtility.class);

    public void Info(String message)

    {  

    	PropertyConfigurator.configure(".//src//test//resources//Log4j (1) (1).properties");

        logger.info(message);

    }

    public void error(String message)

    { PropertyConfigurator.configure(".//src//test//resources//Log4j (1) (1).properties");

        logger.error(message);

    }

    public void Error(String message)

    {

        PropertyConfigurator.configure(".//src//test//resources//Log4j (1) (1).properties");

        logger.error(message);

    }}
