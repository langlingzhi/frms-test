package com.nuanshui.frms.test.listeners;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;//一个简单的ITestListener适配器，用于存储所有运行的测试

public class AutoTestListener extends TestListenerAdapter {

    @Override
    //每次测试成功时调用
    public void onTestSuccess(ITestResult tr) {
        TestngRetry.resetRetryCount();
      super.onTestSuccess(tr);

    }

}
