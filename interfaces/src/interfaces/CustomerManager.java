package interfaces;
//2 type of bound loosly and tightly coupled
public class CustomerManager {
	private Logger [] loggers;
		public CustomerManager(Logger [] loggers) {
		
		this.loggers = loggers;
	}
		public void add(Customer customer) {
		
		System.out.println("Müşteri Eklendi  : " + customer.getFirstName());
	
		
		// dependency injection
		//this.loggers.log(customer.getFirstName());
//		for(Logger logger : loggers) {
//			logger.log(customer.getFirstName());
//			//static olmazsa aşağıdaki gibi yazılır.
		//Utils utils = new Utils();
		//utils.runLoggers(loggers,customer.getFirstName()); 
	Utils.runLoggers(loggers,customer.getFirstName());
		}
public void delete(Customer customer) {
	System.out.println("Müşteri Silindi");
	for(Logger logger : loggers) {
		logger.log(customer.getFirstName());
		
	}
	}
}
