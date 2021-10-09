package analizador;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
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
ESCAPE=[ \t\r\n]+

cadena = (\')~(\')

errorPuntos = (\.)*{num}?((\.*)|({num}))*

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
    modelos.InformacionLexemaS c = new modelos.InformacionLexemaS();
%}

%%

{ESCAPE} {/*Ignore*/}
"--".* {/*Ignore*/}

"booleano"       {return new Symbol(sym.RESERVADA_BOOLEANO, yychar, yyline, yytext());}
("=")            {return new Symbol(sym.ASIGNACION,         yychar, yyline, yytext());}
(">" | "<" | ">="| "<="| "<>" | "==")
                 {return new Symbol(sym.OP_RELACIONAL,     yychar, yyline, yytext());}
("+")            {return new Symbol(sym.OP_MAS,  yychar, yyline, yytext());}
("-" )     {return new Symbol(sym.OP_MENOS,  yychar, yyline, yytext());}
("*" | "/" | "%" )
                 {return new Symbol(sym.OP_ARITMETICO2,  yychar, yyline, yytext());}
("&" | "|" | "^" | "!" | "&" )
                 {return new Symbol(sym.OP_LOGICO,         yychar, yyline, yytext());}
(",") {return new Symbol(sym.COMA, yychar, yyline, yytext());}
("cadena")       {return new Symbol(sym.RESERVADA_CADENA,  yychar, yyline, yytext());}
("corto")        {return new Symbol(sym.RESERVADA_CORTO,   yychar, yyline, yytext());}
("decimal")      {return new Symbol(sym.RESERVADA_DECIMAL, yychar, yyline, yytext());}
("entero")       {return new Symbol(sym.RESERVADA_ENTERO,  yychar, yyline, yytext());}
("iniciar")      {return new Symbol(sym.RESERVADA_INICIAR, yychar, yyline, yytext());}
("fin")          {return new Symbol(sym.RESERVADA_FIN,     yychar, yyline, yytext());}
("si")           {return new Symbol(sym.RESERVADA_SI,     yychar, yyline, yytext());}
("no")           {return new Symbol(sym.RESERVADA_NO, yychar, yyline, yytext());}
("ciclo")        {return new Symbol(sym.RESERVADA_CICLO, yychar, yyline, yytext());}
("haz")          {return new Symbol(sym.RESERVADA_HAZ, yychar, yyline, yytext());}
("principal")    {return new Symbol(sym.RESERVADA_PRINCIPAL, yychar, yyline, yytext());}
("mientras")     {return new Symbol(sym.RESERVADA_MIENTRAS,     yychar, yyline, yytext());}
("llamar")       {return new Symbol(sym.RESERVADA_LLAMAR,     yychar, yyline, yytext());}
("declaracion")  {return new Symbol(sym.RESERVADA_DECLARACION, yychar, yyline, yytext());}
("falso")        {return new Symbol(sym.RESERVADA_FALSO, yychar, yyline, yytext());}
("verdadero")    {return new Symbol(sym.RESERVADA_VERDADERO, yychar, yyline, yytext());}
("funcion")      {return new Symbol(sym.RESERVADA_FUNCION, yychar, yyline, yytext());}
("retorno")      {return new Symbol(sym.RESERVADA_RETORNO, yychar, yyline, yytext());}
/*Solas*/
("@apagar" | "@encender" | "@calibrar" | "@detener" | "@captura" | "@fijo" | "@video" | "@parav")
                 {return new Symbol(sym.ESPECIALES_SOLAS , yychar, yyline, yytext());}
/*@esp @esp */
("@direccionar") 
                 {return new Symbol(sym.ESPECIALES_DOS , yychar, yyline, yytext());}
/*PARAMETEO*/
( "@arriba" | "@abajo" | "@atras" | "@adelante" | "@izquierda" | "@derecha")
                 {return new Symbol(sym.ESPECIALES_PARAMETRO , yychar, yyline, yytext());}
/*ESP ID*/
 ("@girar" | "@acelerar" | "@esperar" | "@seguir" | "@esperar")
                 {return new Symbol(sym.ESPECIALES_ID , yychar, yyline, yytext());}
/*ESP CT*/
( "@leer" | "@imprimir") 
                 {return new Symbol(sym.ESPECIALES_CT , yychar, yyline, yytext());}
