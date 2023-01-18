package org.jsp.link;

import java.util.Iterator;

public class TwoDArrayMultiplication {
	public static void main(String[] args) {
		int [][] m1= {{1,2,3},{4,5,6}};
		int [][]m2= {{7,8},{9,10},{11,12}};
		int r[][]=new int [2][2],sum=0;
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				for (int k = 0; k < 3; k++) 
				{
					sum=sum+m1[i][k]*m2[k][j];
				
				}
				System.out.print(sum+" ");
				r[i][j]=sum;
				sum=0;
			}
			System.out.println();
		}
		System.out.println("-------");
	int [][]a1= {{7,8,1},{9,10,2}};
	int [][] a2= {{2,3},{4,5},{11,12}};
	int [][]r1= new int [2][2];
	int sum1=0;
	for (int i = 0; i < 2; i++)
	{
		for (int j = 0; j < 2; j++) 
		{
			for (int k = 0; k < 3; k++) 
			{
				sum1=sum1+a1[i][k]*a2[k][j];	
			}
			System.out.print(sum1+" ");
			r1[i][j]=sum1;
			sum1=0;
		}
		System.out.println();
	}
		
	}
	
	}
