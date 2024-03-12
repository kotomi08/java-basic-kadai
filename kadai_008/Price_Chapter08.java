package text.kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		// 変数、初期値の代入
		int userAge = 10;   
		int serviceCost = 1000;
		
		//料金を年代に応じて分岐（swhich文)
		serviceCost = switch(userAge) {
		 case 10 -> 1000;
		 case 20 -> 2000;
		 case 30 -> 3000;
		 case 40 -> 3000;
		 case 50 -> 4000;
		 case 60 -> 4000;
		 case 70 -> 4000;
		 case 80 -> 5000;
		 default -> 500;
		};
		
		//結果を出力
		System.out.println( userAge + "代の料金は" + serviceCost + "円です");
	}

}
