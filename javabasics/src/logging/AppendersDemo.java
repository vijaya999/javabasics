package logging;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class AppendersDemo {
	static Logger appLog;
	public static void main(String[] args) {
		
		
		appLog = LogManager.getLogger(AppendersDemo.class);
		PatternLayout p = new PatternLayout();
		p.setConversionPattern("%d{dd.MM.YY hh:mm:ss};%10p;%c{1} %m%n");
//		BasicConfigurator.configure();
		ConsoleAppender cApp = new ConsoleAppender(p);
		appLog.addAppender(cApp);
		appLog.info("pattern layout demo");
		
		
		
	}
}
