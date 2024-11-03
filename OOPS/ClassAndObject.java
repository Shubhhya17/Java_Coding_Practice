class ClassAndObject{
   public void eat(){
    System.out.println("I can eat");
   }
   public static void main(String args[]){
    System.out.println("1");
    ClassAndObject buzo = new ClassAndObject();
    buzo.eat();
    buzo.run();
   }
   public void run(){
    System.out.println("I am Running");
   }
}