import java.util.ArrayList;
import java.util.List;

public class Contest1 {

	public static List<String> splitString(String str, char esc) {
		List<String> result = new ArrayList<String>();

		// Your Logic goes here

		String var = "";
		for(char ch: str.toCharArray()) {
			if(ch == esc) {
				sum.add(var);
				var = "";
				continue;
			}
			var += ch;
		}

		if(!(var.equals(""))) {
			sum.add(var);
		}

		return sum;
	}

	public static void main(String[] args) {
		String str = "My name is 'Ashok Kumar Gowda' I have 12+ years of experience I work for 'IBM India Pvt Ltd' ";

		List<String> result = splitString(str, '\'');

		for (String a : result) {
			System.out.println(a);
		}
	}
}
