package analizador_lexico;
import java_cup.runtime.Symbol;

%%
%class LexerCup
%type java_cup.runtime.Symbol;
%cup
%full
%line
%char
L = [a-zA-Z_]+
D = [0-9]+
SPACE = [ ,\t,\r]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

%%
"\n" {return new Symbol(sym.Linea, yychar, yyline, yytext());;}
main {return new Symbol(sym.Main, yychar, yyline, yytext());;}
int {return new Symbol(sym.Int, yychar, yyline, yytext());}
float {return new Symbol(sym.Float, yychar, yyline, yytext());}
string {return new Symbol(sym.String, yychar, yyline, yytext());} 
double {return new Symbol(sym.Double, yychar, yyline, yytext());}
null {return new Symbol(sym.Null, yychar, yyline, yytext());}
boolean {return new Symbol(sym.boolean, yychar, yyline, yytext());}
humedad {return new Symbol(sym.Humedad, yychar, yyline, yytext());}
fagua {return new Symbol(sym.Fagua, yychar, yyline, yytext());}
peso {return new Symbol(sym.Peso, yychar, yyline, yytext());}
fcomer {return new Symbol(sym.Fcomer, yychar, yyline, yytext());}
premio {return new Symbol(sym.Premio, yychar, yyline, yytext());}
masaje {return new Symbol(sym.Fmasaje, yychar, yyline, yytext());}
fluz {return new Symbol(sym.Fluz, yychar, yyline, yytext());}
fjuguete {return new Symbol(sym.Fjuguete, yychar, yyline, yytext());}
candil {return new Symbol(sym.Candil, yychar, yyline, yytext());}
class {return new Symbol(sym.Class, yychar, yyline, yytext());}
when {return new Symbol(sym.When, yychar, yyline, yytext());}
if {return new Symbol(sym.If, yychar, yyline, yytext());}
else {return new Symbol(sym.Else, yychar, yyline, yytext());}
forEach {return new Symbol(sym.ForEach, yychar, yyline, yytext());}
for {return new Symbol(sym.For, yychar, yyline, yytext());} 
do {return new Symbol(sym.Do, yychar, yyline, yytext());}
const {return new Symbol(sym.Const, yychar, yyline, yytext());}
goBack {return new Symbol(sym.GoBack, yychar, yyline, yytext());} 
fun {return new Symbol(sym.Fun, yychar, yyline, yytext());}
loop {return new Symbol(sym.Loop, yychar, yyline, yytext());}
and {return new Symbol(sym.And, yychar, yyline, yytext());}
or {return new Symbol(sym.Or, yychar, yyline, yytext());}
not {return new Symbol(sym.Not, yychar, yyline, yytext());}
true {return new Symbol(sym.True, yychar, yyline, yytext());}
false {return new Symbol(sym.False, yychar, yyline, yytext());}
while {return new Symbol(sym.While, yychar, yyline, yytext());}
{SPACE} {/*Ignore*/}
"#".* {/*Ignore*/}
"/#"~"#/" {/*Ignore*/}
//---------------------------------------------

"=" {return new Symbol(sym.Asignacion, yychar, yyline, yytext());}
"==" {return new Symbol(sym.Igual, yychar, yyline, yytext());}
"===" {return new Symbol(sym.ExactamenteIgual, yychar, yyline, yytext());}
"+" {return new Symbol(sym.Suma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.Resta, yychar, yyline, yytext());}
"*" {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
"/" {return new Symbol(sym.Division, yychar, yyline, yytext());}
"**" {return new Symbol(sym.Potencia, yychar, yyline, yytext());}
"%" {return new Symbol(sym.Modulo, yychar, yyline, yytext());}
">" {return new Symbol(sym.MayorQue, yychar, yyline, yytext());}
"<" {return new Symbol(sym.MenorQue, yychar, yyline, yytext());}
">=" {return new Symbol(sym.MayorIgualQue, yychar, yyline, yytext());}
"<=" {return new Symbol(sym.MenorIgualQue, yychar, yyline, yytext());}
"=>" {return new Symbol(sym.MayorIgualQue, yychar, yyline, yytext());}
"=<" {return new Symbol(sym.MenorIgualQue, yychar, yyline, yytext());}
"<>" {return new Symbol(sym.DiferenteDe, yychar, yyline, yytext());}
"!=" {return new Symbol(sym.DiferenteDe, yychar, yyline, yytext());}
"and" {return new Symbol(sym.operadorLogicoAND, yychar, yyline, yytext());}
"or" {return new Symbol(sym.operadorLogicoOR, yychar, yyline, yytext());}
"not" {return new Symbol(sym.operadorLogicoNOT, yychar, yyline, yytext());}
"true" {return new Symbol(sym.true, yychar, yyline, yytext());}
"false" {return new Symbol(sym.false, yychar, yyline, yytext());}
"main" {return new Symbol(sym.Main, yychar, yyline, yytext());}
"(" {return new Symbol(sym.Parentesis_A, yychar, yyline, yytext());}
")" {return new Symbol(sym.Parentesis_C, yychar, yyline, yytext());}
"{" {return new Symbol(sym.Llave_A, yychar, yyline, yytext());}
"}" {return new Symbol(sym.Llave_C, yychar, yyline, yytext());}
"\n" {return Salto_Linea;}
";" {return P_coma;}
{L}({L} | {D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
("-"{D}+) | {D}+ {return new Symbol(sym.Numero,  yychar, yyline, yytext());}
[-+]?[0-9]*[.][0-9]+ {return new Symbol(sym.Flotante,  yychar, yyline, yytext());}
 . {return ERROR;}
