/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点

②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
 */
package lesson1_15;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//	配列int test[][]に成績を格納
		int[] test[] = {{64, 73, 69}, {58, 81, 75}, {86, 68, 79}, {72, 55, 80}};
		//	配列testをループ
		for (int i = 0; i < test.length; i++) {
			//	コンソールに出力
			System.out.println("生徒" + (i + 1) + "：国語" + test[i][0] + "点、数学" + test[i][1] + "点、英語" + test[i][2]);
		}

		//	配列testをループ
		for (int i = 0; i < test.length; i++) {
			// 変数iの数字によって分岐
			switch (i) {
			//	変数iが0の時
			case 0:
				//	コンソールに出力
				System.out.println("国語の平均点は" + (test[0][i] + test[1][i] + test[2][i] + test[3][i]) / (test.length));
				break;
				//	変数iが1の時
			case 1:
				//	コンソールに出力
				System.out.println("数学の平均点は" + (test[0][i] + test[1][i] + test[2][i] + test[3][i]) / (test.length));
				break;
				//	変数iが2の時
			case 2:
				//	コンソールに出力
				System.out.println("英語の平均点は" + (test[0][i] + test[1][i] + test[2][i] + test[3][i]) / (test.length));
				break;
			} 
		}

	}

}
