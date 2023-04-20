/*
	問題．switch文を使用し、以下のプログラムを作成してください。
			変数に数値を代入

		①2の場合は、「（変数）月は28日です。」
			出力結果：2月は28日です。

		②4，6，9，11の場合は、「（変数）月は30日です。」
			出力例：4月は30日です。

		③その他の場合は、「（変数）月は31日です。」
			出力例：1月は31日です。
 */
package lesson1_11;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//	変数ｘを定義
		int i = 1;
		//	switch文（判定する変数）
		switch (i) {
		//	iが２の時
		case 2:
			//	コンソール出力
			System.out.println(i + "月は28日です。");
			//　breakで処理を抜ける
			break;
		//	iが4,6,9,11の時
		case 4, 6, 9, 11:
			//	コンソール出力
			System.out.println(i + "月は30日です。");
			//　breakで処理を抜ける
			break;
		//	上記以外の時
		default:
			//	コンソール出力
			System.out.println(i + "月は31日です。");
		}
	}

}
