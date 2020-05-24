!------------------------------------
! Ejemplo de programa para nivel de calificacion aprobado
!------------------------------------
PROGRAM Programa ;

! Declaracion de variables
INTEGER :: i1, i2, i3 ;
REAL :: r1 = -0.4, r2 = 234e-2, r3 = 23.498e14 ;
CHARACTER (2) :: c1, c2 = 'SI' ;

! Declaracion de constantes
INTEGER , PARAMETER :: cte1 = 23, cte2 = 04; ! Contantes enteras
REAL , PARAMETER :: cte3 = 56.34 ; ! Contantes reales

INTERFACE
	SUBROUTINE Subrutina0Param ! Subrutina sin parametros de llamada
	END SUBROUTINE Subrutina0Param

	SUBROUTINE Subrutina1Param ( Sub1Param1 ) ! Subrutina con 1 parametro de llamada
		INTEGER , INTENT ( IN ) Sub1Param1 ;
	END SUBROUTINE Subrutina1Param
	
	SUBROUTINE Subrutina3Param ( Sub3Param1, Sub3Param2, Sub3Param3 ) ! Subrutina con 3 parametros de llamada
		INTEGER , INTENT ( IN ) Sub3Param1 ;
		REAL , INTENT ( OUT ) Sub3Param2 ;
		CHARACTER , INTENT ( INOUT ) Sub3Param3 ;
	END SUBROUTINE Subrutina3Param

	FUNCTION Funcion1Param ( Fun1Param1 ) ! Funcion con 1 parametro de llamada
		INTEGER :: Funcion1Param ;
		REAL , INTENT ( IN ) Fun1Param1 ; 
	END FUNCTION IDENT

	FUNCTION Funcion2Param ( Fun2Param1, Fun2Param2 ) ! Funcion con 2 parametros de llamada
		REAL :: Funcion2Param ;
		INTEGER , INTENT ( IN ) Fun2Param1 ; 
		CHARACTER (25) , INTENT ( IN ) Fun2Param2 ; 
	END FUNCTION IDENT
END INTERFACE

CALL Subrutina0Param ;
CALL Subrutina1Param (34);
CALL Subrutina3Param (sd, 87.4, 'hola que "tal" estas');
concatenacionStrings = 'comilla doble " dentro' + "comilla simple ' dentro" + 'comilla simple '' dentro'
	+ "comilla doble "" dentro" + 'comilla doble " y simple '' dentro' + "comilla simple ' y doble "" dentro";
resultado_aritmetico1 = ( -45 + entero1) * entero2 - entero3 / entero4;
otro_resultado_aritmetico = ( 123.456 * -00.69 + 45.07000 ) / (-123.456 + Funcion2Param ( Funcion1Param ( 34.2 ) , 34 ) 
	* 123E456 ) + ( -64e-77 * -045e6 - 003E-35 ) * 1.23E4 + -000.64E-77 / -045.0e16 - 0.03E-35;

END PROGRAM Programa

SUBROUTINE Subrutina0Param ! Subrutina sin parametros de llamada
	! Declaración de variables
	INTEGER :: i1, i2=0, i3 ;
	! Sentencias
	CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
END SUBROUTINE Subrutina0Param

SUBROUTINE Subrutina1Param ( Sub1Param1 ) ! Subrutina con 1 parametro de llamada
	INTEGER , INTENT ( IN ) Sub1Param1 ;
	
	! Declaración de variables
	REAL :: r1, r2=0.2, r3 ;
	
	! Sentencias
	CALL Subrutina0Param;
	r1 = Sub1Param1;
END SUBROUTINE Subrutina1Param

SUBROUTINE Subrutina3Param ( Sub3Param1, Sub3Param2, Sub3Param3 ) ! Subrutina con 3 parametros de llamada
	INTEGER , INTENT ( IN ) Sub3Param1 ;
	REAL , INTENT ( OUT ) Sub3Param2 ;
	CHARACTER , INTENT ( INOUT ) Sub3Param3 ;
	
	! Declaración de variables
	INTEGER :: i1, i2=0, i3 ;
	
	! Sentencias
	CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );

END SUBROUTINE Subrutina3Param

FUNCTION Funcion1Param ( Fun1Param1 ) ! Funcion con 1 parametro de llamada
	INTEGER :: Funcion1Param ;
	REAL , INTENT ( IN ) Fun1Param1 ; 
	
	! Declaración de variables
	REAL :: r1, r2=0.2, r3 ;
	
	! Sentencias
	CALL Subrutina0Param;
	Funcion1Param = Sub1Param1;
END FUNCTION Funcion1Param

FUNCTION Funcion2Param ( Fun2Param1, Fun2Param2 ) ! Funcion con 2 parametros de llamada
	REAL :: Funcion2Param ;
	INTEGER , INTENT ( IN ) Fun2Param1 ; 
	CHARACTER (25) , INTENT ( IN ) Fun2Param2 ; 
	! Declaración de variables
	REAL :: r1, r2=0.2, r3 ;
	
	! Sentencias
	CALL Subrutina0Param;
	Funcion2Param = Sub1Param1;
END FUNCTION Funcion2Param