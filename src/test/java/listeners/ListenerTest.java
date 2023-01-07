package listeners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListenerTest implements ITestListener {
    public void onStart(ITestContext arg)
    {
        System.out.println("Starts Test Execution ........"+arg.getName());
    }
    public void onFinish(ITestContext arg)
    {
        System.out.println("Finish Test Execution ........"+arg.getName());
    }
    public void onTestStart(ITestResult arg0)
    {
        System.out.println("Test Starts .................."+arg0.getName());
    }
    public void onTestSkipped(ITestResult arg0)
    {
        System.out.println("Skipped Test .................."+arg0.getName());
    }
}
