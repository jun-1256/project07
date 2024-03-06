
public class Equivalent_switch2 {

	public static void main(String[] args) {
		// switch文
		
		// もし、”ある変数”(a)が”赤”の場合、“赤組です“と表示。
		// もしくは、”ある変数”(a)が”白”の場合、”白組です”と表示する。
		String a = "赤";
		
		switch(a) {
			// aが赤の場合という意味
			case "赤":
				System.out.println("赤組です" + "\n");
				break;
				
			// aが白の場合という意味
			case "白":
				System.out.println("白組です");
				break;
		}
		
		// もし、”ある変数”(b)が”赤”の場合、“赤組です“と表示。
		// もしくは、”ある変数”(b)が”白”の場合、”白組です”と表示。
		// それ以外の場合は、”エラーです”と表示する。
		String b = "青";
		
		switch(b) {
			case "赤":
				System.out.println("赤組です");
				break;
				
			case "白":
				System.out.println("白組です");
				break;
				
			default:
				System.out.println("エラーです");
		}

	}

}
