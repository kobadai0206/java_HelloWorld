package lesson1_5;

public class Curriculum_New_1_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		//  ローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		//	名前”山田太郎”を定義
		String name = "山田太郎";
		//	年齢１８を定義
		int age = 18;
		//	身長170.5を定義
		float height = 170.5f;
		//	体重62.２を定義
		float weight = 62.2f;
		//	好きなもの寿司を定義
		String favorite = "寿司";

		// ↓↓format↓↓
		// 「初めまして○○です」
		// 「年齢は○○歳です」
		// 「身長は○○cmです」
		// 「体重は○○kgです」
		// 「好きな食べ物は○○です」


		// Q1を下記に記載
		// 「初めまして○○です」出力
		System.out.println("初めまして" + name + "です");
		// 「年齢は○○歳です」出力
		System.out.println("年齢は" + age + "歳です");
		// 「身長は○○cmです」出力
		System.out.println("身長は" + height + "cmです");
		// 「体重は○○kgです」出力
		System.out.println("体重は" + weight + "kgです");
		// 「好きな食べ物は○○です」出力
		System.out.println("好きな食べ物は" + favorite + "です");

		// Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
		// 「BMIは○○です」
		// ただし計算は数値を直書きせず、全て変数を使ってすること

		// Q2を下記に記載
		//	BMIを出力
		System.out.println(weight /  ((height / 100) * (height / 100)));

		// Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		// 好きな食べ物はオムライスです
		// BMIは22.6です

		// Q3を下記に記載
		// 名前”鈴木一郎”を再代入
		name = "鈴木一郎";
		// 年齢は24を再代入
		age = 24;
		// 身長168.5を再代入
		height = 168.5f;
		// 体重は64.2再代入
		weight = 64.2f;
		// 好きな食べ物はオムライス再代入
		favorite = "オムライス";

		// 初めまして鈴木一郎です出力
		System.out.println("初めまして" + name + "です");
		// 年齢は24歳です出力
		System.out.println("年齢は" + age + "歳です");
		// 身長168.5cmです出力
		System.out.println("身長は" + height + "cmです");
		// 体重は64.2kgです出力
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物はオムライスです出力
		System.out.println("好きな食べ物は" + favorite + "です");
		// BMIは22.6です出力
		System.out.println(weight /  ((height / 100) * (height / 100)));
		// ↓↓コンソール最終結果↓↓

		//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です
	}

}
