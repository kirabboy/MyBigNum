package mybignumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testcase implements IReceiver{
		public void test(){
			mybignumber.MyBigNumber myBigNumber =new mybignumber.MyBigNumber();
			String s1,s2;

			//Testcase 1
			s1="18112014";
			s2="2018";
			System.out.println(""+s1);
			System.out.println("+");
			System.out.println(""+s2);
			System.out.println(""+myBigNumber(s1,s2));
			assertEquals("18114032",myBigNumber.sum(s1,s2));
			System.out.println("");

			//Testcase 2
			s1="11238921";
			s2="1231231";
			System.out.println(""+s1);
			System.out.println("+");
			System.out.println(""+s2);
			System.out.println(""+myBigNumber(s1,s2));
			assertEquals("12470152",myBigNumber.sum(s1,s2));
			System.out.println("");

			//Testcase 3
			s1="1234";
			s2="123456789";
			System.out.println(""+s1);
			System.out.println("+");
			System.out.println(""+s2);
			System.out.println(""+myBigNumber(s1,s2));
			assertEquals("123458023",myBigNumber.sum(s1,s2));
			System.out.println("");
		}
}
