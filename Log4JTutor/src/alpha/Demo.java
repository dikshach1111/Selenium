package alpha;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = LogManager.getLogger(Demo.class.getName());
			
				log.debug("Debugging...");
				if(5>4)
					log.info("object is presentttt");
				log.error("object is present");
				
				log.fatal("this is fatal");
			}

		}