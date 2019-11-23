package com.coding.challenge;

import java.util.Scanner;

public class JumpingCloud {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int []c = new int[n];
		int count = 1;
		int jumpCount = 0;
		
		for(int i=0; i<n; i++) {
			c[i]=sc.nextInt();
		}
		for(int j=0; j < c.length-1; j++) {
            if(c[j+2]==0) {
                if(j==c.length-2){
                    count++;
                    break;
                }
                else{
                j++;
                count++;
                }
            }else if(c[j+1]==0){
                count++;
            }
        }
		System.out.println("Number of needed jumps : "+count);

	}

}
