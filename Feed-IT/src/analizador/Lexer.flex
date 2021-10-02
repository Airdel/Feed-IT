package analizador;
import java.io.*;
import static analizador.Tokens.*;

%%
%class Lexer
%type Tokens
%line
%column
D = [0-9]
S = \+|\-
L=[a-z]
LE=[A-Za-z]
SE  =[(\)\=\+\-\>\<\.\*\\\|\&\^\@\%\’\_]
Snp  =[\"\#\$\&\¿\?\¨\[\]\{\}\`\~]

iden={ L } ( { L } | { D } | _ ){ 0 , 31 }

alfabeto = (~{SIMBOLOS_ESP}|~{D}|~{L})

idSimbolo = ({L}|{Snp})+
num = {D}+
enteros = {S}?{num}
numDec =  {S}?{num}?\.{num}
numExp =  {S}?{num}?(\.{num})?e{ enteros }
ideConMayus = ({LE}|D)+
ideEmpNum = {D}({LE}|{D})+
ESCAPE=[ \t\r]

cadena = (\')~(\')

errorPuntos = (\.)*{num}?((\.*)|({num}))*

%{
    public String lexema;
    modelos.InformacionLexema c = new modelos.InformacionLexema();
%}

%%

{ESCAPE} {/*Ignore*/}
"--".* {/*Ignore*/}
"---"~"---" { }
<YYINITIAL> "\n" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return SALTO_LINEA;}
<YYINITIAL> "+" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return OPERADOR_MAS;}
<YYINITIAL> "=" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return ASIGNACION;}
<YYINITIAL> "==" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return OPERADOR_IGUALDAD;}
<YYINITIAL> "-" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return OPERADOR_MENOS;}
<YYINITIAL> "*" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return OPERADOR_POR;}
<YYINITIAL> "/" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return OPERADOR_DIVISION;}
<YYINITIAL> "&" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return OPERADOR_Y;}
<YYINITIAL> "|" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return OPERADOR_O;}
<YYINITIAL> "^" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return OPERADOR_OR;}
<YYINITIAL> "!" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return OPERADOR_NEGACION;}
<YYINITIAL> "%" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return OPERADOR_MODULO;}
<YYINITIAL> ";" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return PUNTO_COMA;}
<YYINITIAL> "(" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return PARENTESIS_IZQ;}
<YYINITIAL> ")" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return PARENTESIS_DER;}
<YYINITIAL> ">" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return MAYOR;}
<YYINITIAL> "<" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return MENOR;}
<YYINITIAL> ">=" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return MAYOR_IGUAL;}
<YYINITIAL> "<=" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return MENOR_IGUAL;}
<YYINITIAL> "<>" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return DESIGUAL;}
<YYINITIAL> ":" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return DOS_PUNTOS;}
<YYINITIAL> "," {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return COMA;}
<YYINITIAL> "'" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return COMILLA_SIMPLE;}
<YYINITIAL> "@" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return ARROBA;}

<YYINITIAL> "entero" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_ENTERO;}
<YYINITIAL> "cadena" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_CADENA;}
<YYINITIAL> "iniciar" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_INICIAR;}
<YYINITIAL> "fin" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_FIN;}
<YYINITIAL> "funcion" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_FUNCION;}
<YYINITIAL> "si" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_SI;}
<YYINITIAL> "no" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_NO;}
<YYINITIAL> "mientras" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_MIENTRAS;}
<YYINITIAL> "booleano" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_BOOLEANO;}
<YYINITIAL> "principal" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_PRINCIPAL;}
<YYINITIAL> "@abajo" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_ABAJO;}
<YYINITIAL> "@acelerar" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_ACELERAR;}
<YYINITIAL> "@adelante" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_ADELANTE;}
<YYINITIAL> "@apagar" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_APAGAR;}
<YYINITIAL> "arreglo" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_ARREGLO;}
<YYINITIAL> "@arriba" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_ARRIBA;}
<YYINITIAL> "@atras" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_ATRAS;}
<YYINITIAL> "@calibrar" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_CALIBRAR;}
<YYINITIAL> "@captura" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_CAPTURA;}
<YYINITIAL> "caracter" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_CARACTER;}
<YYINITIAL> "@cargar" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_CARGAR;}
<YYINITIAL> "ciclo" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_CICLO;}
<YYINITIAL> "corto" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_CORTO;}
<YYINITIAL> "decimal" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_DECIMAL;}
<YYINITIAL> "declaracion" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_DECLARACION;}
<YYINITIAL> "@derecha" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_DERECHA;}
<YYINITIAL> "@detener" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_DETENER;}
<YYINITIAL> "@direccionar" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_DIRECCIONAR;}
<YYINITIAL> "ejecutar" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_EJECUTAR;}
<YYINITIAL> "@encender" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_ENCENDER;}
<YYINITIAL> "@esperar" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_ESPERAR;}
<YYINITIAL> "@fijo" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_FIJO;}
<YYINITIAL> "@girar" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_GIRAR;}
<YYINITIAL> "haz" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_HAZ;}
<YYINITIAL> "@imprimir" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_IMPRIMIR;}
<YYINITIAL> "@izquierda" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_IZQUIERDA;}
<YYINITIAL> "@largo" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_LARGO;}
<YYINITIAL> "@leer" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_LEER;}
<YYINITIAL> "llamar" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_LLAMAR;}
<YYINITIAL> "nulo" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_NULO;}
<YYINITIAL> "@parav" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_PARAV;}
<YYINITIAL> "@pin" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_PIN;}
<YYINITIAL> "@regresa" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_REGRESA;}
<YYINITIAL> "retorno" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_RETORNO;}
<YYINITIAL> "@ruta" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_RUTA;}
<YYINITIAL> "@seguir" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_SEGUIR;}
<YYINITIAL> "@video" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_VIDEO;}
<YYINITIAL> "falso" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_FALSO;}
<YYINITIAL> "verdadero" {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return RESERVADA_VERDADERO;}
<YYINITIAL> {cadena} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return CADENA_TEXTO;}
<YYINITIAL> {enteros} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return NUMERO;}
<YYINITIAL> {numDec} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return NUMERO_DECIMAL;}
<YYINITIAL> {numExp} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return NUMERO_EXPONENTE;}
<YYINITIAL> {errorPuntos} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return ERROR_PUNTOS;}
<YYINITIAL> {iden} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return IDENTIFICADOR;}
<YYINITIAL> {iden}[\(][\)] {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return IDENTIFICADOR_ARREGLO;}
<YYINITIAL> {Snp}+ {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return SNP;}
<YYINITIAL> [\@]{iden} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return ERROR_ARROBA;}
<YYINITIAL> {idSimbolo} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return ID_CON_SIMBOLOS;}
<YYINITIAL> [\@]{ideConMayus} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return ERROR_ARROBA_MAYUS;}
<YYINITIAL> [\@]{ideEmpNum} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return ERROR_ARROBA_NUM;}
<YYINITIAL> {ideConMayus} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return ERROR_MAYUS;}
<YYINITIAL> {ideEmpNum} {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return ERROR_ID_NUM;}

 . {c.linea=yyline;c.columna=yycolumn; lexema=yytext(); return ERROR;}
