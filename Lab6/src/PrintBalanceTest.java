import static org.junit.Assert.*;

import java.text.DateFormat;

import org.junit.Test;



public class PrintBalanceTest {

	@Test
	public void testJUnit()
	{
		assertTrue("Hope this does not Minge.", true);
	}
	
	@Test
	public void testLanguage()
	{
		PrintBalance.setLanguage("en");
		assertNotNull(PrintBalance.getLanguage());
	}
	
	@Test
	public void testCountry()
	{
		PrintBalance.setCountry("US");
		assertNotNull(PrintBalance.getCountry());
	}
	
	@Test
	public void testLocale()
	{
		PrintBalance.setLocale("en", "US");
		assertNotNull(PrintBalance.getCurrentLocale());
	}
	
	@Test
	public void testMessages()
	{
		PrintBalance.setLocale("en", "US");
		PrintBalance.setMessages(PrintBalance.getCurrentLocale());
		assertNotNull(PrintBalance.getMessages());
	}
	
	@Test
	public void testDateFormat()
	{
		PrintBalance.setLocale("en", "US");
		PrintBalance.setDateFormat(DateFormat.FULL, DateFormat.FULL, PrintBalance.getCurrentLocale());
		assertNotNull(PrintBalance.getDateFormat());
	}
	
	@Test
	public void testDate()
	{
		PrintBalance.setDateCurrent();
		assertNotNull(PrintBalance.getDate());
	}
	
	@Test
	public void testCountryCurrency()
	{
		PrintBalance.setLocale("en", "US");
		PrintBalance.setCountryCurrency(PrintBalance.getCurrentLocale());
		assertNotNull(PrintBalance.getCountryCurrency());
	}
	/*
	 * English in US testing
	 */
	private void setupPrintBalanceEnUs()
	{
		PrintBalance.setLocale("en", "US");
		PrintBalance.setMessages(PrintBalance.getCurrentLocale());
	}
	
	@Test
	public void testHelloWorldEnglishUS()
	{
		setupPrintBalanceEnUs();
		assertEquals(PrintBalance.getMessages().getString("helloWorld"), "Hello World");
	}

	@Test
	public void testEnterNameEnglishUS()
	{
		setupPrintBalanceEnUs();
		assertEquals(PrintBalance.getMessages().getString("enterName"), "Please enter your name");
	}
	
	@Test
	public void testPleasedToEnglishUS()
	{
		setupPrintBalanceEnUs();
		assertEquals(PrintBalance.getMessages().getString("pleasedTo"), "I am pleased to meet you");
	}
	
	@Test
	public void testAsOfEnglishUS()
	{
		setupPrintBalanceEnUs();
		assertEquals(PrintBalance.getMessages().getString("asOf"), "As of : ");
	}
	
	@Test
	public void testYouOweEnglishUS()
	{
		setupPrintBalanceEnUs();
		assertEquals(PrintBalance.getMessages().getString("youOwe"), "You owe the school");
	}
	
	@Test
	public void testCurrEnglishUS()
	{
		setupPrintBalanceEnUs();
		assertEquals(PrintBalance.getMessages().getString("curr"), "9876543.21");
	}
	
	@Test
	public void testFarwellEnglishUS()
	{
		setupPrintBalanceEnUs();
		assertEquals(PrintBalance.getMessages().getString("farwell"), "Good Bye");
	}
	
	@Test
	public void testCurrencyUS()
	{
		setupPrintBalanceEnUs();
		PrintBalance.setCountryCurrency(PrintBalance.getCurrentLocale());
		assertEquals(PrintBalance.getCountryCurrency().toString(), "USD");
	}
	
	/*
	 * French in US testing
	 */
	private void setupPrintBalanceFrUs()
	{
		PrintBalance.setLocale("fr", "US");
		PrintBalance.setMessages(PrintBalance.getCurrentLocale());
	}
	
	@Test
	public void testHelloWorldFrenchUS()
	{
		setupPrintBalanceFrUs();
		assertEquals(PrintBalance.getMessages().getString("helloWorld"), "Bonjour tout le monde");
	}

	@Test
	public void testEnterNameFrenchUS()
	{
		setupPrintBalanceFrUs();
		assertEquals(PrintBalance.getMessages().getString("enterName"), "S'il vous plaît entrer votre nom");
	}
	
	@Test
	public void testPleasedToFrenchUS()
	{
		setupPrintBalanceFrUs();
		assertEquals(PrintBalance.getMessages().getString("pleasedTo"), "Je suis heureux de vous rencontrer");
	}
	
	@Test
	public void testAsOfFrenchUS()
	{
		setupPrintBalanceFrUs();
		assertEquals(PrintBalance.getMessages().getString("asOf"), "En date du:");
	}
	
	@Test
	public void testYouOweFrenchUS()
	{
		setupPrintBalanceFrUs();
		assertEquals(PrintBalance.getMessages().getString("youOwe"), "Vous devez l'école");
	}
	
	@Test
	public void testCurrFrenchUS()
	{
		setupPrintBalanceFrUs();
		assertEquals(PrintBalance.getMessages().getString("curr"), "9876543.21");
	}
	
	@Test
	public void testFarwellFrenchUS()
	{
		setupPrintBalanceFrUs();
		assertEquals(PrintBalance.getMessages().getString("farwell"), "Au revoir");
	}
	
