package com.listeners;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.util.JiraPolicy;
import com.util.JiraServiceProvider;

public class TestJiraListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		//comment
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		//comment
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		JiraPolicy jirapolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = jirapolicy.logTicketReady();
		if(isTicketReady) {
			//raise ticket ready for JIRA
			System.out.println("is Ticket Ready for JIRA "+isTicketReady);
			JiraServiceProvider sp = new JiraServiceProvider("https://jira.igt.com/secure/Dashboard.jspa","pdf57170","Welcome@123456","Einstant Project Integration (EINSTPIN)");
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()+" Failed due to some assertion";
			String issueDescription = result.getThrowable().getMessage()+"\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
			sp.createJiraTicket("Bug", issueSummary, issueDescription, "Ammu, Aditya");		
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//comment
	}
}
