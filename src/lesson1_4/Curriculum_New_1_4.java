package lesson1_4;

public class Curriculum_New_1_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1 下記9個をローカル変数として宣言のみしてください
		//		・バイト型・短整数型・整数型・長整数型
		// 	・単精度浮動小数点数型・倍精度浮動小数点数型
		//   	・文字型・文字列型
		//	 	・ブーリアン型 
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char CharStr;
		String str;
		boolean bool;

		// Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		byteNum = 0;
		shortNum = 0;
		intNum = 0;
		longNum = 0l;
		floatNum = 0.0f;
		doubleNum = 0.0d;
		CharStr = '\u0000';
		str = null;
		bool = false;
		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください

		// ・バイト型                 10
		// ・短整数型                 100
		// ・整数型                	 1000
		// ・長整数型                 10000
		// ・単精度浮動小数点数型   	 9.5
		// ・倍精度浮動小数点数型		 10.5
		// ・文字型                   a
		// ・文字列型              	 ハロー
		// ・ブーリアン型          	 true
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5d;
		CharStr = 'a';
		str = "ハロー";
		bool = true;
		// Q4 下記の通りにコンソール出力されるようにしてください
		// 必ず変数を使用すること

		// 11110
		// 20.0
		// a ハロー true
		// 11130.0                    数字を全て足す
		// 10000000000                小数点以外の数字を全てかける
		// 0.105                      10.5割る100をする
		// -90                        10引く100をする

		// 11110
		System.out.println(byteNum + shortNum + intNum + longNum);
		// 20.0
		System.out.println(floatNum + doubleNum);
		// a ハロー true
		System.out.println(CharStr + " " + str + " " + bool);
		// 11130.0                    数字を全て足す
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		// 10000000000                小数点以外の数字を全てかける
		System.out.println(byteNum * shortNum * intNum * longNum);
		// 0.105                      10.5割る100をする
		System.out.println(doubleNum / shortNum);
		// -90                        10引く100をする
		System.out.println(byteNum - shortNum);

		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		// String型をint型に変更し、ダブルクォーテーションを外す
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
	}

}
