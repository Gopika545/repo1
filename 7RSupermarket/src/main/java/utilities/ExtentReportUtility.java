package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
	ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
	reporter.config().setReportName("7RMartSupermarket");
	extentReports.attachReporter(reporter);
	extentReports.setSystemInfo("Organization", "Obsqura");
	extentReports.setSystemInfo("Name", " Gopika "); 
	return extentReports;
	}


}
