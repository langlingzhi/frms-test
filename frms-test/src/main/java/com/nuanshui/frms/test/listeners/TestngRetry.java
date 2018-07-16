package com.nuanshui.frms.test.listeners;


import com.nuanshui.frms.test.exception.ErrorRespStatusException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;
import sun.rmi.runtime.Log;

public class TestngRetry implements IRetryAnalyzer {

    private static int retryCount = 1;
    private static int maxRetryCount = 2;

    private static final Logger log = LoggerFactory.getLogger(TestngRetry.class);

    @Override
    public boolean retry(ITestResult result) {
        if (result.getThrowable() instanceof ErrorRespStatusException && retryCount % maxRetryCount != 0) {
            Reporter.setCurrentTestResult(result);
            log.info("retryCount"+(retryCount+1));
            retryCount++;
            return true;

        } else {
            TestngRetry.resetRetryCount();
            return false;
        }

    }

    public static void resetRetryCount() {
        retryCount = 1;
    }


}

