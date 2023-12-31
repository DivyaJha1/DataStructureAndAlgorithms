package OOPS;


    /******************
     * Following is the main function we are using internally.
     * Refer this for completing the ComplexNumbers class
     *

     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);

     int real1 = s.nextInt();
     int imaginary1 = s.nextInt();

     int real2 = s.nextInt();
     int imaginary2 = s.nextInt();

     ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
     ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

     int choice = s.nextInt();

     if(choice == 1) {
     // Add
     c1.plus(c2);
     c1.print();
     }
     else if(choice == 2) {
     // Multiply
     c1.multiply(c2);
     c1.print();
     }
     else {
     return;
     }
     }
     ******************/

    public class complexNumber {
        // Complete this class
        int realNum;
        int imaginaryNum;

        public complexNumber(int x, int y){
            realNum=x;
            imaginaryNum=y;
        }

        void print(){
            if(imaginaryNum>0){
                System.out.print(realNum+" + i"+imaginaryNum);
            }
            else{
                System.out.print(realNum+" - i"+-1*imaginaryNum);
            }
        }

        void plus(complexNumber c){
            realNum=realNum+c.realNum;
            imaginaryNum=imaginaryNum+c.imaginaryNum;
        }

        void multiply(complexNumber c){
            int x=realNum;
            realNum=realNum*c.realNum - imaginaryNum*c.imaginaryNum;
            imaginaryNum=x*c.imaginaryNum + c.realNum*imaginaryNum;
        }



    }


