package Ejercicio32;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3};
		int[] b= copiarray(a);
		for(int i =0 ; i<a.length;i++){
			System.out.println(b[i]);
		}
		

	}
	public static int[] copiarray(int[] a){
		int[]b= new int[a.length];
		for(int i=0; i<a.length;i++){
			b[i]=a[i];
		}
		
		
		return b;
	}

}
