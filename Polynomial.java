package OOPS;


/* Signature of four required functions is given in the code. You can create other functions as well if you need.
 *  Also you should submit your code even if you are not done with all the functions.
 */

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1:
			 result = first.add(second);
			result.print();
			break;
		// Subtract
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {
    static int[] poly;
    int coeff;
    int degree;



    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public Polynomial(){
        poly=new int[5];
    }

    public void setCoefficient(int degree, int coeff){
        if(degree>=poly.length){
            doubleCapacity();
        }
        poly[degree]=coeff;
        this.degree=degree;
        this.coeff=coeff;



    }
    public int coeff(int deg){
        if(deg<poly.length){
            return poly[deg];
        }
        else{
            return 0;
        }
    }

    //double capacity
    private void doubleCapacity(){
        int[] temp=poly;
        poly=new int[2*poly.length];
        for(int i=0;i<temp.length;i++){
            poly[i]=temp[i];
        }
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for(int i=0;i<poly.length;i++){
            if(poly[i]!=0){
                System.out.print(poly[i]+"x"+i+" ");
            }
        }

    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        if(p.poly.length>poly.length){
            doubleCapacity();
        }
        for(int i=0;i<poly.length;i++){
            poly[i]+=p.poly[i];
        }
        return this;

    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        if(p.poly.length>poly.length){
            doubleCapacity();
        }
        for(int i=0;i<poly.length;i++){
            poly[i]-=p.poly[i];
        }
        return this;

    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        Polynomial p1=new Polynomial();
        for(int i=0;i<poly.length;i++){
            for(int j=0;j<p.poly.length;j++){
                int y=poly[i]*p.poly[j];
                int x=i+j;
                int z=p1.coeff(x);
                p1.setCoefficient(x, y+z);

            }
        }
        return p1;
    }

}