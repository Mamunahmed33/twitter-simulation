package edu.univdhaka.iit.twitter.repository;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

import edu.univdhaka.iit.twitter.domain.Tweet;
import edu.univdhaka.iit.twitter.domain.User;

public class TweetDaoImplTest {
	private static final String FIRST_NAME = "Bazlur";
	private static final String LAST_NAME = "Rahman";
	private static final String EMAIL_ADDRESS = "anm_brr@yahoo.com";
	private static final String PASSWORD = "HXJD^%DAS";

	private String TWEET = "I posted a discussion, end of the stupid content tracker git\" can mean anything";

	private User user;
	private Tweet tweet;
	private TweetDao tweetDao;

	@Before
	public void setUp() throws Exception {
		System.out.println("TweetServiceImplTest setup");

		user = new User();

		user.setFirstName(FIRST_NAME);
		user.setLastName(LAST_NAME);
		user.setEmailAddress(EMAIL_ADDRESS);
		user.setPassword(PASSWORD);

		tweet = new Tweet();
		tweet.setTweetText(TWEET);
		tweet.setTimestamp(new Date(new java.util.Date().getTime()));
		tweet.setTweetBy(user);

		tweetDao = new TweetDaoImpl();
	}

	@Test
	public void createTest() {
		tweetDao.create(tweet);
	}

}
