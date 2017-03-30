/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.waruwucoder.view;

import java.util.Scanner;
import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;
import org.jblas.DoubleMatrix;
import org.jblas.Singular;

/**
 *
 * @author Waruwu
 */
public class TestSVD {
    
    public static void main(String[] args){
        
//        double[][] docTermMatrix = new double[10][9];
//        //int [][] docTermMatrix = new int[2][2];
//        Scanner scan = new Scanner(System.in);
//        
//        for(int i=0;i<10;i++){
//            for(int j=0;j<9;j++){
//                //double x = ;
//                docTermMatrix[i][j] = scan.nextDouble();
//            }
//        }
        
//        for(int i=0;i<10;i++){
//            for(int j=0;j<9;j++){
//                System.out.println(docTermMatrix[i][j] + " ");
//            }
//            System.out.println("");
//        }
        
//        DoubleMatrix[] doubleMatrix = Singular.fullSVD(new DoubleMatrix(docTermMatrix));
//        DoubleMatrix U = doubleMatrix[0];
//        DoubleMatrix sigma = doubleMatrix[1];
//        DoubleMatrix V = doubleMatrix[2];
//        
//        //System.out.println(doubleMatrix.);
//        System.out.println(U.rows);
//        
//        System.out.println("\nMatrix U");
//        for(int i=0;i<U.rows;i++){
//            for(int j=0;j <U.columns;j++){
//                System.out.print(U.get(i,j) + " ");
//            }
//            System.out.println("");
//        }
//        
//        System.out.println(sigma.length);
//        System.out.println("\nMatrix V");
//        for(int i=0;i<V.columns;i++){
//            for(int j=0;j <V.rows;j++){
//                System.out.print(V.get(i,j) + " ");
//            }
//            System.out.println("");
//        }
//        
        DoubleMatrix sigmaNewMatrix = new DoubleMatrix(5,5);
        //insert reducedSigma to kxk matrix
        int it = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j < 5; j++){
                sigmaNewMatrix.put(2, 3,1.0);
                System.out.println(sigmaNewMatrix.get(i,j));
            }
        }
        
    }
    
}
