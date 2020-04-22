
public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] values= new int[100];

		values[9]=9;
		values[98]=90;
		System.out.println(values[98]);


		String [] val=new String[100];
		val[8]="hello";
		System.out.println(val[8]);
		// another way to define string array
		String [] words=new String[] {"my","name","is", "Pallav"};
		System.out.println(words[2]);

		
		//another way for defining string array
		
		String [] wrd = new String[4];
		wrd[0]="i";
		wrd[1]="am";
		wrd[2]="Dhruv";
		wrd[3]="Kashvi";
		System.out.println(wrd[0]+" "+wrd[1]+" "+ wrd[2]);

		System.out.println(wrd[0]+" "+wrd[1]+" "+ wrd[3]);
				

		double [] dob = new double[10];
		dob[7]=90.88;
		dob[9]=90.88;
		System.out.println(dob[7]);
		System.out.println(dob[9]);


	}
}