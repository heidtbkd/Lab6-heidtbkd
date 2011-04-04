import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
	
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		//gets the locale
		String lang = scanInput.nextLine();
		String count = scanInput.nextLine();
		
		Locale currentLocale = new Locale(lang,count);
		
		ResourceBundle messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		
		//Greeting
		System.out.println(messages.getString("helloWorld"));
		
		//Get User's Name
		//"Please enter your name"
		System.out.println(messages.getString("enterName"));
		String name = scanInput.nextLine();
		//"I am pleased to meet you "
		System.out.println(messages.getString("pleasedTo") + " " + name);
		
		//print today's date, balance and bid goodbye
		//converts to locale
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,currentLocale);
		df.format(today);
		System.out.println(messages.getString("asOf")+ " " + today.toString());
		//"You owe the school $9876543.21"

		System.out.println(messages.getString("youOwe") + " " + messages.getString("curr") + " " + Currency.getInstance(currentLocale));
		//"Good Bye"
		System.out.println(messages.getString("farwell"));
	}
}

