package analizador_lexico;
import static analizador_lexico.Tokens.*;

%%
%class Lexer
%type Tokens
L = [a-zA-Z_]+
D = [0-9]+
SPACE = [ ,\t,\r,\n]+
%{
    public String lexeme;
%}

%%
int |
float |
string | 
double |
null |
boolean |
humedad |
water |
peso |
eat |
premio |
masaje | 
light |
toy |
candil |
class |
when |
if |
else |
forEach |
for | 
do |
const |
goBack | 
fun |
loop |
and |
or |
not | 
true |
false |
while {lexeme = yytext(); return Reservada;}
{SPACE} {/*Ignore*/}
"#".* {/*Ignore*/}
"/#"~"#/" {/*Ignore*/}
"=" {return Asignacion;}
"==" {return Igual;}
"===" {return ExactamenteIgual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"**" {return Potencia;}
"%" {return Modulo;}
">" {return MayorQue;}
"<" {return MenorQue;}
">=" {return MayorIgualQue;}
"<=" {return MenorIgualQue;}
"=>" {return MayorIgualQue;}
"=<" {return MenorIgualQue;}
"<>" {return DiferenteDe;}
"!=" {return DiferenteDe;}
"and" {return operadorLogicoAND;}
"or" {return operadorLogicoOR;}
"not" {return operadorLogicoNOT;}
"true" {return true;}
"false" {return false;}
"(" {return Parentesis_I;}
")" {return Parentesis_D;}
"{" {return Llave_I;}
"}" {return Llave_D;}
"\n" {return Salto_Linea;}
";" {return fin_sentencia;}
{L}({L} | {D})* {lexeme = yytext(); return Identificador;}
("-"{D}+) | {D}+ {lexeme = yytext(); return Numero;}
[-+]?[0-9]*[.][0-9]+ {lexeme = yytext(); return Flotante}
 . {return ERROR;}