class Lab{
    public static void main(String[]  args){
        float a = 0.7f;
        float b = 0.05f;
        float x = 0.5f;

        double c = Math.pow(x,2)*(x + 1);
        double d = b - Math.pow(Math.sin(x + a),2);

        double R = c/d;
        System.out.println(R);

//        double a = 16.5;
//        double b = 3.4;
//        double x = 0.61;
//
//        double c = b * Math.pow(x,2) - a;
//        double d = Math.pow(Math.E,a*x) - 1;
//
//        double Q = c/d;
//        System.out.println(Q);
    }
}