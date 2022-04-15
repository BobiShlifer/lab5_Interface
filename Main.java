package com.company;

import Matrixes.IMatrix;
import Matrixes.SparseMatrix;
import Matrixes.SquareMatrix;
import Matrixes.UsualMatrix;

public class Main {

    public static void main(String[] args) {
        int size = 100;
        UsualMatrix u1 = new UsualMatrix(size, size);
        UsualMatrix u2 = new UsualMatrix(size, size);
        SparseMatrix sm1 = new SparseMatrix(size, size);
        SparseMatrix sm2 = new SparseMatrix(size, size);


        for (int i = 0; i < size; i++) {
            int firstTmpI = (int) ((Math.random() * (size) + 0));
            int firstTmpJ = (int) ((Math.random() * (size) + 0));
            int firstTmpVal = (int) ((Math.random() * (9) + 1));
            u1.setElement(firstTmpI, firstTmpJ, firstTmpVal);
            sm1.setElement(firstTmpI, firstTmpJ, firstTmpVal);
        }

        for (int j = 0; j < size; j++) {
            int secondTmpI = (int) ((Math.random() * (size) + 0));
            int secondTmpJ = (int) ((Math.random() * (size) + 0));
            int secondTmpVal = (int) ((Math.random() * (9 ) + 1));
            u2.setElement(secondTmpI, secondTmpJ, secondTmpVal);
            sm2.setElement(secondTmpI, secondTmpJ, secondTmpVal);
        }

        IMatrix res1 = u1.product(u2);
        IMatrix res2 = sm1.product(sm2);
        u1.setElement(99,99, -1);
        sm1.setElement(99,99,-1);
        System.out.println(u1.equals(sm1));
        System.out.println(u2.equals(sm2));
        System.out.println(res1.equals(res2));
    }
}