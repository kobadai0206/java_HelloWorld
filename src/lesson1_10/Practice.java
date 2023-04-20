/*
問題.for文を使用し、以下のプログラムを作成してください。
	①変数iに1を代入
	②変数iに2ずつ足す処理を10回繰り返す。
		出力結果：  3
					5
					7
					9
					・
					・
					・
					21
 */
package lesson1_10;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//	変数iを定義
		int i;
		//	ループ文、（変数iに１を代入; １ループごとに２増やす;）
		for (i = 3; i <= 21; i += 2) {
			//	コンソールに出力
			System.out.println(i);
		}
	}

}
