package lesson1_19;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		System.out.println(dog.animal);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog d = new Dog(4);
		System.out.println(d.num);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// LocalDateTimeインスタンス化
		LocalDateTime date = LocalDateTime.now();
		//	表示形式を変更
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy/MM/dd/ H:m:s");
		//	インスタンス化した変数を表示形式に合わせる
		String datetimeformated = datetime.format(date);
		//	出力
		System.out.println(datetimeformated);
        
	}

}
