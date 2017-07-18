import java.util.Scanner;
	
	public class main 
{
	    public static void main(String[] args)
    {
    Scanner nota = new Scanner(System.in);
	    double n1, n2, n3, n4, media, ex, nova_media;
	    
	
	    n1 = nota.nextFloat();
	    n2 = nota.nextFloat();
	    n3 = nota.nextFloat();
	    n4 = nota.nextFloat();
	    media = (n1 + n2 + n3 + n4)/4;

	    if (media >= 7)
            {
	        System.out.println("Aluno Aprovado\n" + media);
	    }
   	    else 
            {
	        System.out.println("Nota de Exame Final: ");
	        ex = nota.nextFloat();
	        nova_media = (media + ex)/2;
	        if(nova_media >= 5)
                {
	            System.out.println("Aluno Aprovado em Exame " + nova_media);
	        } 
                else 
                {
	            System.out.println("Aluno Reprovado " + media2);
	        }
	    }
	    }
	            
	}

