//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j
package lesson1_14;

public class Practice {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//	string型の配列を作成し、アルファベットa～jまでを格納
		String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		//	配列の要素を１つずつ取得
		for (int i = 0; i < array.length; i++) {
			//	配列の要素を表示
			System.out.println(array[i]);
			//	配列の要素がｄの時に処理を中断
			if (array[i] == "d") {
				break;
			}
		}
		
		//	配列の要素を１つずつ取得
		for (int i = 0; i < array.length; i++) {
			//	配列の要素がiの時に処理をとばす
			if (array[i] == "i") {
				continue;
			}
			//	配列の要素を表示
			System.out.println(array[i]);
		}

	}

}
