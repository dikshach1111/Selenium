package beta;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = LogManager.getLogger(Test.class.getName());
			
				log.debug("Testing");
				if(5>4)
					log.info("present");
				log.error("test error");
				
				log.fatal("test fatal");
			}

		}