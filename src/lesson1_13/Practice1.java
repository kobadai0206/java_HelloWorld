/*
	int型の配列aを作成してください。
	配列aに1～5の数字を格納してください。
	繰り返し処理を使用し、
	配列aの数字を順番に表示させてください。

	出力結果：1
			  2
			  3
			  4
			  5
*/
package lesson1_13;

public class Practice1 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//	配列aを宣言
		int[] a;
		//	配列aに５つの要素数を宣言
		a = new int[5];
		//	配列aのインデックス番号と代入する値を定義
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		//	要素数の数だけループする
		for (int i = 0; i < a.length; i++) {
			//	配列aのインデックス番号をループで取得して表示
			System.out.println(a[i]);
		}

	}

}
