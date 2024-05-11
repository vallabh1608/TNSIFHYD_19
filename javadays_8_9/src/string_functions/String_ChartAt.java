package string_functions;

public class String_ChartAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="one of the python editor is pycharm";
		int count=0;
		System.out.println("Char at first index:"+text.charAt(0)+"\nChar at lastindex:"+text.charAt(text.length()-1)+"\n");
		for(int i=0;i<=text.length()-1;i++) {
			if(i%2==0) {
				System.out.println("chars at "+i+" positions= "+text.charAt(i));
			}
			if(text.charAt(i)=='o') {
				count++;
			}
		}
		System.out.println("Char freq of 'o' in text: "+count);

	}

}
