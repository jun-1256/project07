
public class Text {

	public static void main(String[] args) {
		// switch文
		// switch文とは、「A==Bという等価式に特化した条件分岐」 
		// もし○○○と×××が等しければ、 △△△と処理しなさい
		// switch (a) {
			// case ●●: 処理内容;
		// break;
		
		// もし、”ある数”(a)が0の場合、“aは0に等しい“と表示。
		// もしくは、”ある数”(a)が1の場合、”aは1に等しい”と表示する。
		int a = 1;
		
		switch(a) {
			case 0:
				System.out.println("aは0に等しい");
				break;
				
			case 1:
				System.out.println("aは1に等しい" + "\n");
				break;
		}
		
		// もし、”ある数”(b)が0の場合、“bは0に等しい“と表示。
		// もしくは、”ある数”(b)が1の場合、”bは1に等しい”と表示。
		// それ以外の場合は、”bは0でも1でもない”と表示する。
		// bがどのcaseにも該当しない場合。defaultは、if文のelseと同じ意味。
		int  b = 5;
		
		switch(b) {
			case 0:
				System.out.println("bは0に等しい");
				break;
				
			case 1:
				System.out.println("aは1に等しい");
				break;
				
			default:
				System.out.println("aは0でも1でもない");
		}

	}

}
