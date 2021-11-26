package analizador_lexico;
import static analizador_lexico.Tokens.*;

%%
%class Lexer
%type Tokens
L = [a-zA-Z_]+
D = [0-9]+
SPACE = [ ,\t,\r]+
%{
    public String lexeme;
%}

%%
main {lexeme = yytext(); return Main;}
int {lexeme = yytext(); return Int;}
float {lexeme = yytext(); return Float;}
string {lexeme = yytext(); return String;} 
double {lexeme = yytext(); return Double;}
null {lexeme = yytext(); return Null;}
boolean {lexeme = yytext(); return Boolean;}
humedad {lexeme = yytext(); return Humedad;}
fagua {lexeme = yytext(); return Fagua;}
peso {lexeme = yytext(); return Peso;}
fcomer {lexeme = yytext(); return Fcomer;}
premio {lexeme = yytext(); return Premio;}
fmasaje {lexeme = yytext(); return Fmasaje;}
fluz {lexeme = yytext(); return Fluz;}
fjuguete {lexeme = yytext(); return Fjuguete;}
candil {lexeme = yytext(); return Candil;}
class {lexeme = yytext(); return Class;}
when {lexeme = yytext(); return When;}
if {lexeme = yytext(); return If;}
else {lexeme = yytext(); return Else;}
forEach {lexeme = yytext(); return ForEach;}
for {lexeme = yytext(); return For;} 
do {lexeme = yytext(); return Do;}
const {lexeme = yytext(); return Const;}
goBack {lexeme = yytext(); return GoBack;} 
fun {lexeme = yytext(); return Fun;}
loop {lexeme = yytext(); return Loop;}
and {lexeme = yytext(); return And;}
or {lexeme = yytext(); return Or;}
not {lexeme = yytext(); return Not;}
true {lexeme = yytext(); return True;}
false {lexeme = yytext(); return False;}
while {lexeme = yytext(); return While;}
{SPACE} {/*Ignore*/}
"#".* {/*Ignore*/}
"/#"~"#/" {/*Ignore*/}
//---------------------------------------------

"=" {lexeme = yytext(); return Asignacion;}
"==" {lexeme = yytext(); return Igual;}
"===" {lexeme = yytext(); return ExactamenteIgual;}
"+" {lexeme = yytext(); return Suma;}
"-" {lexeme = yytext(); return Resta;}
"*" {lexeme = yytext(); return Multiplicacion;}
"/" {lexeme = yytext(); return Division;}
"**" {lexeme = yytext(); return Potencia;}
"%" {lexeme = yytext(); return Modulo;}
">" {lexeme = yytext(); return MayorQue;}
"<" {lexeme = yytext(); return MenorQue;}
">=" {lexeme = yytext(); return MayorIgualQue;}
"<=" {lexeme = yytext(); return MenorIgualQue;}
"!=" {lexeme = yytext(); return DiferenteDe;}
"(" {lexeme = yytext();return Parentesis_A;}
")" {lexeme = yytext();return Parentesis_C;}
"{" {lexeme = yytext();return Llave_A;}
"}" {lexeme = yytext();return Llave_C;}
"\n" {return Salto_Linea;}
";" {return P_coma;}
{L}({L} | {D})* {lexeme = yytext(); return Identificador;}
("-"{D}+) | {D}+ {lexeme = yytext(); return Numero;}
("-"{D}+"."{D}+) | {D}+"."{D}+ {lexeme = yytext(); return Flotante;}
 . {return ERROR;}