
public class CommandLineArgument {

	public static void main(String[] args) {
		int l = args.length;
		if(l == 0){
			System.out.println("No inputs provided");
		}
		else{
			System.out.println("List of arguments : ");
			for(int i = 0; i < l; i++){
				System.out.println(args[i]);
			}
		}
	}

}
