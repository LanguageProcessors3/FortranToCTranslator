!------------------------------------
! Ejemplo basico de programa sin funciones ni procedimientos
!------------------------------------
PROGRAM Programa ;

! Declaracion de variables
INTEGER :: i1, i2, i3 ;
REAL :: r1 = -0.4, r2 = 234e-2, r3 = 23.498e14 ;
CHARACTER (2) :: c1, c2 = 'SI' ;

! Declaracion de constantes
INTEGER , PARAMETER :: cte1 = 23, cte2 = 04; ! Constantes enteras
REAL , PARAMETER :: cte3 = 56.34 ; ! Constantes reales

! Sentencias del programa
CALL Subrutina0Param ;
CALL Subrutina1Param (34);
CALL Subrutina3Param (sd, 87.4, 'hola que "tal" estas');
concatenacionStrings = 'comilla doble " dentro' + "comilla simple ' dentro" + 'comilla simple '' dentro'
	+ "comilla doble "" dentro" + 'comilla doble " y simple '' dentro' + "comilla simple ' y doble "" dentro";
resultado_aritmetico1 = ( -45 + entero1) * entero2 - entero3 / entero4;
otro_resultado_aritmetico = ( 123.456 * -00.69 + 45.07000 ) / (-123.456 + Funcion2Param ( Funcion1Param ( 34.2 ) , 34 ) 
	* 123E456 ) + ( -64e-77 * -045e6 - 003E-35 ) * 1.23E4 + -000.64E-77 / -045.0e16 - 0.03E-35;

END PROGRAM Programa