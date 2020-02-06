
package javaapplication3;

public class MyComplex {
    private double real , imag;
    public MyComplex(){
        real=imag=0.0;
    }
    public MyComplex(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real=real;
    }
    public double getImag(){
       return imag;
    }
    public void setImag(double imag){
        this.imag=imag;
    }
    public void setValue(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
    public String toString(){
        return (real+"+"+imag+"i");
    }
    public boolean isReal(){
        return imag==0;
    }
    public boolean isImaginary(){
        return imag>0;
    }
    public boolean equals(double real,double imag){
        return (this.real ==real &&this.imag==imag);
    }
    public boolean equals(MyComplex another){
        return(real==another.real&&imag==another.imag);
    }
    public double magnitude(){
        return Math.sqrt(real*real+imag*imag);
    }      
    public double argument(){
        return Math.atan2(imag, real);
    }
    public MyComplex add(MyComplex right){
        this.real=this.real+right.real;
        this.imag=this.imag+right.imag;
        return this;
    }
    public MyComplex subtract(MyComplex right){
        this.real=this.real-right.real;
        this.imag=this.imag-right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real+right.real,this.imag+right.imag);
    }
    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real-right.real,this.imag-right.imag);
    }
    public MyComplex multiply(MyComplex right){
        this.real = this.real * right.real - this.imag* right.imag;
        this.imag = this.real * right.imag + this.imag* right.real;
        return this;
    }
    public MyComplex divide(MyComplex right){
      double x = (this.real*right.real+this.imag*right.imag);
     right.imag=-right.imag;
     right = multiply(right);
     this.real=right.real/x;
     this.imag=right.imag/x;
     return this;
    }
    public MyComplex conjugate(){
        imag=-imag;
        return this ;
    }
}
