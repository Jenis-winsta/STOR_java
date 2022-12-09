/*
 * practical 2
 */
package eSTOR;

public class Pracs_2 {
	//functions (methods) should be inside class but outside main method

	static double myfunc(double x,double degree,int []coeff) {
		// System.out.println("happy"+x);
		//System.out.println("Working of the function");
		double eq=0;
		// System.out.println(degree);
		for(int i=(int) (degree);i>=0;i--) {
			 eq+= coeff[i]*Math.pow(x, i);
			 //System.out.println(coeff[i]+" "+x+"  "+eq);
			 
		}
		//System.out.println("X"+x+"   "+eq);
		//System.out.println("X="+x+"    f("+x+")="+eq);
		return eq;
	}
	public static void main(String[] args) {
		
		System.out.println("winsta");
		double degree =3;
		//int [] coeff= {1,0,-2,-5};
		//-------------3 2  1  0
		int []coeff= {-5,-2,0,1};
		//double x = 0;
		double eq=0;
		double eq1temp=0;
		int x=0;
		double x1=0,x2=0,x0=0;
		String fx="";

		//value of x
		for(x=-10;x<10;x++) {
			
			for(int i=(int) (degree);i>=0;i--) {
				 eq+= coeff[i]*Math.pow(x, i);
				 
			}
			//System.out.println("X"+x+"   "+eq);
			System.out.println("X="+x+"    f("+x+")="+eq);
			if(eq1temp*eq<0) {
				//System.out.println("happy");
				System.out.println((x-1)+" "+x);
				x1=x-1;
				x2=x;
				break;	
			}
//			else if(eq1temp*eq==0) {
//				//continue;
//			}else {//eq1temp*eq<0
//				
//			}
				
			eq1temp= eq;
			eq=0;
		}//end of forloop
		
		
		
		//NOTE: eq is F(x)
		System.out.println("X1="+x1+"		X2="+x2);
		//System.out.println(eq1temp+" "+eq);			--for testing
		//Main Bisection method
		// System.out.println("---------");
		// myfunc(x1,degree,coeff);
		System.out.println("---------");
		//function ready
		while(true) {
			x0=(x1+x2)/2;
			//System.out.println("x0= "+x0);
			//System.out.println(x1-x2);
			if((x2-x1)<0.009) {
				//System.out.println("if conditon");
				break;
				
			}else {
				if(myfunc(x0,degree,coeff)>0) {
					x2=x0;
					fx="positive";
					//System.out.println("Positive f(x)");
				}else {
					x1=x0;
					fx ="Negative";
					//System.out.println("negative f(x)");
				}
			}
			System.out.println("x1="+x1+"    x2="+x2+"    x0="+x0+"    F(x):"+fx);
			
		}
		System.out.println("ans: "+x0);
		System.out.println("-------------------------");
		// double a=1.2121;
		// double b=1.20210;
		// System.out.println(a+b);
		
		
		

		
		
	
		//this is wrong because if the degree change this equation is invalid and we had to find the equation
		//double eq=Math.pow(x,degree)-2*x-5;
		//System.out.println("-------------------------");
		//System.out.println(eq);
		
	}
}
  
