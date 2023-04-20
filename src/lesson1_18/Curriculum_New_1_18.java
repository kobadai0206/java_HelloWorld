package lesson1_18;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello(String str, int num) {
		//	コンソールに出力
		System.out.println(str + num);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiplication(int x, int y) {
		//	コンソールに出力
		System.out.println(x * y);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void array(int[] nums) {
		//	受け取った配列をループで回して出力
		for(int i = 0; i < nums.length; i++) {
			//	コンソールに出力
			System.out.println(nums[i]);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multiplication(float x, float y) {
		//	コンソールに出力
		System.out.println(x + y);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] random(int randoms) {
		//	ランダム関数をインスタンス化
		Random rand = new Random();
		
		//	配列の要素数を定義
		int[] integers = new int[randoms];
		//	ループ
		for(int i = 0; i < randoms; i++) {
			//	1～100までのランダムな数字を変数に格納
			int num = rand.nextInt(101) + 1;
			//	コンソールに出力
			System.out.println(num);
			//	乱数を配列に格納
			integers[i] = num;	
		}
		//	配列を戻り値に指定
		return integers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static float avg(int[] integers) {
		//	 int型を初期化
		int total = 0;
		//	ループ処理
		for(int i = 0; i < integers.length; i++) {
			//	total変数に配列の要素を１つずつ足していく
			total += integers[i];
		}
		//	平均点を算出
		float average = (total / integers.length);
		//	コンソールに出力
		System.out.println(average);
		//	平均値を戻り値に指定
		return average;
	}
	

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean bool(float num) {
		boolean b;
		//	真偽値を判定
		if (num >= 50) {
			//	真の場合の処理
			b = true;
		//	偽の場合
		} else {
			//	偽の場合の処理
			b = false;
		}
		return b;
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		//	Q1「Hello JavaSE 11」と出力するメソッドを呼び出す
		hello("Hello JavaSE ", 11);
		System.out.println();
		
		//	Q2 値同士を乗算しコンソールに出力するメソッドを呼び出す
		multiplication(3, 14);
		System.out.println();
		
		// Q3 整数の配列を渡して、受け取った値を順番にコンソールに出力するメソッドを呼び出す
		int[] num = {3, 6, 4, 1, 17};
		array(num);
		System.out.println();
		
		// Q4 Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力メソッドを呼び出し
		multiplication(1.5f, 2.5f);
		System.out.println();
		
		//	Q5 1～100までのランダムな数字を引数の回数分格納して、格納した値を返すメソッド
		int[] average = random(5);
		System.out.println();
		
		// Q6 引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを呼び出す
		float res = avg(average);
		System.out.println();
		
		// Q7 引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力するメソッドを呼び出す
		boolean b = bool(res);
		System.out.println(b);
	}

}
