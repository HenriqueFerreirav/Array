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


