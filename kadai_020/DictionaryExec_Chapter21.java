package text.kadai_020;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
	//辞書クラスのインスタンス
	Dictionary_Chapter20 dictionnary = new Dictionary_Chapter20();
	//配列にセット
	String[] words = {"apple","banana","grape","orange"};
	//辞書を調べる
	//メソッドの呼び出し
	dictionnary.seachArray(words);
	//結果を出力
	System.out.println();
	}
}
