public class MathFunctions {
    public MathFunctions(){}
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public float add(float a,float b){
        return a+b;
    }
    public double add(int a,double b){
        return a+b;
    }
    public double add(double a,int b){
        return a+b;
    }
    public long add(long a,long b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }
    public double sub(double a,double b){
        return  a-b;
    }
    public double sub(double a,int b){
        return a-b;
    }
    public double sub(int a,double b){
        return a-b;
    }
    public float sub(float a,float b){
        return a-b;
    }
    public long sub(long a,long b){
        return a-b;
    }

    public int multiply(int a,int b){
        return a*b;
    }
    public double multiply(double a,double b){
        return a*b;
    }
    public double multiply(int a,double b){
        return a*b;
    }
    public double multiply(double a,int b){
        return a*b;
    }

    public int div(int a,int b){
        return a/b;
    }
    public double div(double a,double b){
        return a/b;
    }
    public double div(int a,double b){
        return a/b;
    }
    public double div(double a,int b){
        return a/b;
    }

    public int abs(int a){
        return a>0?a:a*(-1);
    }
    public double abs(double a){
        return a>0?a:a*(-1);
    }

    public int pow(int a){
        return a*a;
    }
    public double pow(double a){
        return a*a;
    }
}