	@Test
	public void testCurrencyUSfr()
	{
		setupPrintBalanceFrUs();
		PrintBalance.setCountryCurrency(PrintBalance.getCurrentLocale());
		assertEquals(PrintBalance.getCountryCurrency().toString(), "USD");
	}
	
	/*
	 * German in US testing
	 */
	private void setupPrintBalanceDeUs()
	{
		PrintBalance.setLocale("de", "US");
		PrintBalance.setMessages(PrintBalance.getCurrentLocale());
	}
	
	@Test
	public void testHelloWorldGermanUS()
	{
		setupPrintBalanceDeUs();
		assertEquals(PrintBalance.getMessages().getString("helloWorld"), "Hallo Welt");
	}

	@Test
	public void testEnterNameGermanUS()
	{
		setupPrintBalanceDeUs();
		assertEquals(PrintBalance.getMessages().getString("enterName"), "Bitte geben Sie Ihren Namen");
	}
	
	@Test
	public void testPleasedToGermanUS()
	{
		setupPrintBalanceDeUs();
		assertEquals(PrintBalance.getMessages().getString("pleasedTo"), "Ich freue mich, Sie kennen zu lernen ");
	}
	
	@Test
	public void testAsOfGermanUS()
	{
		setupPrintBalanceDeUs();
		assertEquals(PrintBalance.getMessages().getString("asOf"), "Stand : ");
	}
	
	@Test
	public void testYouOweGermanUS()
	{
		setupPrintBalanceDeUs();
		assertEquals(PrintBalance.getMessages().getString("youOwe"), "Sie schulden die Schule ");
	}
	
	@Test
	public void testCurrGermanUS()
	{
		setupPrintBalanceDeUs();
		assertEquals(PrintBalance.getMessages().getString("curr"), "9876543.21");
	}
	
	@Test
	public void testFarwellGermanUS()
	{
		setupPrintBalanceDeUs();
		assertEquals(PrintBalance.getMessages().getString("farwell"), "Auf Wiedersehen");
	}
	
	@Test
	public void testCurrencyUSde()
	{
		setupPrintBalanceDeUs();
		PrintBalance.setCountryCurrency(PrintBalance.getCurrentLocale());
		assertEquals(PrintBalance.getCountryCurrency().toString(), "USD");
	}
	
	/*
	 * Due to generality, Hello World, Pleased To, Enter Name, Farwell, As Of, and You Owe will not be tested
	 */
	
	/*
	 * Canada
	 */
	private void setupPrintBalanceEnCa()
	{
		PrintBalance.setLocale("en", "CA");
		PrintBalance.setMessages(PrintBalance.getCurrentLocale());
	}
	
	@Test
	public void testCurrEnglishCA()
	{
		setupPrintBalanceEnCa();
		assertEquals(PrintBalance.getMessages().getString("curr"), "9510121.58");
	}
	
	@Test
	public void testCurrencyCAen()
	{
		setupPrintBalanceEnCa();
		PrintBalance.setCountryCurrency(PrintBalance.getCurrentLocale());
		assertEquals(PrintBalance.getCountryCurrency().toString(), "CAD");
	}
	
	/*
	 * France
	 */
	private void setupPrintBalanceEnFr()
	{
		PrintBalance.setLocale("en", "FR");
		PrintBalance.setMessages(PrintBalance.getCurrentLocale());
	}
	
	@Test
	public void testCurrEnglishFR()
	{
		setupPrintBalanceEnFr();
		assertEquals(PrintBalance.getMessages().getString("curr"), "6938201,87");
	}
	
	@Test
	public void testCurrencyFRen()
	{
		setupPrintBalanceEnFr();
		PrintBalance.setCountryCurrency(PrintBalance.getCurrentLocale());
		assertEquals(PrintBalance.getCountryCurrency().toString(),"EUR");
	}
	
	/*
	 * United Kingdom
	 */
	private void setupPrintBalanceEnGb()
	{
		PrintBalance.setLocale("en", "GB");
		PrintBalance.setMessages(PrintBalance.getCurrentLocale());
	}
	
	@Test
	public void testCurrEnglishGB()
	{
		setupPrintBalanceEnGb();
		assertEquals(PrintBalance.getMessages().getString("curr"),"6131071.64");
	}
	
	@Test
	public void testCurrencyGBen()
	{
		setupPrintBalanceEnGb();
		PrintBalance.setCountryCurrency(PrintBalance.getCurrentLocale());
		assertEquals(PrintBalance.getCountryCurrency().toString(), "GBP");
	}
	
	/*
	 * Germany
	 */
	private void setupPrintBalanceEnDe()
	{
		PrintBalance.setLocale("en", "DE");
		PrintBalance.setMessages(PrintBalance.getCurrentLocale());
	}
	
	@Test
	public void testCurrEnglishDE()
	{
		setupPrintBalanceEnDe();
		assertEquals(PrintBalance.getMessages().getString("curr"), "6938201,87");
	}
	
	@Test
	public void testCurrencyDEen()
	{
		setupPrintBalanceEnDe();
		PrintBalance.setCountryCurrency(PrintBalance.getCurrentLocale());
		assertEquals(PrintBalance.getCountryCurrency().toString(),"EUR");
	}
}
