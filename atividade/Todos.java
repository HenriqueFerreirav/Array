package atividade;

import java.util.Scanner;

public class Array {
	
	public  static  void  principal ( String [] args ) {
		Scanner  leia = novo  Scanner ( System . in );
		
		int  numero [] = novo  int [ 10 ];
		int  x , somaNum = 0 ;
		float  mediaNum ;
		
		para ( x = 0 ; x < 10 ; x ++)
		{
			Sistema . fora . println ( "Entre com um numero: " );
			numero [ x ] = leia . proximoInt ();
			somaNum += numero [ x ];
			
		}
		mediaNum = somaNum / 10 ;
		Sistema . fora . println ( "\nElementos de índice ímpar: " );
		for ( x = 0 ; x < 10 ; x ++) {
			se ( x % 2 == 1 ) {
				Sistema . fora . println ( "\n" + numero [ x ]);	
			}
		}
		
		Sistema . fora . println ( "\nElementos do vetor que são números pares" );
		for ( x = 0 ; x < 10 ; x ++) {
			if ( numero [ x ] % 2 == 0 );
			
		}
		

	
	
		Sistema . fora . println ( "\nSoma de todos os elementos do meu array: " + somaNum );
		Sistema . fora . println ( "\nMédia dos elementos do array: " + mediaNum );
}
	
		int  numeros [] = { 2 , 5 , 1 , 3 , 4 , 9 , 7 , 8 , 10 , 6 };
		 número int ;
		Scanner  leia = novo  Scanner ( System . in );
		{
		Sistema . fora . printf ( "Digite o número que você deseja encontrar: " );
		numero = leia . proximoInt ();
	
	for ( int  x = 0 ; x < numeros . length ; x ++) {
		if ( numeros [ x ] == numero ) {
			Sistema . fora . printf ( "O numero %d esta localizado na posicao: %d" , numeros [ x ], x );
			quebrar ;
		}
		else  if ( x == numeros . length - 1 )
			Sistema . fora . printf ( "\nO número %d não foi encontrado!" , numero );
	}
}

	
}

--------------------------------------------------------------------------------------------------------

package atividade;

import java.util.Scanner;

public class ArrayVetor {
	
	public  static  void  principal ( String [] args ) {
		
		Scanner  leia = novo  Scanner ( System . in );
		
		int  numero [] = novo  int [ 10 ];
		int  x , somaNum = 0 ;
		float  mediaNum ;
		
		para ( x = 0 ; x < 10 ; x ++)
		{
			Sistema . fora . println ( "Entre com um numero: " );
			numero [ x ] = leia . proximoInt ();
			somaNum += numero [ x ];
			
		}
		mediaNum = somaNum / 10 ;
		Sistema . fora . println ( "\nElementos de índice ímpar: " );
		for ( x = 0 ; x < 10 ; x ++) {
			se ( x % 2 == 1 ) {
				Sistema . fora . println ( "\n" + numero [ x ]);	
			}
		}
		
		Sistema . fora . println ( "\nElementos do vetor que são números pares" );
		for ( x = 0 ; x < 10 ; x ++) {
			if ( numero [ x ] % 2 == 0 );
			
		}
		

	
	
		Sistema . fora . println ( "\nSoma de todos os elementos do meu array: " + somaNum );
		Sistema . fora . println ( "\nMédia dos elementos do array: " + mediaNum );
}

}

-------------------------------------------------------------------------------------------------------

package atividade;

import java.util.Scanner;

public class ArrayMatriz {

	public  static  void  principal ( String [] args ) {
		
		Scanner  leia = novo  Scanner ( System . in );
		
		
		
		int  numeros [] = { 2 , 5 , 1 , 3 , 4 , 9 , 7 , 8 , 10 , 6 };
		 número int ;
		
		Sistema . fora . printf ( "Digite o número que você deseja encontrar: " );
		numero = leia . proximoInt ();
		
		for ( int  x = 0 ; x < numeros . length ; x ++) {
			if ( numeros [ x ] == numero ) {
				Sistema . fora . printf ( "O numero %d esta localizado na posicao: %d" , numeros [ x ], x );
				quebrar ;
			}
			else  if ( x == numeros . length - 1 )
				Sistema . fora . printf ( "\nO número %d não foi encontrado!" , numero );

		}
	}
}
