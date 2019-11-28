
		import java.io.BufferedReader;
		import java.io.InputStreamReader;
		import java.io.IOException;


		public class prueba{

		 
		    public static void main(String[] args)
		     throws IOException{
		        BufferedReader en= new BufferedReader(new InputStreamReader(System.in));
		     
		          int n;
		       
		        System.out.println("Digite el valor de n");
		        n=Integer.parseInt(en.readLine());
		         
		        int y=(n-1);
		        for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		        if((i==j)||((i+j)==y)){
		        System.out.print("*");
		        }
		        else{
		        System.out.print(" ");
		        }
		     
		        }System.out.println();
		        }
		    }
		
		
	}
