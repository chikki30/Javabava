package MethodOverloading;


    class Test
    {
        public int max(int a,int b)
        {
            return a>b?a:b;
        }

        public int max(int a,int b,int c)
        {
            if(a>b && a>c) return a;
            else if(b>c) return b;
            return c;
        }
    }

    public class MethodOverloading
    {
        public static void main(String[] args)
        {
            Test t=new Test();
            // Print the result of the max method with two parameters
            System.out.println(t.max(10, 5));

            // Print the result of the max method with three parameters
            System.out.println(t.max(10, 15, 5));
        }



        }