/*ESP CT*/
("@ruta")        {return new Symbol(sym.ESPECIALES_RUTA , yychar, yyline, yytext());}
(":")            {return new Symbol(sym.DOS_PUNTOS,        yychar, yyline, yytext());}
(";")            {return new Symbol(sym.PUNTO_COMA,        yychar, yyline, yytext());}
("(")            {return new Symbol(sym.PARENTESIS_IZQ, yychar, yyline, yytext());}
(")")            {return new Symbol(sym.PARENTESIS_DER, yychar, yyline, yytext());}
({enteros})      {return new Symbol(sym.NUMERO,            yychar, yyline, new Integer(yytext()));}
({cadena})       {return new Symbol(sym.CADENA_TEXTO,      yychar, yyline, yytext());}
({iden})         {return new Symbol(sym.IDENTIFICADOR,     yychar, yyline, new String(yytext()));}
({numDec})       {return new Symbol(sym.NUMERO_DECIMAL, yychar, yyline, new Double(yytext()));}
({numExp})       {return new Symbol(sym.NUMERO_EXPONENTE, yychar, yyline, new Double(yytext()));}

/*("==") {return new Symbol(sym.OPERADOR_IGUALDAD, yychar, yyline, yytext());}
("-") {return new Symbol(sym.OPERADOR_MENOS, yychar, yyline, yytext());}
("*") {return new Symbol(sym.OPERADOR_POR, yychar, yyline, yytext());}
("/") {return new Symbol(sym.OPERADOR_DIVISION, yychar, yyline, yytext());}
("&") {return new Symbol(sym.OPERADOR_Y, yychar, yyline, yytext());}
("|") {return new Symbol(sym.OPERADOR_O, yychar, yyline, yytext());}
("^") {return new Symbol(sym.OPERADOR_OR, yychar, yyline, yytext());}
("!") {return new Symbol(sym.OPERADOR_NEGACION, yychar, yyline, yytext());}
("%") {return new Symbol(sym.OPERADOR_MODULO, yychar, yyline, yytext());}
("(") {return new Symbol(sym.PARENTESIS_IZQ, yychar, yyline, yytext());}
(")") {return new Symbol(sym.PARENTESIS_DER, yychar, yyline, yytext());}
(">") {return new Symbol(sym.MAYOR, yychar, yyline, yytext());}
("<") {return new Symbol(sym.MENOR, yychar, yyline, yytext());}
(">=") {return new Symbol(sym.MAYOR_IGUAL, yychar, yyline, yytext());}
("<=") {return new Symbol(sym.MENOR_IGUAL, yychar, yyline, yytext());}
("<>") {return new Symbol(sym.DESIGUAL, yychar, yyline, yytext());}
(",") {return new Symbol(sym.COMA, yychar, yyline, yytext());}
("'") {return new Symbol(sym.COMILLA_SIMPLE, yychar, yyline, yytext());}

("entero") {return new Symbol(sym.RESERVADA_ENTERO, yychar, yyline, yytext());}
("cadena") {return new Symbol(sym.RESERVADA_CADENA, yychar, yyline, yytext());}
("iniciar") {return new Symbol(sym.RESERVADA_INICIAR, yychar, yyline, yytext());}
("fin") {return new Symbol(sym.RESERVADA_FIN, yychar, yyline, yytext());}
("funcion") {return new Symbol(sym.RESERVADA_FUNCION, yychar, yyline, yytext());}
("si") {return new Symbol(sym.RESERVADA_SI, yychar, yyline, yytext());}
("no") {return new Symbol(sym.RESERVADA_NO, yychar, yyline, yytext());}
("mientras") {return new Symbol(sym.RESERVADA_MIENTRAS, yychar, yyline, yytext());}
("para") {return new Symbol(sym.RESERVADA_PARA, yychar, yyline, yytext());}
("booleano") {return new Symbol(sym.RESERVADA_BOOLEANO, yychar, yyline, yytext());}
("principal") {return new Symbol(sym.RESERVADA_PRINCIPAL, yychar, yyline, yytext());}
("@abajo") {return new Symbol(sym.RESERVADA_ABAJO, yychar, yyline, yytext());}
("@acelerar") {return new Symbol(sym.RESERVADA_ACELERAR, yychar, yyline, yytext());}
("@adelante") {return new Symbol(sym.RESERVADA_ADELANTE, yychar, yyline, yytext());}
("@apagar") {return new Symbol(sym.RESERVADA_APAGAR, yychar, yyline, yytext());}
("arreglo") {return new Symbol(sym.RESERVADA_ARREGLO, yychar, yyline, yytext());}
("@arriba") {return new Symbol(sym.RESERVADA_ARRIBA, yychar, yyline, yytext());}
("@atras") {return new Symbol(sym.RESERVADA_ATRAS, yychar, yyline, yytext());}
("@calibrar") {return new Symbol(sym.RESERVADA_CALIBRAR, yychar, yyline, yytext());}
("@captura") {return new Symbol(sym.RESERVADA_CAPTURA, yychar, yyline, yytext());}
("caracter") {return new Symbol(sym.RESERVADA_CARACTER, yychar, yyline, yytext());}
("@cargar") {return new Symbol(sym.RESERVADA_CARGAR, yychar, yyline, yytext());}
("ciclo") {return new Symbol(sym.RESERVADA_CICLO, yychar, yyline, yytext());}
("corto") {return new Symbol(sym.RESERVADA_CORTO, yychar, yyline, yytext());}
("decimal") {return new Symbol(sym.RESERVADA_DECIMAL, yychar, yyline, yytext());}
("declaracion") {return new Symbol(sym.RESERVADA_DECLARACION, yychar, yyline, yytext());}
("@derecha") {return new Symbol(sym.RESERVADA_DERECHA, yychar, yyline, yytext());}
("@detener") {return new Symbol(sym.RESERVADA_DETENER, yychar, yyline, yytext());}
("@direccionar") {return new Symbol(sym.RESERVADA_DIRECCIONAR, yychar, yyline, yytext());}
("ejecutar") {return new Symbol(sym.RESERVADA_EJECUTAR, yychar, yyline, yytext());}
("@encender") {return new Symbol(sym.RESERVADA_ENCENDER, yychar, yyline, yytext());}
("@esperar") {return new Symbol(sym.RESERVADA_ESPERAR, yychar, yyline, yytext());}
("@fijo") {return new Symbol(sym.RESERVADA_FIJO, yychar, yyline, yytext());}
("@girar") {return new Symbol(sym.RESERVADA_GIRAR, yychar, yyline, yytext());}
("@haz") {return new Symbol(sym.RESERVADA_HAZ, yychar, yyline, yytext());}
("@imprimir") {return new Symbol(sym.RESERVADA_IMPRIMIR, yychar, yyline, yytext());}
("@izquierda") {return new Symbol(sym.RESERVADA_IZQUIERDA, yychar, yyline, yytext());}
("@largo") {return new Symbol(sym.RESERVADA_LARGO, yychar, yyline, yytext());}
("@leer") {return new Symbol(sym.RESERVADA_LEER, yychar, yyline, yytext());}
("nulo") {return new Symbol(sym.RESERVADA_NULO, yychar, yyline, yytext());}
("@parav") {return new Symbol(sym.RESERVADA_PARAV, yychar, yyline, yytext());}
("@pin") {return new Symbol(sym.RESERVADA_PIN, yychar, yyline, yytext());}
("@regresa") {return new Symbol(sym.RESERVADA_REGRESA, yychar, yyline, yytext());}
("retorno") {return new Symbol(sym.RESERVADA_RETORNO, yychar, yyline, yytext());}
("@ruta") {return new Symbol(sym.RESERVADA_RUTA, yychar, yyline, yytext());}
("@seguir") {return new Symbol(sym.RESERVADA_SEGUIR, yychar, yyline, yytext());}
("@video") {return new Symbol(sym.RESERVADA_VIDEO, yychar, yyline, yytext());}
("falso") {return new Symbol(sym.RESERVADA_FALSO, yychar, yyline, yytext());}
("verdadero") {return new Symbol(sym.RESERVADA_VERDADERO, yychar, yyline, yytext());}
({cadena}) {return new Symbol(sym.CADENA_TEXTO, yychar, yyline, yytext());}
({enteros}) {return new Symbol(sym.NUMERO, yychar, yyline, yytext());}
({numDec}) {return new Symbol(sym.NUMERO_DECIMAL, yychar, yyline, yytext());}
({numExp}) {return new Symbol(sym.NUMERO_EXPONENTE, yychar, yyline, yytext());}
({iden}) {return new Symbol(sym.IDENTIFICADOR, yychar, yyline, yytext());}
({iden}[\(][\)]) {return new Symbol(sym.IDENTIFICADOR_ARREGLO, yychar, yyline, yytext());}*/

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
