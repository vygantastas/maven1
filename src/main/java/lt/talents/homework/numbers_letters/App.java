package lt.talents.homework.numbers_letters;

import java.util.Locale;

import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.RuleBasedNumberFormat;
import com.ibm.icu.util.ULocale;

public class App {
	public static void main(String[] args) {

		System.out.println("Hello World!");
		if (args.length > 0) {
			RuleBasedNumberFormat ltFormatter = new RuleBasedNumberFormat(new Locale(args[0]),
					RuleBasedNumberFormat.SPELLOUT);
			for (int i = 1; i < args.length; i++) {

				System.out.println(ltFormatter.format(Integer.parseInt(args[i]))); // , "%spellout-ordinal"));

			}
		}
	}
}
