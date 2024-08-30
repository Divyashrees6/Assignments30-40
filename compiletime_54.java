package Javaprograms;

public class compiletime_54 {
    void show(int num1)
    {
        System.out.println("number 1 : " + num1);
    }

    void show(int num1, int num2)
    {
        System.out.println("number 1 : " + num1
                           + "  number 2 : " + num2);
    }

    public static void main(String[] args)
    {
    	compiletime_54 obj = new compiletime_54();
      
        obj.show(3); 
      
        obj.show(4, 5); 
    }
}
