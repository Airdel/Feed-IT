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
String | 
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
Const |
goBack | 
fun |
loop |
and |
or |
not | 
while {lexeme = yytext(); return Reserved;}
{SPACE} {/*Ignore*/}
"#".* {/*Ignore*/}
"/#"~"#/".* {/*Ignore*/}
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
"(" {return Parentesis_I;}
")" {return Parentesis_D;}
"\n" {return Salto_Linea;}
{L}({L} | {D})* {lexeme = yytext(); return Identifier;}
("-"{D}+) | {D}+ {lexeme = yytext(); return Number;}
 . {return ERROR;}