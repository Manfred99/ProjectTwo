/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author manfr
 */
public class Dimensions {
    //variable
    private int dim1;
    private int dim2;
    private int dim3;
    private int dim4;
   
    //builders
     public Dimensions() {
     }

    public Dimensions(int dim1, int dim2, int dim3, int dim4) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
        this.dim4 = dim4;
    }
    
    //accesory

    public int getDim1() {
        return dim1;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }

    public int getDim3() {
        return dim3;
    }

    public void setDim3(int dim3) {
        this.dim3 = dim3;
    }

    public int getDim4() {
        return dim4;
    }

    public void setDim4(int dim4) {
        this.dim4 = dim4;
    }
    
    //toString()

    @Override
    public String toString() {
        return "Cuadro con coordenadas{" + "dim1=" + dim1 + ", dim2=" + dim2 + ", dim3=" + dim3 + ", dim4=" + dim4 + " }";
    }
   
}
