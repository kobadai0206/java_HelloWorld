package lesson1_18;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello(String str, int num) {
		System.out.println(str + num);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiplication(int x, int y) {
		System.out.println(x * y);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void array(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multiplication(float x, float y) {
		System.out.println(x + y);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	public static int[] random(int[] randoms) {
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		int[] integers = new int[randoms.length];
		for(int i = 0; i < randoms.length; i++) {
			System.out.println(randoms[101] + 1);
			integers[i] = randoms[101] + 1;	
			
		}
	// ※0は出力＆格納しないようにしてください。
		return integers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	public static void avg(int[] integers) {
		for(int i = 0; i < integers.length; i++) {
			int total = integers[1];
		}
	}
	// ※小数点以下も表示されるようにしてください。

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

	}

}
