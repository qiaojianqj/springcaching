package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

//    private final BookRepository bookRepository;
	private final UserRepository userRepository;


	@Autowired
    public AppRunner(UserRepository userRepository) {
 //       this.bookRepository = bookRepository;
		this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
  //      logger.info(".... Fetching books");
  //      logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
  //      logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
  //      logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
  //      logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
  //      logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
  //      logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));

		logger.info("Saving users. Current user count is {}.", userRepository.count());
    	User shubham = new User("Shubham", 2000);
    	User pankaj = new User("Pankaj", 29000);
    	User lewis = new User("Lewis", 550);

    	userRepository.save(shubham);
    	userRepository.save(pankaj);
    	userRepository.save(lewis);
    	logger.info("Done saving users. Data: {}.", userRepository.findAll());
    }

}
