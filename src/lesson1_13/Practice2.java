/*
	①配列aを作成し、1～5を格納してください。

	②参照型配列bを作成し、3を表示してください。
		出力結果：3

	③配列a[3]を10で上書きし表示してください。
		出力結果：10

	④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
		出力結果：配列aの要素数は、５です。
 */
package lesson1_13;

public class Practice2 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//	配列aを作成して、１〜５を格納
		int[] a = {1, 2, 3, 4, 5};
		
		//	参照型配列bを作成し、3を表示
		int[] b = a;
		System.out.println(b[2]);
		
		//	配列a[3]を１０で上書き
		a[3] = 10;
		//	配列a[3]を表示
		System.out.println(a[3]);
		
		//	配列aの要素数表示
		System.out.println("配列aの要素数は、" + a.length + "です。");
	}
}
