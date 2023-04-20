/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
				2×1=2 2×2=4…2×9=18
						・
						・
						・
				9×1=9 9×2=18…9×9=81
 */
package lesson1_10;

public class Practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//	変数iを定義
		int i;
		//	変数jを定義
		int j;
		// for文初期値を１、９まで繰り返す、iを１ずつ足し合わせる
		for (i = 1; i <= 9; i++) {
			//	for文上のfor文が１周する時に９周する
			for (j = 1; j <= 9; j++) {
				//	System.out.printで横に表示、iとjを使って九九の計算
				System.out.print(" " + (i + "×" + j) + "=" + (i * j));
			}
			//	改行のため
			System.out.println();
		}
	}

}
