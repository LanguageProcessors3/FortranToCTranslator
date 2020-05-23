!------------------------------------
! Ejemplo de programa para nivel de calificacion sobresaliente
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
	END FUNCTION Funcion1Param

	FUNCTION Funcion2Param ( Fun2Param1, Fun2Param2 ) ! Funcion con 2 parametros de llamada
		REAL :: Funcion2Param ;
		INTEGER , INTENT ( IN ) Fun2Param1 ;
		CHARACTER (25) , INTENT ( IN ) Fun2Param2 ;
	END FUNCTION Funcion2Param
END INTERFACE

CALL Subrutina0Param ;
CALL Subrutina1Param (34);
CALL Subrutina3Param (i2, r1, c1);
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
	i1 = b'011' + o'740' * o'101';
	i3 = z'A34' - z'890' / z'106' + z'010';
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
	Sub3Param2 = Funcion1Param(Sub3Param1);
	CALL Subrutina1Param ( i2*i3 );
	Sub3Param3 = Sub3Param2 + i1;

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

SUBROUTINE PruebaIfs ! Subrutina sin parametros de llamada para probar ifs
	! Declaración de variables
	INTEGER :: i1, i2=0, i3 ;

	! Sentencias
	! Sentencias If con una sola sentencia
	IF ( .TRUE. ) CALL Subrutina0Param;
	IF ( .FALSE. ) CALL Subrutina0Param;
	IF ( a == b ) CALL Subrutina0Param;

	! Sentencias If-then con una lista de sentencias
	IF ( .TRUE. .OR. a<b .AND. b>c .EQV. c==d ) THEN
		CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
		concatenacionStrings = 'comilla doble " dentro' + "comilla simple ' dentro";
	ENDIF

	! Sentencias If-then-else con una lista de sentencias y sentencias anidadas
	IF ( .NOT. ( .FALSE. .OR. a<=b) .AND. (b>=c .NEQV. c/=d) ) THEN
		CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
		IF ( .TRUE. ) CALL Subrutina0Param;
		concatenacionStrings = 'comilla doble " dentro' + "comilla simple ' dentro";
	ELSE
		CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
		IF ( .TRUE. .OR. a<b .AND. b>c .EQV. c==d ) THEN
			CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
			concatenacionStrings = 'comilla doble " dentro' + "comilla simple ' dentro";
		ELSE
			CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
			IF ( .TRUE. .OR. a<b .AND. b>c .EQV. c==d ) THEN
				CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
				concatenacionStrings = 'comilla doble " dentro' + "comilla simple ' dentro";
			ENDIF
		ENDIF
	ENDIF
END SUBROUTINE PruebaIfs

SUBROUTINE PruebaDOs ! Subrutina sin parametros de llamada para probar DOs
	! Declaración de variables
	INTEGER :: i1, i2=0, i3 ;
	a = 0;
	! Do simple
	DO contador = 45 , -3 , decremento
		CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
		CALL Subrutina0Param;
	ENDDO

	! Do while simple
	DO WHILE ( .TRUE. .OR. a<b .AND. b>c .EQV. c==d )
		CALL PruebaIfs;
		contador = contador + 1;
	ENDDO

	!Do while con Do simple anidado
	DO WHILE ( .TRUE. .OR. a<b .AND. b>c .NEQV. c==d )
		CALL PruebaIfs;
		DO contador = 45 , -3 , decremento
			CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
			contador = contador + 1;
			CALL PruebaIfs;
			CALL Subrutina0Param;
		ENDDO
	ENDDO

	! Do con while simple anidado
	DO contador = 45 , -3 , decremento
		CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
		CALL Subrutina0Param;
		DO WHILE ( .TRUE. .OR. a<b .AND. b>c .EQV. c==d )
			CALL PruebaIfs;
			contador = contador + 1;
		ENDDO
	ENDDO
END SUBROUTINE PruebaDOs

SUBROUTINE PruebaSELECTs ! Subrutina sin parametros de llamada para probar SELECT
	! Declaración de variables
	INTEGER :: i1, i2=0, i3 ;

	SELECT CASE ( 1.23E4 + -000.64E-77 / -045.0e16  * a )
		CASE ( 'adz' )
			CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
			contador = contador + 1;
			CALL PruebaIfs;
			CALL Subrutina0Param;
		CASE ( 'adz' , 'zzz' )
			CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
			contador = contador + 1;
			CALL PruebaIfs;
			CALL Subrutina0Param;
		CASE ( 'a' : 'z' )
			CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
			contador = contador + 1;
			CALL PruebaIfs;
			CALL Subrutina0Param;
	END SELECT

	SELECT CASE ( 1.23E4 + -000.64E-77 / -045.0e16  * a )
		CASE ( : 1.23E4 )
			CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
			contador = contador + 1;
			CALL PruebaIfs;
			CALL Subrutina0Param;
		CASE ( -000.64E-77 : )
			CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
			contador = contador + 1;
			CALL PruebaIfs;
			CALL Subrutina0Param;
		CASE DEFAULT
			CALL Subrutina1Param ( Funcion1Param(i1)+i2*i3 );
			contador = contador + 1;
			CALL PruebaIfs;
			CALL Subrutina0Param;
	END SELECT
END SUBROUTINE PruebaSELECTs