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
