package stringtokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedAndToken {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\myfile.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			int count = 0;
			while( (line  = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(line);
				while(st.hasMoreTokens()){
					System.out.println(st.nextToken());
				}
				count ++;
			}
			System.out.println("Amount of String : " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
