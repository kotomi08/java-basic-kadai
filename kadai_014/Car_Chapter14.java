package text.kadai_014;

	public class Car_Chapter14 {
		//車クラス（Car_Chapter14)のフィールド
		private int gear  = 1;  //ギア
		private int speed = 10; //スピード	
		
		
		//ギアチェンジのメソッド
		public void gearChenge(int afterGear) {	
			//ギアの変更
			int afterGear1 = 3;
			
			//ギアごとのスピード設定
			speed = switch(afterGear1) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;						
			};
			
			//ギアチェンジ結果を出力
			System.out.println("ギア" + gear + "から" + afterGear1 + "に切替えました" );
		}
		
		//ギアチェンジ後の走行速度を表示するメソッド
		public void run() {
			System.out.println( "速度は時速" + this.speed + "kmです");
		}
	}