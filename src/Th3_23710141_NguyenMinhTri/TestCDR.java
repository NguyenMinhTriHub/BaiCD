package Th3_23710141_NguyenMinhTri;
import java.util.GregorianCalendar;
public class TestCDR {
	public static void main(String[] args)throws Exception{
		CDR cdr1=new CDR("23456789","Mua Xuan","Dam Vinh Biet",new GregorianCalendar(2012,11,23),10,5000);
		System.out.println("Them vao mang");
		ListCDM ls=new ListCDM(2);
		ls.themCDR(cdr1);
		CDR cdr2=new CDR("23456781","Mua Xuan","Dam Vinh Biet",new GregorianCalendar(2012,11,23),10,5000);
		CDR cdr3=new CDR("23456780","Mua Xuan","Dam Vinh Biet",new GregorianCalendar(2012,11,23),10,5000);
		CDR cdr4=new CDR("23456785","Mua Xuan","Dam Vinh Biet",new GregorianCalendar(2012,11,23),10,5000);
		ls.themCDR(cdr2);
		ls.themCDR(cdr3);
		ls.themCDR(cdr4);
		for(int i=0;i<ls.count;i++) {
			System.out.println("ls.getAll()[i]");
		}
		System.out.println("Sap xep");
		ls.sapXep();
		for(int i=0;i<ls.count;i++) {
			System.out.println("getAll()[i]");
		}
		System.out.println("Xoa xong");
		ls.xoa("23456785");
		for(int i=0;i<ls.count;i++) {
			System.out.println("getAll()[i]");
		}
		System.out.println("max CD:23456780,Cap nhat gia=6000");
		ls.capNhat("23456780", 6000);
		for(int i=0;i<ls.count;i++) {
			System.out.println("getAll()[i]");
		}
	}
}