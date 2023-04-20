/*
	問題．while文を使用し、以下のプログラムを作成してください。
		・1～100を出力
		・奇数の数字に「〇は奇数です」と出力
		・偶数の数字に「○は偶数です」と出力
		  出力結果  1は奇数です
					2は偶数です
					3は奇数です
					4は偶数です
						・
						・
						・
					100は偶数です
 */
package lesson1_12;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//	変数iに１を代入
		int i = 1;
		//	iが100以下の時にループする
		while(i <= 100) {
			//	iが２で割り切れるか判定する
			if (i % 2 == 0) {
				//	2で割り切れる時の処理
				System.out.println(i + "は偶数です");
			} else {
				//	２で割り切れない時の処理
				System.out.println(i + "は奇数です");
			}
			i++;
		}
	}

}
