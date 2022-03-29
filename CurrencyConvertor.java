package Currency;

 
	
	import java.text.DecimalFormat;
	import java.util.Scanner;
	public class CurrencyConvertor{	
		public static void main(String[] args) {
		

	double euro,rupee,pound,yen,ringgit,dollar;
		


		
		Scanner sc=new Scanner (System.in);
		System.out.println("......WELCOME To Currency Convertor!.......:");
		 System.out.println("1.rupee to euro:\t2.rupee to pound:\t 3.rupee to yen:\t4.rupee to ringgit:\t5.rupee to dollar:");
		 System.out.println("6.pound to rupee:\t7.pound to euro:\t8.pound to yen:\t9.pound to ringgit:\t10.pound to dollar:");
		 System.out.println("11.dollar to rupee:\t12.dollar to euro:\t13.dollarto yen:\t14.dollar to ringgit:\t15.dollar to pound:");
		 System.out.println("16.euro to rupee:\t17.euro to pound:\t18.euro to yen:\t19.euro to dollar:\t20.eupo to ringgit:");
		 System.out.println("21.yen to rupee:\t22.yen to euro:\t23.yento dollar:\t24.yen to dollar:\t25.yen to ringgit:");
		 System.out.println("26.ringgit to rupee:\t27.ringgit to euro:\t28.ringgit to dollar:\t29.dollar to pound:\t30.dollar to yen:");
		
		 

		 		DecimalFormat f=new DecimalFormat("##.##");
		 		System.out.println("How Much money you want to convert?");
		 		double amount=sc.nextDouble();
		 		 System.out.println("which Currency you want to convert?");
		 		 int number =sc.nextInt();
		
		
		 switch(number) {
		 	case 1:
		 	System.out.println("rupee to euro:");
		 	 euro=amount/80;
		 	System.out.println(f.format(euro));
		 	break;
		 	case 2:
			 	System.out.println("rupee to pound:");
			 	 pound=amount/88;
			 	System.out.println(f.format(pound));
			 	break;
		 	case 3:
			 	System.out.println("rupee to yen:");
			 	 yen=amount/0.63;
			 	System.out.println(f.format(yen));
			 	break;
		 	case 4:
			 	System.out.println("rupee to ringgit");
			 	ringgit=amount/88;
			 	System.out.println(f.format(ringgit));
			 	break;
		 	case 5:
			 	System.out.println("rupee to dollar");
			  dollar=amount/88;
			 	System.out.println(f.format(dollar));
			 	break;
		 	case 6:
			 	System.out.println("pound to rupee");
			 	 rupee=amount*88;
			 	System.out.println(f.format(rupee));
			 	break;
		 	case 7:
		 		System.out.println("pound to euro");
		 		euro=amount*1.10;
		 		System.out.println(f.format(euro));
		 		break;
		 	case 8:
			 	System.out.println("pound to yen");
			 	 yen=amount*140.93;
			 	System.out.println(f.format(yen));
			 	break;
		 	case 9:
			 	System.out.println("pound to ringgit");
			 	 ringgit=amount*5.29;
			 	System.out.println(f.format(ringgit));
			 	break;
		 	case 10:
		 		System.out.println("pound to dollar");
			 	 dollar=amount*1.26;
			 	System.out.println(f.format(dollar));
			 	break;
		 	case 11:
			 	System.out.println("dollar to rupee");
			 	 rupee=amount*70;
			 	System.out.println(f.format(rupee));
			 	break;
		 	case 12:
			 	System.out.println("dollar to euro");
			 	 euro=amount*0.87;
			 	System.out.println(f.format(euro));
			 	break;
		 	case 13:
		 		System.out.println("dollar to yen");
			 	 yen=amount*111.087;
			 	System.out.println(f.format(yen));
			 	break;
			 	
		    case 14:
		    	System.out.println("dollar to pound");
			 	 pound=amount*0.78;
			 	System.out.println(f.format(pound));
			 	break;
		 	case 15:
		 		System.out.println("dollar to ringgit");
			 	 ringgit=amount*4.17;
			 	System.out.println(f.format(ringgit));
			 	break;
		 	case 16:
		 		System.out.println("euro to rupee:");
		 		rupee=amount*80;
		 		System.out.println(f.format(rupee));
		 		break;
		 	case 17:
		 		System.out.println("euro to pound:");
		 		pound=amount*0.90;
		 		System.out.println(f.format(pound));
		 		break;
		 	case 18:
		 		System.out.println("euro to yen:");
		 		yen=amount*127.32;
		 		System.out.println(f.format(yen));
		 		break;
		 	case 19:
		 		System.out.println("euro to dollar:");
		 		dollar=amount*1.14;
		 		System.out.println(f.format(dollar));
		 		break;
		 	case 20:
		 		System.out.println("euro to ringgit:");
		 		ringgit=amount*4.78;
		 		System.out.println(f.format(ringgit));
		 		break;
		 	case 21:
		 		System.out.println("yen to rupee:");
		 		rupee=amount*0.63;
		 		System.out.println(f.format(rupee));
		 		break;
		 	case 22:
		 		System.out.println("yen to euro:");
		 		euro=amount*0.007;
		 		System.out.println(f.format(euro));
		 		break;
		 	case 23:
		 		System.out.println("yen to  dollar:");
		 		dollar=amount*0.008;
		 		System.out.println(f.format(dollar));
		 		break;
		 	case 24:
		 		System.out.println("yen to  pound");
		 		pound=amount*0.007;
		 		System.out.println(f.format(pound));
		 		break;
		 	case 25:
		 		System.out.println("yen tor ringgit:");
		 		ringgit=amount*0.037;
		 		System.out.println(f.format(ringgit));
		 		break;
		 	case 26:
		 		System.out.println("ringgit to rupee:");
		 		rupee=amount*16.8;
		 		System.out.println(f.format(rupee));
		 		break;
		 	case 27:
		 		System.out.println("ringgit to euro:");
		 		euro=amount*0.209;
		 		System.out.println(f.format(euro));
		 		break;
		 	case 28:
		 		System.out.println("ringgit to dollar:");
		 		dollar=amount*0.239;
		 		System.out.println(f.format(dollar));
		 		break;
		 		case 29:
			 		System.out.println("ringgit to pound");
			 		pound=amount*0.188;
			 		System.out.println(f.format(pound));
			 		break;
		 		case 30:
			 		System.out.println("ringgit  to yen");
			 		yen=amount*26.63;
			 		System.out.println(f.format(yen));
			 		break;
		 		
		 		default:
		 		System.out.println("Invalid option :");
		 		break;
		}
		 	}
	}
		 
		

		



