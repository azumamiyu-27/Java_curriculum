package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//1.バイト型　ローカル変数として宣言
		byte numByte;
		
		//短整数型　ローカル変数として宣言
		short numShort;
		
		//整数型 ローカル変数として宣言
		int numInt;
		
		//長整数型 ローカル変数として宣言
		long numLong;
		
		//単精度浮動小数点数型
		float numFloat;
		
		//倍精度浮動小数点数型
		double numDouble;
		
		//文字型
		char numChar;
		
		//文字列型
		String numString;
		
		//ブーリアン型
		boolean numBoolean;
		
		//2.それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください 型　変数名　=　値;
		//バイト型 
	    numByte =0;
		
		//短整数型
		numShort =0;
		
		//整数型
		numInt =0;
		
		//長整数型
		numLong =0;
		
		////単精度浮動小数点数型
		numFloat = 0; 
		
		//倍精度浮動小数点数型
		numDouble = 0;
		
		//文字型
		numChar = 0;
		
		//文字列型
		numString = "0";
		
		 
		//ブーリアン型 初期化
		numBoolean = true;
		 
		 //3.
		// バイト型 10
		numByte=10;
		
		//短整数型 100
		numShort=100;
		
		//整数型 1000
		numInt =1000;
		
		//長整数型 10000
		numLong =10000;
		
		//単精度浮動小数点数型 9.5
		numFloat =9.5f;
		
		//倍精度浮動小数点数型 10.5
		numDouble =10.5;
		
		//文字型 a
		numChar='a';
		
		//文字列型 ハロー
		numString="ハロー";
		
		//ブーリアン型 true
		numBoolean=true;
		
		//4.
		//出力　11110
		System.out.println(numByte + numShort + numInt + numLong);
		//出力 20
		System.out.println(numByte *2 );
		
		//出力 a ハロー true
		System.out.println(numChar +" " +numString + " " + numBoolean);
		
		//出力 11130 数字を全て足す
		System.out.println(Math.round(numByte + numShort + numInt + numLong + numFloat + numDouble));
		
		//出力 10000000000 小数点以外の数字を全てかける
		System.out.println(numByte * numShort * numInt * numLong);
		
		//出力 0.105 10.5割る100をする
		System.out.println(numDouble /100);
		
		//出力 -90 10引く100をするSystem.out.println(num);
		System.out.println(numByte - numShort);
		
		//5.「ハローJAVA43」と表示
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		
		/*6.『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		ローカル変数に代入し○○に入れてください
		『山田太郎 18歳 170.5cm 62.2kg 寿司』*/
		
		//名前の変数を定義
		String numString1 = "山田太郎";
		
		//年齢の変数を定義
		numInt= 18;
		
		//身長の変数を定義
		double height= 170.5;
		
		//体重の変数を定義
		double weight= 62.2;
		
		//食べ物の変数を定義
		String numString2 = "寿司";
		
		
		//format
		//「初めまして○○です」
		System.out.println("初めまして" + numString1 + "です。");
		
		//「年齢は○○歳です」
		System.out.println("年齢は" + numInt + "歳です。");
		
		//「身長は○○cmです」
		System.out.println("身長は" + height + "cmです。");
		
		//「体重は○○kgです」
		System.out.println("体重は" + weight + "kgです。");
		
		//「好きな食べ物は○○です」
		System.out.println("好きな食べ物は" + numString2 + "です。");
		
		//7.6で作成した自己紹介に続いてBMIが出力されるようにしてください"
		//BMIを計算する
		double bmi = weight/((height*height)/10000.0);
		//計算結果を小数点第１位までに丸める
		//「BMIは○○です」
		System.out.println(String.format("BMIは%.1fです。",bmi));
		
		
		//8.6で宣言した変数に再代入し下記の通りコンソールに出力してください"
		////名前の変数を定義
		 numString1 = "鈴木一郎";
		
		//年齢の変数を定義
		numInt= 24;
		
		//身長の変数を定義
		 height= 168.5;
		
		//体重の変数を定義
		 weight= 64.2;
		
		//食べ物の変数を定義
		 numString2 = "オムライス";
		
		//BMIを定義
		 bmi =  weight/((height*height)/10000.0);
		
		//　初めまして鈴木一郎です
		System.out.println("初めまして" + numString1 + "です。");
		
		//　年齢は24歳です
		System.out.println("年齢は" + numInt + "歳です。");
		
		//　身長168.5cmです
		System.out.println("身長は" + height + "ｃｍです。");
		
		//　体重は64.2kgです
		System.out.println("体重は" + weight + "ｋｇです。");
		
		//　好きな食べ物はオムライスです
		System.out.println("好きな食べ物は" + numString2 + "です。");
		
		//　BMIは22.6です
		System.out.println(String.format("BMIは%.1fです。",bmi));
		
		//9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		
		//初めまして鈴木一郎です
		System.out.println("初めまして" + numString1 + "です。");
		//　年齢は48歳です
		int ageInt2 = numInt * 2;
		System.out.println("年齢は" + ageInt2 + "歳です。");
		
		//　身長337.0cmです
		height *= 2;
		System.out.println("身長は" + height + "ｃｍです。");
		
		//　体重は128.4kgです
		weight *= 2;
		System.out.println("体重は" + weight + "ｋｇです。");
		
		//　好きな食べ物はオムライスです
		System.out.println("好きな食べ物は" + numString2 + "です。");
		//　BMIは11.31です
		bmi /= 2;
	    System.out.println(String.format("BMIは%.1fです。",bmi));
		
	    //10.8で使用した年齢が25歳以上ならtrueが出力する
	    int decisionInt = numInt;

	    System.out.println(decisionInt>=25);
	    
	    //11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
	    //文字列型に型変換する
	    int ageInt = numInt;
	    
        String str = String.valueOf(ageInt);
        height= 168.5;
        String str2 = String.valueOf(height);
        weight= 64.2;
        String str3 = String.valueOf(weight);
        System.out.println(str + "・" + str2 + "・" + str3);
        
        //12.11で変換した【年齢・身長】を整数型に変換して出力してください
        //整数型に変換する
        str = "24";
        int numInt1 = Integer.parseInt(str);
        str2 = "168.5";
        double height1 = Double.parseDouble(str);
        System.out.println(numInt1 + "・" + height1);
        
        //13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力する
        System.out.println(25 == numInt1 || 160>= height1);
	}

}
