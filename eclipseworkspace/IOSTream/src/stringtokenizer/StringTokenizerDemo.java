package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "You,are,the,creator,of,your,destiny ";
		StringTokenizer st = new StringTokenizer(s, ",", true);
		// dau , la ki hieu phan cach, co the thay doi, neu khong thi mac dinh la space,
		// true/false la hien/an ki hieu phan cach do
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}
}